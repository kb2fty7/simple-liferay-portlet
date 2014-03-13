
function isValidateEmail(email) {
	var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z])/;
	var isCorect = reg.test(email);
	if(!isCorect) alert('incorect Email'+ email);
	return isCorect;
}