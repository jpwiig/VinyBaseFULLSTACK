//kall til ny bruker, registering av en ny bruker
let user;
$(() => {
    console.log("redo")

    $("#loginn").click(()=>{

        console.log("ok")
    $.get("api/loginn", (user) =>{

        if (uservalidation(user)){
            user = {
                email : $("#email").val(),
                password : $("#password").val()
            }
            console.log(user);
        }

    }

    ).fail((jqXHR) => {
        const serverResponse = $.parseJSON(jqXHR.responseText);
        $("#vinylInfo").val(serverResponse).style("red");
    })
    })

    $("#newUserbtn").click(()=>{
        console.log("btn new user");
        window.open("html/Registation.html");
    })


})