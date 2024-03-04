<%@ page import="QuizBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Addition Quiz</title>
</head>
<body>

<c:set var="quizBean" value="<%= new QuizBean(5) %>" />

<h2>Addition Quiz</h2>

<form action="quizResults.jsp" method="post">
    <c:forEach var="question" items="${quizBean.numbers}" varStatus="status">
        <p>
            ${question} ${quizBean.operators[status.index]} ${quizBean.numbers[status.index + 1]} =
            <input type="text" name="userAnswers" size="3">
            <input type="hidden" name="correctAnswers" value="${quizBean.correctAnswers[status.index]}">
        </p>
    </c:forEach>
    <input type="submit" value="Submit Answers">
</form>

</body>
</html>
