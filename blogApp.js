let addBtn = document.querySelector("#addBlog");
let blogContent = document.querySelector("#blogContent");
let title = document.querySelector("#title");
let displayContent = document.querySelector("#content");
let searchBlog = document.querySelector("#searchBlog");
let blogs = [];
addBtn.addEventListener("click", () => {
    let blogTitle = title.value.trim();
    let content = blogContent.value.trim();
    if (blogTitle == "" || content == "") {
        alert("Please enter the required details");
        return;
    }
    let blogContainer = {
        title: blogTitle,
        content: content
    };
    blogs.push(blogContainer);
    console.log(blogs);
    localStorage.setItem("blogs", JSON.stringify(blogs));
    displayBlog();
});

blogs = JSON.parse(localStorage.getItem("blogs"))|| [];

function displayBlog(blogList = blogs) {
    displayContent.innerHTML = "";

    blogs.forEach(function (blog, index) {
        let div = document.createElement("div");
        let heading = document.createElement("h1");
        let p = document.createElement("p");
        let button = document.createElement("button");
        button.innerHTML = "DELETE";
        heading.innerHTML = blog.title;
        p.innerHTML = blog.content;
        div.appendChild(heading);
        div.appendChild(p);
        div.appendChild(button);
        displayContent.appendChild(div);
        button.addEventListener("click", () => {
            blogs.splice(index, 1);
            displayBlog();
        })
    })
}

let search = document.querySelector("#search");
search.addEventListener("input", () => {
    let searchText = search.value.toLowerCase();
    let filteredText = blogs.filter(function (blog) {
        return blog.title.toLowerCase().includes(searchText)||
         blog.content.toLowerCase().includes(searchText);
    });
    displayBlog(filteredText);
});
