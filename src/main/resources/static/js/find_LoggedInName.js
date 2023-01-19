
function currentUserName(){

    let httpRequest = new XMLHttpRequest();
    httpRequest.open("GET", 'http://localhost:8080/currentLoggedInUserName'); //ei url ta userController e ase
    httpRequest.send();

    httpRequest.onload = function (){
        document.getElementById("currentLoggedInUserName").innerText = httpRequest.responseText;
        console.log(httpRequest.responseText);
    }

}