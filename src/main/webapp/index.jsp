<%--加上这句代码--%>
<%@ page contentType="text/html; utf-8"  %>
<%--使用jstl标签--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
    <h2>Hello World!</h2>
    <h3>jenkins test</h3>
    <%-- 获取接口返回的参数  --%>
    name:${name}
    <br>

    <%--使用jstl标签--%>
    <c:forEach items="${nums}"  var="num">
        ${num}<br>
    </c:forEach>

    <br> ${age}  <br>  ${name}  <br>  ${sexy}
</body>
</html>
