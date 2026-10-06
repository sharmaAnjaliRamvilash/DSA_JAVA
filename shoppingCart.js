let products = [
    {
        name:"Jeans",
        price:400
    },
    {
          name:"T-Shirt",
          price:500,
    },
    {
         name: "Trouser",
         price:600
    },
    {
        name:"Top",
        price:500
           
    }
];
let cart  = [];
let productsList = document.querySelector("#products");
products.forEach(function(product){
      let div = document.createElement("div");
      div.innerHTML = `
        <h2>${product.name}</h2>
        <h3>${product.price}</h3>
      `;
      let btn = document.querySelector("button");
      btn.addEventListener("click",()=>{
         cart.push(product);
         console.log(product);      
      }) 
      productsList.appendChild(div);
})


function renderCart(){
    let cartContainer = document.querySelector("#cartContainer");
    cartContainer.innerHTML = "";
        cart.forEach(function(items,index){
                let div = document.createElement("div");
                div.innerHTML = `
                      <h2>${items.name}</h2>
                      <h3>${items.price}</h3>
                `;
                cartContainer.innerHTML = div;
                
        })
        

       
}
