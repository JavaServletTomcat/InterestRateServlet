import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InterestRateServlet", urlPatterns = "/interes")
public class InterestRateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double money = Double.parseDouble(request.getParameter("money"));
        double month = Double.parseDouble(request.getParameter("month"));
        double interest = Double.parseDouble(request.getParameter("interest"));

        double interestMonth = interest / 12;
        double myInterest = money / 100 * month * interestMonth;

        PrintWriter writer = response.getWriter();
        writer.println("<html><head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head><body>");
        writer.println("Tien gui cua ban: " + money
                + "<br>So thang ban gui: " + month
                + "<br>Phan tram lai ngan hang: " + interest
                + "<br>So tien lai cua ban la: " + myInterest);
        writer.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
