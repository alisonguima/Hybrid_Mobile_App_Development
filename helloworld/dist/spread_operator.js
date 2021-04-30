"use strict";

var meuArray = [10, 20, 30];

function soma(a, b, c) {
    return a + b + c;
}

console.log(soma.apply(undefined, meuArray));
console.log([].concat(meuArray, [40, 50, 60]));