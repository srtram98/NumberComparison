package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NumberComparison;

/**
 * Servlet implementation class getComparisonServlet
 */
@WebServlet("/getComparisonServlet")
public class getComparisonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getComparisonServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int userNum1 = Integer.parseInt(request.getParameter("userNum1"));
		int userNum2 = Integer.parseInt(request.getParameter("userNum2"));
		
		NumberComparison comparison = new NumberComparison(userNum1, userNum2);
		
		request.setAttribute("comparedNumbers", comparison);
		
		if (comparison.isEqual()) {
			getServletContext().getRequestDispatcher("/tiedComparisonResult.jsp").forward(request, response);
		}
		else {
			getServletContext().getRequestDispatcher("/comparisonResult.jsp").forward(request, response);
		}
//		PrintWriter writer = response.getWriter();
//		writer.println(comparison.toString());
//		writer.close();
	}

}
