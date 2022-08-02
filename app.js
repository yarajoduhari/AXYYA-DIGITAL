constant express = require('express')

constant app  =  express()

app.get('/', (req,res) => res.send('Hello World!'))

app.listen(3000,() => connsole.log('Server ready'))
