

let user;
let vinyl;
let artist;
()=>{
    console.log("redo")
    document.getElementById('vinylInfo');
    vinyl = {
        recordname: $("#recordName").val(),
        artist: $("#artist").val(),
        releaseYear: $("#").val(),
    }

    artist = {
        name: $("#ArtistName").val(),
        startDate: $("#startDate").val(),
        endDate: $("#endDate").val(),

    }

    $("#newregistation").click(() => {
        $.post("api/addUser", (user) => {
            user = {
                mail: $("#email").val(),
                username: $("#username").val(),
                name: $("#name").val(),
                password: $("#password").val(),
            }
        })
})

}
let feilmelding;
function uservalidation(user){
    const regexpmail=/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;
    const regexppassword=/^[A-Za-z0-9]{6,22}$/;

    regexpmail.test(user.mail);
    regexppassword.test(user.password);

    if (!regexpmail || !regexppassword){
    feilmelding = false;
    if (!regexpmail){
        console.log("feil i epost");
        feilmelding=false;
    }
    if (!regexppassword){
        console.log("feil i passord");
        feilmelding=false;
    }
    }
}
function vinylvaldiering(vinyl){
    //server side validering, sjekker i db
    //rexexp iforhold til om det kan være en gyldig input
    const artistcheck  = /^[]{}$/
    const vinylcheck = /^[] {}$/
}

function showCollection() {

}

//if loops in JavaScript
document.getElementById("nyPlate");

function addRecord() {
    //jquery senere
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

function yearRange(value){
let yearrange= $("#yearrange").val();
$("#year").val(yearrange);
}

function loginn(credentials){

}
function addedRecord() {
    //Objekt for relase, sjekk med en post om artisten eksisterer(klient eller server?)
    let release = {
        RecordName: $("#recordName").val(),
        artist: $("#artist").val(),
        releaseYear: $("#releaseYear").val()
    }
//bytt ut med regexp
    vinylvaldiering(release);

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


