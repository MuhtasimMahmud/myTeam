function highlight(ElementId){

    // document.getElementsByTagName("a").background = "#37474F";

    // console.log(ElementId);
    // document.getElementById(ElementId).style.background = "#1c2828";



    var el = document.querySelectorAll('a');

    for (var i = 0; i < el.length; i++) {
        var currentEl = el[i];
        currentEl.style.background = "#37474F";
    }

    document.getElementById(ElementId).style.background = "#1c2828";

}