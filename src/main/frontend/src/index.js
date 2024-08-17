import React from 'react'; // React는 순수 자바스크립트이고, 이 자바스크립트를 이용해 컴포넌트를 만듦
import ReactDOM from 'react-dom/client'; // ReactDOM은 만든 컴포넌트와 html과 연결하는 작업을 함
import './index.css';
import App from './App'; // 초기 화면 설정
import reportWebVitals from './reportWebVitals'; // 앱의 퍼포먼스 시간들을 분석하여 객체 형태로 보여주는 것이 목적.

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
