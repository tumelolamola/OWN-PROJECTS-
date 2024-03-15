
var nameError = document.getElementById('name-error');
var phoneError = document.getElementById('phone-error');
var emailError = document.getElementById('email-error');
var messageError = document.getElementById('message-error');
var submitError = document.getElementById ('submit-error');

function validateName(){
var name = document.getElementById('contact-name').value;

if(name.length == 0){
 nameError.innerHTML-alert("Name is required");

 return false;

 }
if(!name.match(/^[A-Za-z]*\{1}[A-Za-z]*$/)){
 nameError.innerHTML=("write full name");

return false;

}  nameError.innerHTML='<i class="fa fa-check-circle"></i>';
 return true;

}

function validatePhone(){
var phone = document.getElementById('contact-phone').value;

 if (phone.length==0){
phoneError.innerHTML='Phone is required';
return false;

 if (phone.length!==10){
phoneError.innerHTML= 'phone should be 10 digits';
 return false;

 }
if(!phone.match(/^[0-9]{18}$/)){
phoneError.innerHTML='only digits please' 
return false;

}

 phoneError.innerHTML='<i class="fa fa-check-circle"></i>';
 return true;

 }

function validateEmail(){
var email= document.getElementById('contact-email').value;

if(email.length==0){
emailError.innerHTML ("Email is required"); 
return false;

}

if (validateEmail.includes ("@") && validateEmail.includes(".")){ emailError.innerHTML='<i class="fa fa-check-circle"></i>'; 
return true;

}
else{
alert("Email invalid");
return false;

}

function validateMessage(){
var message= document.getElementById('contact-message');
var required = 30;
var left = required - message.length;

if(left>0){
messageError.innerHTML= left+ 'more characters required';
return false
}
messageError.innerHTML='<i class="fa fa-check-circle"></i>';
return true;

} function validateForm(){
if(!validateName() || !validatePhone() || !validateEmail() || !validateMessage()){
submitError.style.display='block';
submitError.innerHTML='Please fix error to submit'; 
setTimeout(function(){submitError.style.design ='none'; }, 3000);
return false;
 }

