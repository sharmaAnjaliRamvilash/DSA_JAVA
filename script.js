let expense_name = document.querySelector("#expense-name");
let expense_amount = document.querySelector("#expense-Amount");
let expense_category = document.querySelector("#expense-category");

let add_btn = document.querySelector("#add-btn");

newInfo = [];
let expense_list = document.querySelector("#expense-list");


function renderExpenses(){
       expense_list.innerHTML = "";
       newInfo.forEach(function(expense){
            let li = document.createElement("li");
            li.innerHTML =  `
              <span>${expense.name}</span>
              <span>${expense.amount}</span>
              <span>${expense.category}</span>

            ` ;
            expense_list.appendChild(li);
       })
}


add_btn.addEventListener("click",()=>{
           const name  = expense_name.value;
           const amount = Number(expense_amount.value);
           const category =   expense_category.value
           

            const expense_info = {
                   name,
                   amount,
                   category
            };
           
            newInfo.push(expense_info);
            console.log(newInfo);
            renderExpenses();
})







