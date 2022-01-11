/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2022-01-11 08:28:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findPw_005fchange_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>비밀번호 변경 페이지</title>\n");
      out.write("<script>\n");
      out.write("	function find_password() {\n");
      out.write("		var p_RegExp = /^[a-zA-Z0-9]{8,20}$/; //비밀번호 유효성 검사 정규식\n");
      out.write("\n");
      out.write("		var Pw = document.getElementById(\"m_pw\"); //비밀번호\n");
      out.write("		var RePw = document.getElementById(\"m_pw_chk\") //비밀번호 재확인\n");
      out.write("\n");
      out.write("	\n");
      out.write("		if (!Id.test(m_id, value)) {\n");
      out.write("			alert(\"변경할 아이디가 맞지않습니다. 다시 입력해주세요.\");\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//패스워드 공백 입력여부 \n");
      out.write("		if (Pw.value == '') {\n");
      out.write("			alert(\"password를 입력해주세요.\");\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		// 비밀번호 재확인 공백 입력여부 \n");
      out.write("		if (RePw.value == '') {\n");
      out.write("			alert(\"비밀번호 재확인을 입력해주세요.\");\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//패스워드 유효성 \n");
      out.write("		if (!p_RegExp.test(Pw.value)) {\n");
      out.write("			alert(\"password는 8~20자의 영문 대소문자와 숫자로만 입력 해주세요! 다시 입력해주세요.\");\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//비밀번호 재확인 \n");
      out.write("		if (Pw.value != RePw.value) {\n");
      out.write("			alert(\"비밀번호 재입력이 틀립니다! 다시 입력해주세요.\");\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<table>\n");
      out.write("		<h2>변경할 비밀번호를 입력해주세요.</h2>\n");
      out.write("		<tr>\n");
      out.write("			<td>\n");
      out.write("				<form id=\"change_pw\" name=\"change_pw\" action=\"change_pw\"\n");
      out.write("					method=\"post\" onsubmit=\"return find_password()\">\n");
      out.write("					\n");
      out.write("					<div>\n");
      out.write("						변경할 비밀번호 입력 : <input type=\"password\" id=\"m_pw\" name=\"m_pw\"\n");
      out.write("							placeholder=\"비밀번호를 입력하세요.\">\n");
      out.write("					</div>\n");
      out.write("					<div>\n");
      out.write("						변경된 비밀번호 재입력 : <input type=\"password\" id=\"m_pw_chk\"\n");
      out.write("							name=\"m_pw_chk\" placeholder=\"비밀번호를 입력하세요.\">\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<div>\n");
      out.write("						<input type=\"submit\" name=\"member_pass\" value=\"비밀번호 변경\" />\n");
      out.write("					</div>\n");
      out.write("				</form>\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("	</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
