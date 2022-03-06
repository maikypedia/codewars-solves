let a = ["1", "1", "1", "1", "3", "1"];
let unique = a.filter((item, i, ar) => ar.indexOf(item) === i);
console.log(unique);