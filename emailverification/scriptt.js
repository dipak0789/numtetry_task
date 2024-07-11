document.addEventListener("DOMContentLoaded", function () {
    emailjs.init("sfBigEChcKiUgi0Ut");

    const sendOtpButton = document.getElementById("send-otp");
    const verifyOtpButton = document.getElementById("verify-otp");
    const emailInput = document.getElementById("email");
    const otpInput = document.getElementById("otp");
    const statusText = document.getElementById("status");

    let generatedOtp;

    sendOtpButton.addEventListener("click", function () {
        const email = emailInput.value;
        if (!email) {
            statusText.textContent = "Please enter your email.";
            return;
        }

        generatedOtp = Math.floor(100000 + Math.random() * 900000).toString();

        emailjs.send("service_tyob4ef", "template_6j6jqgi", {
            to_email: email,
            otp: generatedOtp,
        }).then(function () {
            document.getElementById("otp-form").style.display = "none";
            document.getElementById("verify-form").style.display = "block";
            statusText.textContent = "OTP sent to your email.";
        }, function (error) {
            statusText.textContent = "Failed to send OTP. Try again.";
            console.error("Failed to send OTP:", error);
        });
    });

    verifyOtpButton.addEventListener("click", function () {
        const enteredOtp = otpInput.value;
        if (enteredOtp === generatedOtp) {
            statusText.textContent = "Email verified successfully! and You registered successfully";
        } else {
            statusText.textContent = "Invalid OTP. Please try again.";
        }
    });
});


function validateForm() {
    var name = document.getElementById("name").value;
    var gender = document.getElementById("gender").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;
    var dob = document.getElementById("dob").value;
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
  
    if (name.trim() === '' || gender === '' || email.trim() === '' || phone.trim() === '' ||
        dob === '' || username.trim() === '' || password.trim() === '' || confirmPassword.trim() === '') {
      alert("Please fill in all fields.");
      return false;
    }
  
   
    var nameRegex = /^[A-Za-z\s]+$/;
    if (!nameRegex.test(name)) {
      alert("Name should only contain letters and spaces.");
      return false;
    }
  
    
   var emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
  if (!emailRegex.test(email)) {
    alert("Invalid email format.");
    return false;
  }
  
    var phoneRegex = /^[789]\d{9}$/;
    if (!phoneRegex.test(phone)) {
      alert("Phone number should be 10 digits and cannot start with 1, 2, 3, 4, 5, 6, or 0.");
      return false;
    }

   
    var dobDate = new Date(dob);
    var currentDate = new Date();
    if (dobDate >= currentDate) {
      alert("Date of birth must be in the past.");
      return false;
    }

    
    if (username.length < 5 || username.length > 20) {
      alert("Username must be between 5 to 20 characters long.");
      return false;
    }
  
    
    if (password.length < 8) {
      alert("Password must be at least 8 characters long.");
      return false;
    }
  
    if (password !== confirmPassword) {
      alert("Passwords do not match.");
      return false;
    }
  
    
    alert("Registration successful!");
    return true;
  }