package com.kb2fty7.testapplication;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;

import com.kb2fty7.testapplication.service.UserNoteLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class TestPortlet extends MVCPortlet {
	
	public static final String ITEM_USER_NAME = "userName";
	public static final String ITEM_USER_LASTNAME = "userLastname";
	public static final String ITEM_USER_EMAIL = "userEmail";
	public static final String ITEM_USER_QUESTION = "userQuestion";
	
	    @Override
	    public void processAction(
	        ActionRequest actionRequest, ActionResponse actionResponse)
	        throws IOException, PortletException {
	        PortletPreferences prefs = actionRequest.getPreferences();
	        String userName = actionRequest.getParameter(ITEM_USER_NAME);
	        String userLastname = actionRequest.getParameter(ITEM_USER_LASTNAME);
	        String userEmail = actionRequest.getParameter(ITEM_USER_EMAIL);
	        String userQuestion = actionRequest.getParameter(ITEM_USER_QUESTION);
	        System.out.println(userName+userLastname+userEmail+userQuestion);
	        
            try {
				UserNoteLocalServiceUtil.addUserNote(userName,userLastname,userEmail,userQuestion);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        super.processAction(actionRequest, actionResponse);
	    }
	}

