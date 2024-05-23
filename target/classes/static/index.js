import { React, ReactDOM, html } from "./deps.js";

const App = (props) => {
  return html`<div><h1>Gerenciamento de ${props.foo}</h1></div>`;
}

ReactDOM.render(
  html`<${App} foo=${"Estudantes"} />`,
  document.getElementById("root")
);