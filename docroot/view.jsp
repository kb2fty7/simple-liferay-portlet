
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/validation_of_user_email.js"></script>
<portlet:defineObjects />

<portlet:actionURL var="orderFormURL">
	<portlet:param name="mvcPath" value="/view.jsp" />
</portlet:actionURL>



<aui:form name="userNote" action="<%=orderFormURL%>"  method="post">
	<aui:input label="Name:" name="userName" type="text" />
	<aui:input label="Lastname:" name="userLastname" type="text" />
	<aui:input label="E-mail:" name="userEmail" type="text" />
	<aui:input label="Question:" name="userQuestion" type="text" />
	<aui:button type="submit" value="Send" onClick="return isValidateEmail(document.getElementsByName('_testprojectforsmail_WAR_testprojectforsmailportlet_userEmail')[0].value)" />
</aui:form>

