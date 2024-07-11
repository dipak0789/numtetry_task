function sendMail(){
	let params ={
		collegename: document.getElementById("collegename").value,
		firstname : document.getElementById("firstname").value,
		lastname: documment.getElementById("lastname").value,
		username: document.getElementById("username").value,
		password: document.getElementById("password").value,
		email : document.getElementById("email").value,	
	}
	
	emailjs.send("service_ittjt2a","template_6j6jqgi",params).then(alert("Email Sent!!"))
}