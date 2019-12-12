grammar TodoLangGrammar;

todoExpressions : (addExpression)* (completeExpression)*;

addExpression : ADD TODO STRING EOL;
completeExpression : COMPLETE TODO STRING EOL;

ADD : 'ADD';
TODO : 'TODO';
COMPLETE: 'COMPLETE';
STRING: '"' ~ ["]* '"';
EOL: [\r\n] +;
WS: [ \t] -> skip;
