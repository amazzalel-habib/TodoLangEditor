import * as monaco from "monaco-editor-core";
import { WorkerAccessor } from "./setup";

export default class TodoLangFormattingProvider implements monaco.languages.DocumentFormattingEditProvider {

    constructor(private worker: WorkerAccessor) {

    }

    provideDocumentFormattingEdits(model: monaco.editor.ITextModel, options: monaco.languages.FormattingOptions, token: monaco.CancellationToken): monaco.languages.ProviderResult<monaco.languages.TextEdit[]> {
        return this.format(model.uri, model.getValue());
    }

    private async format(resource: monaco.Uri, code: string): Promise<monaco.languages.TextEdit[]> {
        // get the worker proxy
        const worker = await this.worker(resource)
        // call the validate methode proxy from the langaueg service and get errors
        const formattedCode = await worker.format(code);
        const endLineNumber = code.split("\n").length + 1;
        const endColumn = code.split("\n").map(line => line.length).sort((a, b) => a - b)[0] + 1;
        console.log({ endColumn, endLineNumber, formattedCode, code })
        return [
            {
                text: formattedCode,
                range: {
                    endColumn,
                    endLineNumber,
                    startColumn: 0,
                    startLineNumber: 0
                }
            }
        ]
    }
}