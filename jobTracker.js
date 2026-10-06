let jobForm = document.querySelector("#jobForm");
let company = document.querySelector("#company");
let jobRole = document.querySelector("#role");
let date = document.querySelector("#date");
let status = document.querySelector("#options");
let submit = document.querySelector("#submit");
let application= document.querySelector("#application");
let totalCount = document.querySelector("#totalCount");
let interviewCount = document.querySelector("#interviewCount");
let selectedCount = document.querySelector("#selectedCount");
let rejectedCount = document.querySelector("#rejectedCount");
let Applied = document.querySelector("#Applied");
let search = document.querySelector("#search");
let statusFilter = document.querySelector("#statusFilter");
let sortBy = document.querySelector("#sortBy");
let currentInfo = [];
search.addEventListener("input",()=>{
         let text = search.value.toLowerCase();
         let selectedItems = currentInfo.filter(function(items){
                return(
                       items.company.toLowerCase().includes(text)  || items.role.toLowerCase().includes(role)
                );
         })
         renderApplication(currentInfo=selectedItems);
    
})
statusFilter.addEventListener("change",()=>{
    let selectedFilter = statusFilter.value;
    let currentFilter = currentInfo.filter(function(current){
            return current.status===selectedFilter;
    })
    renderApplication(currentFilter);

})
function updateDashboard() {
    totalCount.textContent = currentInfo.length;
    interviewCount.textContent = currentInfo.filter(function (application) {
        return application.status === "Interview";
    }).length;
    selectedCount.textContent = currentInfo.filter(function (application) {
        return application.status === "Selected";
    }).length;
    rejectedCount.textContent = currentInfo.filter(function (application) {
        return application.status === "Rejected";
    }).length;
}
updateDashboard();


function renderApplication() {
    application.innerHTML = "";
     if(application.innerHTML===""){
           application.innerHTML = `<p>${"No application found here"}</p>`
           return;
     }
    
    currentInfo.forEach(function (current,index) {
        let div = document.createElement("div");
        div.innerHTML = `
         <h2>${current.company}</h2>
         <h2>${current.role}</h2>
         <h2>${current.date}</h2>
         <h2>${current.status}</h2>

         <div> 
              <button onClick="editApplication(${current.id})">Edit</button>
              <button onClick="deleteApplication(${current.id})">Delete</button>
         </div>
      `;
      application.append(div);

    })
}
renderApplication();
function deleteApplication(id){
        currentInfo = currentInfo.filter(function(current){
                return current.id!==id;
        })
        updateDashboard();
        renderApplication();

}
function editApplication(id){
   
     const newApplication = currentInfo.find(function(application){
            return  application.id==id;
     });
     if(!newApplication){
          alert("Nothing to update");
          return;
     }
     let company  = prompt("Enter the company name please", newApplication.company);
     let role =  prompt("Enetr your rols please ", newApplication.role);
     if(company  && role){
             newApplication.company = company;
             newApplication.role = role;

             renderApplication();
     }
     

}
jobForm.addEventListener("submit", (e) => {
    e.preventDefault();
    let div = document.createElement("div");
    const formApplication = {
        id:Date.now(),
        company: company.value,
        role: jobRole.value,
        date: date.value,
        status: status.value
    };
    currentInfo.push(formApplication);

    currentInfo.forEach(function (obj, index) {
        div.innerHTML = `
              <h1>${obj.company}</h1>
              <h2>${obj.role}</h2>
              <h3>${obj.date}</h3>
          `;
        application.appendChild(div);
    })

})


function applyFilter(){
    let searchText =   search.value.toLowerCase();
    let statusText = statusFilter.value;
    let filteredData = currentInfo.forEach(function(current){
           let matchSearch = current.company.value.toLowerCase().includes(searchText) || current.role.value.toLowerCase().includes(searchText);
           let matchStatus = statusText=="All"  || current.status===statusText;
           return matchSearch  && matchStatus;
    })
         

    renderApplication(filteredData);

}
applyFilter();









