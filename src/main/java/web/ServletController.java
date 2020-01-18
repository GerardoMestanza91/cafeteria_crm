package web;

import data.UsersDaoJDBC;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 *
 * @author gerry
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

    private static final long serialVersionUID = 1l;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uname = request.getParameter("uname");
        String upassword = request.getParameter("upassword");

        UsersDaoJDBC dao = new UsersDaoJDBC();

        if (dao.checkUser(uname, upassword)) {

            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("bienvenido.jsp");

        } else {
            response.sendRedirect("login.jsp");

        }

    }
}
