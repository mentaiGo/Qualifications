package servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.AoQDao;
import Dto.AoQ;

/**
 * Servlet implementation class AddQualifications
 */
@WebServlet("/AddQualifications")
public class AddQualifications extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddQualifications() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//資格追加
		String idkey = request.getParameter("sid");
		String quokey = request.getParameter("qoname");
		Date exakey = Date.valueOf(request.getParameter("exa"));
		Boolean sofkey = Boolean.valueOf("sof");

		int sidkey = Integer.parseInt(idkey);

		ArrayList<AoQ> list = AoQDao.insertQo(sidkey, quokey, exakey,sofkey);

		//リクエストスコープで保存
		request.setAttribute("qua", list);


		String view="/WEB-INF/view/aq.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request,response);
	}
}
