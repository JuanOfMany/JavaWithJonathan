
interface Mountain {
    name : string;
    height : number;
}

let mountains : Mountain[] = [];

let kilamanjaro = {
    name: 'Kilimanjaro',
    height: 19341
} 

let everest = {
    name: 'Everest',
    height: 29029
}

let denali = {
    name : 'Denali',
    height: 20310
}

mountains.push(kilamanjaro, everest, denali);

function findNameOfTallestMountain(mountains : Mountain[]) : Mountain {
    let tallestMountain : Mountain = {
        height: 0,
        name: 'None found.'
    };
    mountains.forEach(mountain => {
        if (mountain.height > tallestMountain.height) {
            tallestMountain = mountain;
        }
    })
    return tallestMountain;
}

let tallestMountain : Mountain = findNameOfTallestMountain(mountains);

console.log({tallestMountain});

interface Product {
    name : string,
    price : number
}

let products : Product[] = [];

products.push(
    {name: 'motor', price: 10},
    {name: 'sensor', price: 12.50},
    {name: 'LED', price: 1},
)

function calculateAverageProductPrice(products : Product[]) : number {
    let averagePrice : number = 0;
    let total : number = products.reduce(
        (accumulator : number, currentValue : Product) => accumulator + currentValue.price, 0
      );

    averagePrice = total/products.length;
    
    return averagePrice;
}

let averagePrice : number = calculateAverageProductPrice(products);

console.log({averagePrice});

interface InventoryItem {
    product : Product, 
    quantity: number
}

let inventory : InventoryItem[] = [];

inventory.push(
    {product: {name: 'motor', price: 10}, quantity: 10},
    {product: {name: 'sensor', price: 12.50}, quantity: 4},
    {product: {name: 'LED', price: 1}, quantity: 20}
)

function calculateInventoryValue(inventory : InventoryItem[]) : number {
    return inventory.reduce((total : number, currentProduct : InventoryItem) => total + (currentProduct.product.price) * currentProduct.quantity, 0);
}

let inventoryValue : number = calculateInventoryValue(inventory)

console.log({inventoryValue});