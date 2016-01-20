var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

var map = {"1":{id:1,name:"test"},"2":{id:2,name:"test"}} //定义一个集合资源，key为字符串完全是模仿java MAP<T,E>，否则谁会这么去写个hash啊！

router.get('/devices',function(req, res){ //Restful Get方法,查找整个集合资源
  res.set({'Content-Type':'text/json','Encodeing':'utf8'});
  res.send(map)
})
router.get('/devices/:id',function(req, res){ //Restful Get方法,查找一个单一资源
  res.set({'Content-Type':'text/json','Encodeing':'utf8'});
  res.send(map[req.param('id')])
  //console.log(req.param('id'))
})

module.exports = router;
