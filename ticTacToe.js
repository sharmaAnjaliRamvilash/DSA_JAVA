
// let cell  = document.querySelectorAll(".box");
// let allBoxes = document.querySelector(".boxes");
// let game = document.querySelector(".game");
// let reset = document.querySelector("#reset");
// let currentStatus = document.querySelector(".status");
// let currentPlayer = document.querySelector("#currentPlayer");



// const combinations = [
//     ["0","1","2"],
//     ["3","4","5"],
//     ["6","7","8"],
//     ["0","4","8"],
//     ["2","4","6"],
//     ["0","3","6"],
//     ["1","4","7"],
//     ["2","5","8"]
// ];

// let gameActive= true;
//   const board = Array(9).fill(null);
// let player = "X";


// function handleClick(e){
    
//         const cell = e.textContent;
//         const index = Number(cell.dataset.index);
//         const result = checkResult();
//         if(result){
//               finishGame(result);
//               return;
//         }
//         if(!gameActive){
//             return;
              
//         }
//         switchPlayer();
      
//         board[index] = player;
//         cell.textContent = player;
// }

// function checkResult(){
      
//     for(const combination of combinations){
//                const [a,b,c] = combination;
//                if(board[a]!=null  && board[a]==board[b]  && board[a]==board[c]){
//                      return {
//                            type:"WIN",
//                            player:board[a],
//                            combination
//                      }
//                }

//     }
//     if(board.includes(null)){
//             return {
//                     type:"DRAW"
//             }
//     }
//     return null;
// }

// function finishGame(result){
//         gameActive = false;
//         for(const combination of combinations){
//                if(result.type=="WIN"){
//                     currentStatus.textContent = `
//                        Congratulations ${player} won the game
//                     `;
//                     highlightCombination(result.combination);
//                }  else{
//                       currentStatus.textContent = `
//                          Sorry game draw
//                       `;
//                }    
//         }
// }
// function highlightCombination(combination){
//         combination.forEach((items)=>{
//                cell[items].classList.add("win");
//         })

// }

// function switchPlayer(){
//         player = player==="X"?"0":"X";
//         currentPlayer.textContent = `
//           Cuurent Term ${player}'s turn
//         `;
// }



// reset.addEventListener("click",()=>{
//      gameActive = false;
//      board = Array(9).fill(null);
//      player = "X";
//      currentStatus.textContent = `
//           Player X's Turn
//      `
//      cell.forEach(c=>{
//           c.textContent = ""  ;
//           cell.classList.remove("win");
//      })
         
// });

// cell.forEach(function(cell){
//         cell.addEventListener("click",handleClick);
// })






