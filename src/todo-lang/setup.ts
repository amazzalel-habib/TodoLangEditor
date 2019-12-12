import * as monaco from "monaco-editor-core";
import { languageExtensionPoint, languageID } from "./config";
import { richLanguageConfiguration, monarchLanguage } from "./TodoLang";

export function setupLanguage() {
    (window as any).MonacoEnvironment = {
        getWorkerUrl: function (moduleId, label) {
            return './editor.worker.js';
        }
    }
    monaco.languages.register(languageExtensionPoint);
    monaco.languages.onLanguage(languageID, () => {
        monaco.languages.setMonarchTokensProvider(languageID, monarchLanguage);
		monaco.languages.setLanguageConfiguration(languageID, richLanguageConfiguration);
    });
}