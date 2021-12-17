const http = require('http');
const fs = require('fs').promises;

http.createServer(async (req, res) => {
	try {
		console.log(req.method, req.url);
		if (req.method === 'GET') {
			if (req.url === '/') {
				const data = await fs.readFile('4.2/restFront.html');
				res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
				return res.end(data);
			}
			else if (req.url === '/about') {
				const data = await fs.readFile('4.2/about.html');
				res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
				return res.end(data);
			}
			try {
				const data = await fs.readFile(`4.2${req.url}`);
				return res.end(data);
			}
			catch (err) {
				// 404 404 404 404
			}
		}
		res.writeHead(404);
		return res.end('NOT FOUND');
	}
	catch (err) {
		console.error(err);
		res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8'});
		res.end(err.message);
	}
})
	.listen(8082, () => {
		console.log('8082번 포트에서 대기 중 입니다.');
	})
