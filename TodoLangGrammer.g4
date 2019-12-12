grammar TodoLang;

todoExpressions : (addExpression)* (completeExpression)*;

addExpression : ADD TODO STRING EOL;
completeExpression : COMPLETE TODO STRING EOL;

ADD : A D D;
TODO : T O D O;
COMPLETE: C O M P L E T E;
STRING: '"' ~ ["]* '"';
EOL: [\r\n] +;
WS: [ \t] -> skip;