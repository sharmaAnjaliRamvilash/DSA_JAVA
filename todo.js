let inputTxt = document.querySelector("#inputTxt");
let btn = document.querySelector("#addbtn");
let taskList = document.querySelector("#taskList");


btn.addEventListener("click",()=>{
    let tasks = [];
        let task = inputTxt.value;
        tasks.push(task);
        localStorage.setItem("task",JSON.stringify(tasks));
        if(task==""){
              alert("Please enter the task");
              return;
        }
        let li =  document.createElement("li");
        let removeBtn  = document.createElement("button");
        removeBtn.innerHTML = "REMOVE";
        li.innerHTML = task;
        li.appendChild(removeBtn);

        li.addEventListener("click",()=>{
                li.classList.toggle("completed");
        })

        removeBtn.addEventListener("click",()=>{
                li.remove();
        })
        taskList.appendChild(li);
})