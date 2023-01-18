
function highlight(ElementId){

    var el = document.querySelectorAll('#sidebar .nav li a');

    for (var i = 0; i < el.length; i++) {
        var currentEl = el[i];
        currentEl.style.background = "#37474F";
    }

    document.getElementById(ElementId).style.background = "#1c2828";

}