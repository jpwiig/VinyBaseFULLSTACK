//ny artist, plate osv kall

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
}function addRecord() {
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

}
