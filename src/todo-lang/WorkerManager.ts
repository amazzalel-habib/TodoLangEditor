import * as monaco from "monaco-editor-core";

import Uri = monaco.Uri;
import { TodoLangWorker } from './todoLangWorker';
import { languageID } from './config';

export class WorkerManager {

	private worker: monaco.editor.MonacoWebWorker<TodoLangWorker>;
	private workerClientProxy: Promise<TodoLangWorker>;

	constructor() {
		this.worker = null;
	}

	private getClientproxy(): Promise<TodoLangWorker> {

		if (!this.workerClientProxy) {
			this.worker = monaco.editor.createWebWorker<TodoLangWorker>({
				// module that exports the create() method and returns a `JSONWorker` instance
				moduleId: 'TodoLangWorker',
				label: languageID,
				// passed in to the create() method
				createData: {
					languageId: languageID,
				}
			});

			this.workerClientProxy = <Promise<TodoLangWorker>><any>this.worker.getProxy();
		}

		return this.workerClientProxy;
	}

	async getLanguageServiceWorker(...resources: Uri[]): Promise<TodoLangWorker> {
		const _client: TodoLangWorker = await this.getClientproxy();
		await this.worker.withSyncedResources(resources)
		return _client;
	}
}
