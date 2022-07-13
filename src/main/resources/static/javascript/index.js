//kall til ny bruker, registering av en ny bruker
let user;
() => {
    console.log("redo")

    $("#loginn").click(()=>{
    $.get("api/login", (user) =>{
        user = {
            email : $("#email").val(),
            password : $("#password").val()
        }
    })
    })

    $("#newUserbtn").click(()=>{
        console.log("btn new user");
        window.open("html/Registation.html");
    })


}