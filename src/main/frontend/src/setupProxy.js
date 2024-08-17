// setupProxy (http-proxy-middleware) 가 정상 작동하지 않아 package.json에서 proxy 처리
// pathFilter : '/api' 추가하여 proxy 처리
const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function(app) {
  app.use(
    createProxyMiddleware({
      target: 'http://127.0.0.1:8080',	// 서버 URL or localhost:설정한포트번호
      changeOrigin: true,
      pathFilter : '/api'
    })
  );
};