
function currentUserName(){

    let httpRequest = new XMLHttpRequest();
    httpRequest.open("GET", 'http://localhost:8080/currentLoggedInUserName');
    httpRequest.send();

    httpRequest.onload = function (){
        document.getElementById("currentLoggedInUserName").innerText = httpRequest.responseText;
        console.log(httpRequest.responseText);
    }

}