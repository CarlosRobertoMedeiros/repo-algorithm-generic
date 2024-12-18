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

function total(product){
    return product.price * product.quantity
}

function updatePrice(product, percentage){
    product.price = product.price * (1 + percentage / 100 )
}


const p1 = new Product("Laptop", 1000.0, 5);
const p2 = new Product("Headphone", 200.0, 2);

const total1 = total(p1)
const total2 = total(p2)


console.log(total1)
console.log(total2)

updatePrice(p1, 10);
updatePrice(p2, 10);

console.log(p1.price)
console.log(p2.price)


