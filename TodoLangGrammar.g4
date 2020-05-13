grammar TodoLangGrammar;

todoExpressions : (addExpression)* (completeExpression)*;

addExpression : ADD TODO STRING;
completeExpression : COMPLETE TODO STRING;

ADD : 'ADD';
TODO : 'TODO';
COMPLETE: 'COMPLETE';
STRING: '"' ~ ["]* '"';
EOL: [\r\n] + -> skip;
WS: [ \t] -> skip;