"use strict";
let number = 40;
try {
    number = 99;
}
catch (err) {
    console.log(err);
}
console.log(number);
// expected output: 42
//Assigning Object
const obj = {
    name: "vignesh"
};
console.log(obj.name);
obj.name = "G";
console.log(obj.name);
