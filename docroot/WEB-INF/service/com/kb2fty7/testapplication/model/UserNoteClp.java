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

package com.kb2fty7.testapplication.model;

import com.kb2fty7.testapplication.service.ClpSerializer;
import com.kb2fty7.testapplication.service.UserNoteLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Юрий
 */
public class UserNoteClp extends BaseModelImpl<UserNote> implements UserNote {
	public UserNoteClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UserNote.class;
	}

	@Override
	public String getModelClassName() {
		return UserNote.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("lastname", getLastname());
		attributes.put("email", getEmail());
		attributes.put("question", getQuestion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String lastname = (String)attributes.get("lastname");

		if (lastname != null) {
			setLastname(lastname);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String question = (String)attributes.get("question");

		if (question != null) {
			setQuestion(question);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_userNoteRemoteModel != null) {
			try {
				Class<?> clazz = _userNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_userNoteRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_userNoteRemoteModel != null) {
			try {
				Class<?> clazz = _userNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_userNoteRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastname() {
		return _lastname;
	}

	@Override
	public void setLastname(String lastname) {
		_lastname = lastname;

		if (_userNoteRemoteModel != null) {
			try {
				Class<?> clazz = _userNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setLastname", String.class);

				method.invoke(_userNoteRemoteModel, lastname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_userNoteRemoteModel != null) {
			try {
				Class<?> clazz = _userNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_userNoteRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuestion() {
		return _question;
	}

	@Override
	public void setQuestion(String question) {
		_question = question;

		if (_userNoteRemoteModel != null) {
			try {
				Class<?> clazz = _userNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setQuestion", String.class);

				method.invoke(_userNoteRemoteModel, question);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserNoteRemoteModel() {
		return _userNoteRemoteModel;
	}

	public void setUserNoteRemoteModel(BaseModel<?> userNoteRemoteModel) {
		_userNoteRemoteModel = userNoteRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _userNoteRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_userNoteRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserNoteLocalServiceUtil.addUserNote(this);
		}
		else {
			UserNoteLocalServiceUtil.updateUserNote(this);
		}
	}

	@Override
	public UserNote toEscapedModel() {
		return (UserNote)ProxyUtil.newProxyInstance(UserNote.class.getClassLoader(),
			new Class[] { UserNote.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserNoteClp clone = new UserNoteClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setLastname(getLastname());
		clone.setEmail(getEmail());
		clone.setQuestion(getQuestion());

		return clone;
	}

	@Override
	public int compareTo(UserNote userNote) {
		long primaryKey = userNote.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserNoteClp)) {
			return false;
		}

		UserNoteClp userNote = (UserNoteClp)obj;

		long primaryKey = userNote.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", lastname=");
		sb.append(getLastname());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", question=");
		sb.append(getQuestion());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.kb2fty7.testapplication.model.UserNote");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastname</column-name><column-value><![CDATA[");
		sb.append(getLastname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>question</column-name><column-value><![CDATA[");
		sb.append(getQuestion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _name;
	private String _lastname;
	private String _email;
	private String _question;
	private BaseModel<?> _userNoteRemoteModel;
}