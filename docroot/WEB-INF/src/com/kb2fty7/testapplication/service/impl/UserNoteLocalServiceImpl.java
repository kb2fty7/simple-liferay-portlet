/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.kb2fty7.testapplication.service.impl;

import com.kb2fty7.testapplication.model.UserNote;
import com.kb2fty7.testapplication.service.UserNoteLocalServiceUtil;
import com.kb2fty7.testapplication.service.base.UserNoteLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the user note local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kb2fty7.testapplication.service.UserNoteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Р®СЂРёР№
 * @see com.kb2fty7.testapplication.service.base.UserNoteLocalServiceBaseImpl
 * @see com.kb2fty7.testapplication.service.UserNoteLocalServiceUtil
 */
public class UserNoteLocalServiceImpl extends UserNoteLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.kb2fty7.testapplication.service.UserNoteLocalServiceUtil} to access the user note local service.
	 */
	
	public UserNote addUserNote(String name, String lastname, String email, String question) throws SystemException
	{
		long id = counterLocalService.increment();
		UserNote userNote = UserNoteLocalServiceUtil.createUserNote(id);
		
		userNote.setName(name);
		userNote.setLastname(lastname);
		userNote.setEmail(email);
		userNote.setQuestion(question);
		
		UserNoteLocalServiceUtil.addUserNote(userNote);
 
		return userNote;
	}
}