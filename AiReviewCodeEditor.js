let container = document.querySelector(".container");
let selectLanguage = document.querySelector("#language");
let mycode = document.querySelector("#code");
let reviewBtn = document.querySelector("#reviewBtn");
let reviewSection = document.querySelector("#reviewSection");
let suggetions = document.querySelector("#suggestions");
let complexity = document.querySelector("#complexity");
let improved = document.querySelector("#improve");
let issue= document.querySelector("#issue");

reviewBtn.addEventListener("click",()=>{
    let langugae = selectLanguage.value;
    let mycode = code.value;
    if(mycode==""){
            alert("Please add some functionality");
            return;
    }
    if(langugae==""){
            alert("Please select any lnaguage");
            return;
    }
    if(langugae=="JAVASCRIPT"){
        if(code.includes("var")){
            issue.innerHTML = "You are using the var keyword instead of using const";
            suggetions.innerHTML = "Suggestisted to use the const keyword";
      
        }else{
              
            issue.innerHTML = "No any problem";
            suggetions.innerHTML = "Using the right approach";
        }

    }
    if(langugae=="JAVA"){
         
    }
    if(langugae=="PYTHON"){

    }
    if(langugae=="C++"){

    }

})