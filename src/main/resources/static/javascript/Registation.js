//regexp, kall til lagring av ny bruker
$(()=>{
    $("#newregistation").click(() => {
        $.post("api/addUser", (user) => {
            user = {
                mail: $("#email").val(),
                username: $("#username").val(),
                name: $("#name").val(),
                password: $("#password").val(),
            }
        })
})})
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
    if ($("#password").val()!= $("#repeatpassword").val()) {
        feilmelding=false;
        $("#passerror").html("Du skrev ulikt passord ").style("red");
        $("#reppasserror").html("Du skrev ulikt passord ").style("red");
    }

}
