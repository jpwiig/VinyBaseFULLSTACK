//ny artist, plate osv kall

function addedRecord() {
    //Objekt for relase, sjekk med en post om artisten eksisterer(klient eller server?)
    let release = {
        RecordName: $("#recordName").val(),
        releaseDate: $("#releaseYear").val(),
        artist: $("#artist").val(),
        genre : null,
        country : null

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
}function addRecordform() {

    //jquery senere
    //hentet fra: https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp
    if (nyPlate.style.display === "none") {
        nyPlate.style.display = "block";
        $("#search").style.display = "none";
        okrecod = true;
    } else {
        nyPlate.style.display = "none";
        $("#search").style.display = "block";
        okrecord = false;
    }

}


function removeRecord() {
    vinylInfo.textContent = "What record do you want to remove?";
}

function yearRange(value) {
    let yearrange = $("#yearrange").val();
    $("#year").val(yearrange);
}
function vinylvaldiering(vinyl){
    //server side validering, sjekker i db
    //rexexp iforhold til om det kan være en gyldig input
    const artistcheck  = /^[]{}$/
    const vinylcheck = /^[] {}$/
}

function showCollection() {
    $.get("api/getvinyl", ()  => {
        console.log("plater hentet")
    })
    for (let envinyl in vinyl){
        $("#vinylInfo").val("<h1> platene  i samlingen: </h1>")
    }
}

function addRecord(){
    $.get("api/addvinyl"), (release)=> {

    }

}
function addArtist(){
    $.get("api/addartist"), ()=>{

    }
}
function addBand(){
    $.get("api/addband")
}