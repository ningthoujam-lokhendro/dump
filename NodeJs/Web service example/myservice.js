var express = require('express');
var app = express();

app.configure(function(){
	app.use(express.bodyParser());
});

app.get('/movie/getMovie/:name', function(req, res) {
	res.type('application/json');
	var name = req.params.name;
	console.log("Parameter: " + name);	

	movie = new Object();
	movie.name = name;
	movie.genre = "Action";
	movie.rating = "9/10";
	movie.length = "120 min";	

	cast = new Object();
	cast.Actor = "Gokul";
	cast.Actress = "Surbala";	

	movie.cast = cast;	

	res.json(movie);
});

app.post('/movie/postMovie', function(req, res) {
	var movie = req.body;
	console.log("Got request: " + JSON.stringify(movie));
	res.send(movie);
});

app.listen(process.env.PORT || 1337);