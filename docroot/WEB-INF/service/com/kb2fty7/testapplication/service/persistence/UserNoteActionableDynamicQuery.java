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

package com.kb2fty7.testapplication.service.persistence;

import com.kb2fty7.testapplication.model.UserNote;
import com.kb2fty7.testapplication.service.UserNoteLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Р®СЂРёР№
 * @generated
 */
public abstract class UserNoteActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public UserNoteActionableDynamicQuery() throws SystemException {
		setBaseLocalService(UserNoteLocalServiceUtil.getService());
		setClass(UserNote.class);

		setClassLoader(com.kb2fty7.testapplication.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("id");
	}
}