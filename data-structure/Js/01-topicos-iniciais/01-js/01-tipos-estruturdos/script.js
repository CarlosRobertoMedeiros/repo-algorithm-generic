//Usando como Classe Atualmente Modulo Sintax Suggar
class Product {

    constructor(name, price, quantity){
        this.name = name
        this.price = price
        this.quantity = quantity
    }

    toString() {
        return `${this.name}, $${this.price.toFixed(2)}, ${this.quantity}`
    }
}

const p1 = new Product("Laptop", 1000.0, 5);
const p2 = new Product("Headphone", 200.0, 2);

console.log(p1.toString())
console.log(p2.toString())


//Usando como era antigamente como funcao construtora

function ProductSampleTwo(name, price, quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;

    this.toString = function (){
        return `${this.name}, $${this.price.toFixed(2)}, ${this.quantity}` 
    }
}

const p3 = new ProductSampleTwo("Laptop", 1000.0, 5);
const p4 = new ProductSampleTwo("Headphone", 200.0, 2);

console.log(p3.toString())
console.log(p4.toString())