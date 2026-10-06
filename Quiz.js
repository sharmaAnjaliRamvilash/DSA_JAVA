const questions = [
    {
        question: "what keywords declares a variable?",
        answer: ["var", "String", "int", "variable"],
        correct: "var"
    },
    {
        question: "Which method is used to add an element at the end of an array?",
        answer: ["push()", "pop()", "shift()", "slice()"],
        correct: "push()"
    },
    {
        question: "Which symbol is used for strict equality?",
        answer: ["=", "==", "===", "!="],
        correct: "==="
    }
];

let questions_container = document.querySelector(".questions");
let answers = document.querySelector(".answers");
let nextBtn = document.querySelector(".next");
let score = document.querySelector(".score");
let questionIndex = 0;
let currentScore = 0;



function showOptions() {
    let arr = [];
    arr = questions[questionIndex].answer;
    arr.forEach(function (curr) {
        let btn = document.createElement("button");
        btn.innerHTML = curr;
        btn.addEventListener("click", () => {
            if (curr == questions[questionIndex].correct) {
                currentScore++;
                score.innerHTML = currentScore;
            }
        })

        answers.appendChild(btn);
    })

}

function showQuestions() {
    let current = questions[questionIndex];
    questions_container.innerHTML = current.question;
    current.answer.forEach(function (option) {
        let btn = document.createElement("button");
        btn.innerHTML  = option;
        

    })

}

showQuestions();
showOptions();




















