// let header = document.getElementById("heading")

// console.log(header);
// let para = document.getElementsByClassName("paragraph");
// console.log(para);

// let allPara = document.querySelectorAll("p");
// console.log(allPara);


// let heading = document.querySelector("#heading");
// console.log(heading);
// console.log(document.body.firstChild);



// function  Hello(){
//       console.log("Hello world");
// }
// setTimeout(Hello,3000);



// function sum(a,b){
//         return a+b;
// }
// function calculator(a,b,sumCallBack){
//        return  sumCallBack(a,b);
// }

// console.log(calculator(1,2,sum));



//  calculator(1,2,(a,b)=>{
//     console.log(a+b);

// })
// setTimeout(calculator,3000);



// a = prompt("Enter the value of a");
// b =  prompt("ENter the value of b");

// if(a>b){
//       if(a>b  && a>0){
//           if(a%2==0){
//               if(a%2==0  && a<10){
//                        if(a!=9){
//                            if(a>9){
//                               if(a!=b){
//                                   if(a!=b && b!=10  ){
//                                         console.log("Success all the condition");    
//                                   }else{
//                                       console.log("sorry they are not equal to each other")
//                                   }
//                               }else{
//                                     console.log("Sorry b is not  satisying the condition");
//                               }
//                            }else{
//                                  console.log("Sorry a is greater then the 10");
//                            }
//                        }else{
//                              console.log("sorry a is odd");
//                        }
//               }else{
//                   console.log("Sorry a is not eligible");
//               }
//           }
//       }
//       console.log("not found the perfect matches");
// }



// .........................................

// function getData(id,getNextData){
//           setTimeout(()=>{
//                  console.log("data" + id);
//                  if(getNextData){
//                            getNextData();    
//                  }
//           },2000);
// }
//........................................................
// getData(123,()=>{
//          getData(234,()=>{
//              getData(251,()=>{
//                     getData(234);
//              })
//          })
// })


//.....................................................
// let promise = new Promise((resolve, reject) => {
//      console.log("We are fething the data from the server");
//      reject("Some error");
// });


// function  getData(id,getNextData){
//          return new Promise((resolve,reject)=>{
//                   setTimeout(()=>{
//                          console.log("Getting the data");
//                          resolve("Success");
//                           if(getNextData){
//                                 getNextData();
//                           }
//                   },4000);
//          })
// }





// const getPromise =()=>{
//       return  new Promise((resolve,reject)=>{
//               console.log("fetcing the data from the server");
//               resolve("Success");
//         })
// }

// let promise = getPromise();
// if(promise){
//       console.log("Promise has resolved");
// }else{
//        console.log("Promise has rejected");
// }



// const getData = ()=>{
//           return new Promise((resolve,reject)=>{
//                    console.log("Network error");
//                    reject("failed");
//           })
// }

// let data = getData();
// data.then((res)=>{
//        console.log("Promise fullfilled",res); 
// })

// data.catch((err)=>{
//        console.log( "some error is occuring " + err);
// })


// const getData = ()=>{
//      return new Promise((resolve,reject)=>{
//              console.log("Network error");
//              reject("Rejected");
//      })
// }
// let data = getData();

// data.then((res)=>{
//        console.log("Response", res);
// })
// data.catch((err)=>{
//        console.log("Error",err);
// })



// function getData1(){
//        return new Promise((resolve,reject)=>{
//                  setTimeout(()=>{
//                        console.log("Data 1");
//                        resolve("Success");
//                  },3000);

//        })
// }

// console.log("Fething the data 1");
// let data = getData1();
// data.then((res)=>{
//         console.log("Response",res);

// })


// ........................................

// function   getData(id){
//             return new Promise((resolve,reject)=>{
//                      setTimeout(()=>{
//                            console.log("Data has resolved");
//                            reject("error");
//                      },2000);
//             })
// }
// let promise = getData(123);

// promise.then((res)=>{
//         console.log("response",res);
// })
// promise.catch((err)=>{
//           console.log("error",err);
// })




// function getData(){
//         return  new Promise((resolve,reject)=>{
//              setTimeout(()=>{
//                       console.log("Fullfilled");  //  this will call 1st  1
//                        resolve("success");   //3
//              },2000);
//         })
// }
// getData().then((res)=>{
//           console.log("Response",res);  //    2 
          
// }).then((res)=>{
//        console.log("Response",res);  //4
// })


// ........................................................

// function  getData(id){
//           return new Promise((resolve,reject)=>{
//                    setTimeout(()=>{
//                         console.log("Fecthing the data  " ,  id);
//                    reject("Success");
//                    },2000);
//           })
// }

// getData(1).then((res)=>{
//            return getData(2);
// }).then((res)=>{
//         return getData(3);
// }).then((res)=>{
//           return getData(4);
// }).then((res)=>{
//           return getData(5);
// })


// ............................. async await ..................


// function api(){
//           return new Promise((resolve,reject)=>{
//                 setTimeout(() => {
//                        console.log("Weather data");
//                        resolve("Success");    
//                 }, 3000);
//           })
// }

// async  function fetchAllData(){
//           console.log("Fething the data 1");
//           await api();
//           console.log("Fething the data 2");
//           await api();
//           console.log("Fething the data 3");
//           await api();
        
// // }

// function getData(id){
//          return  new Promise((resolve,reject)=>{
//                  setTimeout(()=>{
//                          console.log("Fething data " ,id)
//                          resolve("Success");
//                  },2000);
                   
//          })
// }


// function getData(id,getNextData){
//           setTimeout(()=>{
//                  console.log("Fething the data ", id);
//                  if(getNextData){
//                            getNextData();
//                  }
//           },3000);
// }

// getData(1,()=>{
//           getData(2,()=>{
//                    getData(3,()=>{
//                           getData(4,()=>{
//                                    console.log("Got");
//                           })
//                    })
//           })
// })








// getData(1).then((res)=>{
//           return getData(2);
// }).then((res)=>{
//           return getData(3);
// }).then((res)=>{
//           return getData(4);
// }).then((res)=>{
//           return  getData(5);
// })



function getData( id){
         return new Promise((resolve,reject)=>{
                 setTimeout(()=>{
                         console.log("Getting data ", id);
                 },3000);
         })
         
}



