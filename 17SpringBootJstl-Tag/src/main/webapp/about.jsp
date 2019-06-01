

<%
    String name4= (String)request.getAttribute("myname4");
    String name5= (String)session.getAttribute("myname5");

    out.println(name4);
    out.println(name5);
%>