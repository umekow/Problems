const express = require('express');

const server = express(); 

server.use(express.json()); 

server.get('/', (req, res) => {
    res.send('<h1>Welcome to Webdb-ii-challenge 2.0</h1>');
})

module.exports = server; 