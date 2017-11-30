package servletAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import actionForm.LoginActionForm;;
public class LoginAction extends Action{
 public ActionForward execute(final ActionMapping pMapping,
   ActionForm pForm, final HttpServletRequest pRequest,
   final HttpServletResponse pResponse) throws ClassNotFoundException {
  
  final LoginActionForm lForm= (LoginActionForm)pForm;
  
  
  String target=null;
  if(lForm.getUserName().equals("adm")
    && lForm.getPassword().equals("adm")) {
   target = "success";
  }
  else {
   target = "errorlogin";
  }
    return pMapping.findForward(target);
  
 }
}