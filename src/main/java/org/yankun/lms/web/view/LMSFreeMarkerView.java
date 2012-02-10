package org.yankun.lms.web.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

public class LMSFreeMarkerView extends FreeMarkerView {
	
	@Override
	protected void exposeHelpers(Map<String,Object> model, HttpServletRequest request) throws Exception {
		super.exposeHelpers(model,request);
		String path=request.getContextPath();
		
		HttpSession session = request.getSession(false);
		if (session != null) {
			/*Object manageRole = session.getAttribute("manageRole");
			if (manageRole != null && manageRole instanceof UserRole) {
				model.put("manageRole", manageRole);
			}
			
			//StudentSessionBean ssb = SessionManager.getStudentSessionBean(session);
			if (ssb != null) {
				model.put("me", ssb);
			}
			*/			
		}
		model.put("basePath",path);
		
		
	}
	
}