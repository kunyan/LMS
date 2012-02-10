package org.yankun.lms.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UrlPathHelper;

public class PermissionInterceptor implements HandlerInterceptor {

	private static final Logger log = Logger.getLogger(PermissionInterceptor.class);
	
	UrlPathHelper urlPathHelper = new UrlPathHelper();
	
	
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		HttpSession session = request.getSession(false);
		String uriInApplication = urlPathHelper.getPathWithinApplication(request);
		
		String ip = request.getRemoteAddr();
		/*UserDetailsImpl userDetail = UserDetailsImpl.getCurrent();
		if(!"/account/login".equals(uriInApplication)&&!uriInApplication.startsWith("/theme")){
			if(userDetail == null){
				response.sendRedirect(request.getContextPath() + "/account/login");
				return false;
			}
		}
		*/
		
		return true;
	}

}
