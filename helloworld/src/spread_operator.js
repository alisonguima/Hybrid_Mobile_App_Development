const meuArray = [10, 20, 30]

function soma(a, b, c) {
    return a + b + c
}

console.log(soma(...meuArray));
console.log([...meuArray, 40, 50, 60]);