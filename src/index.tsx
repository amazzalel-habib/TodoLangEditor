import * as React from 'react';
import * as ReactDOM from 'react-dom';
import {setupLanguage} from "./todo-lang/setup";
import { Editor } from './components/Editor/Editor';
import { languageID } from './todo-lang/config';
import { parseAndGetSyntaxErrors, parseAndGetASTRoot } from './language-service/Parser';

setupLanguage();
const App = () => <Editor language={languageID}></Editor>;

ReactDOM.render(<App/>, document.getElementById('container'));