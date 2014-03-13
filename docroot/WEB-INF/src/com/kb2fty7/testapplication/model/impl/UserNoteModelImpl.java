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

package com.kb2fty7.testapplication.model.impl;

import com.kb2fty7.testapplication.model.UserNote;
import com.kb2fty7.testapplication.model.UserNoteModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the UserNote service. Represents a row in the &quot;test_portlet_UserNote&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.kb2fty7.testapplication.model.UserNoteModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserNoteImpl}.
 * </p>
 *
 * @author Р®СЂРёР№
 * @see UserNoteImpl
 * @see com.kb2fty7.testapplication.model.UserNote
 * @see com.kb2fty7.testapplication.model.UserNoteModel
 * @generated
 */
public class UserNoteModelImpl extends BaseModelImpl<UserNote>
	implements UserNoteModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user note model instance should use the {@link com.kb2fty7.testapplication.model.UserNote} interface instead.
	 */
	public static final String TABLE_NAME = "test_portlet_UserNote";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "lastname", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "question", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table test_portlet_UserNote (id_ LONG not null primary key,name VARCHAR(75) null,lastname VARCHAR(75) null,email VARCHAR(75) null,question VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table test_portlet_UserNote";
	public static final String ORDER_BY_JPQL = " ORDER BY userNote.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY test_portlet_UserNote.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.kb2fty7.testapplication.model.UserNote"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.kb2fty7.testapplication.model.UserNote"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.kb2fty7.testapplication.model.UserNote"));

	public UserNoteModelImpl() {
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
	public Class<?> getModelClass() {
		return UserNote.class;
	}

	@Override
	public String getModelClassName() {
		return UserNote.class.getName();
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
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getLastname() {
		if (_lastname == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastname;
		}
	}

	@Override
	public void setLastname(String lastname) {
		_lastname = lastname;
	}

	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@Override
	public String getQuestion() {
		if (_question == null) {
			return StringPool.BLANK;
		}
		else {
			return _question;
		}
	}

	@Override
	public void setQuestion(String question) {
		_question = question;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			UserNote.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserNote toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserNote)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserNoteImpl userNoteImpl = new UserNoteImpl();

		userNoteImpl.setId(getId());
		userNoteImpl.setName(getName());
		userNoteImpl.setLastname(getLastname());
		userNoteImpl.setEmail(getEmail());
		userNoteImpl.setQuestion(getQuestion());

		userNoteImpl.resetOriginalValues();

		return userNoteImpl;
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

		if (!(obj instanceof UserNote)) {
			return false;
		}

		UserNote userNote = (UserNote)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<UserNote> toCacheModel() {
		UserNoteCacheModel userNoteCacheModel = new UserNoteCacheModel();

		userNoteCacheModel.id = getId();

		userNoteCacheModel.name = getName();

		String name = userNoteCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			userNoteCacheModel.name = null;
		}

		userNoteCacheModel.lastname = getLastname();

		String lastname = userNoteCacheModel.lastname;

		if ((lastname != null) && (lastname.length() == 0)) {
			userNoteCacheModel.lastname = null;
		}

		userNoteCacheModel.email = getEmail();

		String email = userNoteCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			userNoteCacheModel.email = null;
		}

		userNoteCacheModel.question = getQuestion();

		String question = userNoteCacheModel.question;

		if ((question != null) && (question.length() == 0)) {
			userNoteCacheModel.question = null;
		}

		return userNoteCacheModel;
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

	private static ClassLoader _classLoader = UserNote.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			UserNote.class
		};
	private long _id;
	private String _name;
	private String _lastname;
	private String _email;
	private String _question;
	private UserNote _escapedModel;
}