document.getElementById('vinylInfo');


let InnEpost = document.forms["innlogging"]["epost"].value;
let InnPassord = document.forms["innlogging"]["passord"].value;
let validertEpost = false;
let validertPassord = false;

/*function Logginn() {

    if (InnEpost.attributes.required=false){
        alert("fill inn your email please");
    }
    if (InnEpost.attributes.required=true){
       validertEpost=true;
    }
    if (InnPassord.attributes.required=false){
        alert("fill inn your email please");
    }
    if (InnPassord.attributes.required=true){
        validertPassord=true;
    }
    if (validertEpost && validertPassord == true;){
        window.location.pathname="/Upage.html";
    }
}*/

function showCollection() {
    vinylInfo.textContent = "Your collection: ";
}

//if loops in JavaScript
document.getElementById("nyPlate");

function addRecord() {
    //hentet fra: https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp
    if (nyPlate.style.display === "none") {
        nyPlate.style.display = "block";
    } else {
        nyPlate.style.display = "none";
    }

}

function removeRecord() {
    vinylInfo.textContent = "What record do you want to remove?";
}


function addedRecord() {
    // lag et objekt isteden for hver release
    let release = {
        RecordName: $("#recordName").val(),
        artist: $("#artist").val(),
        releaseYear: $("#releaseYear").val()
    }

    if (release.RecordName === "") {
        alert("Fill out the name of the  record");
    }
    if (release.artist === "") {
        alert("fil out the name of the artist");
    }
    if (release.releaseYear === "") {
        alert("fill out the date");
    }
}



