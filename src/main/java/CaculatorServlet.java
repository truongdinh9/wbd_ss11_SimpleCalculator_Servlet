import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/Result")
public class CaculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double firstoperand = Double.parseDouble(req.getParameter("firstoperand"));
        Double secondoperand= Double.parseDouble(req.getParameter("secondoperand"));
        String operator = req.getParameter("operator");
        String result="";
        switch (operator) {
            case "+":
                result = firstoperand + "+" + secondoperand + "=" + (firstoperand + secondoperand);
                break;
            case "-":
                result = firstoperand + "-" + secondoperand + "=" + (firstoperand - secondoperand);
                break;
            case "*":
                result = firstoperand + "*" + secondoperand + "=" + (firstoperand * secondoperand);
                break;
            case "/":
                result = firstoperand + "/" + secondoperand + "=" + (firstoperand / secondoperand);
                break;
        }
        PrintWriter writer = resp.getWriter();
        writer.println( "<html>");
        writer.println( "<h1>Result</h1>");
        writer.println(result);

        writer.println( "</html>");
    }
}
