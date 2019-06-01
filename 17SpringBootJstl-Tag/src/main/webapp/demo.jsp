

<%
    String name= request.getParameter("name");

    request.setAttribute("myname4", name);
    session.setAttribute("myname5", name+10);

    response.sendRedirect("about.jsp");
%>