import * as React from 'react';
import * as monaco from 'monaco-editor-core';

interface IEditorPorps {
    language: string;
}

const Editor: React.FC<IEditorPorps> = (props: IEditorPorps) => {
    let divNode;
    const assignRef = React.useCallback((node) => {
        // On mount get the ref of the div and assign it the divNode
        divNode = node;
    }, []);

    React.useEffect(() => {
        if (divNode) {
            const editor = monaco.editor.create(divNode, {
                language: props.language,
                minimap: { enabled: false },
                autoIndent: true
            });
        }
    }, [assignRef])

    return <div ref={assignRef} style={{ height: '90vh' }}></div>;
}

export { Editor };