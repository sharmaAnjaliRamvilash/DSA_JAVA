const express = require("express");
const mongoose = require("mongoose");
const cors = require("cors");
require("dotenv").config();

const app = express();
const Blog = require('./models/blog');
mongoose.connect(process.env.MONGO_URI).then(()=>{
        console.log("Connected succefully");
}).catch((e)=>{
      console.log("Getting error to connect");
})
//   api to create the blog
app.post('/api/blog',async(req,res)=>{
       const {title,content}  = req.body;
     try {
          const Blog = new Blog({
                title:title,
                content:content
          });
          await Blog.save();
          res.json(Blog);
        
     } catch (error) {
          res.status(404).json({
             message:"Failed to create blog"
          });
     }
      
})
//    access the blog
app.get('/api/blogs',async(req,res)=>{
          try{
               const blog = Blogs.find();
               res.json(blog);


          }catch(e){
               res.status(500).json({
                  message:"Sorry blog does not exist"
               })

          }
})
app.use(cors());
app.use(express.json());

app.get('/',(req,res)=>{
         res.send("Blog application is started working");
})
app.listen(5000,()=>{
       console.log("Backend started running on port 5000");
})