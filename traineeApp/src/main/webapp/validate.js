function loginvalidate(){
	let uname=document.getElementById("unameId").value;
	let pass=document.getElementById("pswId").value;
	
	if(isBlank(uname)){
		 document.getElementById("usernameMsg").innerHTML = "Enter user name";
	     document.getElementById("usernameMsg").style.color = "red";
		return false
	}
	if(isBlank(pass)){
		  document.getElementById("passwordMsg").innerHTML = "Enter password";
	        document.getElementById("passwordMsg").style.color = "red";
		return false;
	}
	return true
}
function isBlank(val){
	return(val.trim()=="")?true:false;
}