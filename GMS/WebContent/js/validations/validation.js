function validate()
{
	var name=document.formfd.membername.value;
	var dob=document.formfd.dob.value;
	var mobileno=document.formfd.mobileno.value;
	 var email=document.formfd.email.value;
	 var address1=document.formfd.address1.value;
	 var address2=document.formfd.address1.value;
	 var doj=document.formfd.doj.value;
	if(name==""||name==null)
		{
		document.getElementById("errormembername").innerHTML="plz enter your name";
		return false;
		}
	
	if(dob=="" || dob==null)
		{
		document.getElementById("errordob").innerHTML="plz enter yuor Date of Birth";
		return false;
		}

	if(mobileno=="" || mobileno==null)
		{
		document.getElementById("errormobileno").innerHTML="plz enter your mobilenumber";
		return false;
		}

	if(email=="" || email==null)
	{
	document.getElementById("erroremail").innerHTML="plz enter your valid email_id ";
	return false;
	}

if(address1=="" || address1==null)
{
document.getElementById("erroraddress1").innerHTML="plz enter your valid Address ";
return false;
}

if(address2=="" || address2==null)
{
document.getElementById("erroraddress2").innerHTML="plz enter your valid address2";
return false;
}

if(doj=="" || doj==null)
{
document.getElementById("errordoj").innerHTML="plz enter your valid doj";

return false;

}


	else return true;
	}
function clearMethod()
{
	document.getElementById("errormembername").innerHTML="";
	document.getElementById("errordob").innerHTML="";
	document.getElementById("errormobileno").innerHTML="";
	document.getElementById("erroremail").innerHTML="";
	document.getElementById("erroraddress1").innerHTML="";
	document.getElementById("erroraddress2").innerHTML="";
	document.getElementById("errordoj").innerHTML="";
	}

function lettersOnly(evt) {
        	    evt = (evt) ? evt : event;
        	    var charCode = (evt.charCode) ? evt.charCode : ((evt.keyCode) ? evt.keyCode :
        	        (evt.which) ? evt.which : 0);
        	    if ((charCode > 31) && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122))
        	    {
        	        return false;
        	    }
        	    else{ 
        	        return true;
        	}}
  function isNumber(evt) {
      var iKeyCode = (evt.which) ? evt.which : evt.keyCode;
      if (iKeyCode != 46 && iKeyCode > 31 && (iKeyCode < 48 || iKeyCode > 57))
     	 {
          return false;
     	 }
          else{
      return true;
  }}function isNumbers(evt) {
      var iKeyCode = (evt.which) ? evt.which : evt.keyCode;
      if (iKeyCode != 46 && iKeyCode > 31 && (iKeyCode < 47 || iKeyCode > 57))
     	 {
          return false;
     	 }
          else{
      return true;
  }}