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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserNote}.
 * </p>
 *
 * @author Р®СЂРёР№
 * @see UserNote
 * @generated
 */
public class UserNoteWrapper implements UserNote, ModelWrapper<UserNote> {
	public UserNoteWrapper(UserNote userNote) {
		_userNote = userNote;
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

	/**
	* Returns the primary key of this user note.
	*
	* @return the primary key of this user note
	*/
	@Override
	public long getPrimaryKey() {
		return _userNote.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user note.
	*
	* @param primaryKey the primary key of this user note
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userNote.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user note.
	*
	* @return the ID of this user note
	*/
	@Override
	public long getId() {
		return _userNote.getId();
	}

	/**
	* Sets the ID of this user note.
	*
	* @param id the ID of this user note
	*/
	@Override
	public void setId(long id) {
		_userNote.setId(id);
	}

	/**
	* Returns the name of this user note.
	*
	* @return the name of this user note
	*/
	@Override
	public java.lang.String getName() {
		return _userNote.getName();
	}

	/**
	* Sets the name of this user note.
	*
	* @param name the name of this user note
	*/
	@Override
	public void setName(java.lang.String name) {
		_userNote.setName(name);
	}

	/**
	* Returns the lastname of this user note.
	*
	* @return the lastname of this user note
	*/
	@Override
	public java.lang.String getLastname() {
		return _userNote.getLastname();
	}

	/**
	* Sets the lastname of this user note.
	*
	* @param lastname the lastname of this user note
	*/
	@Override
	public void setLastname(java.lang.String lastname) {
		_userNote.setLastname(lastname);
	}

	/**
	* Returns the email of this user note.
	*
	* @return the email of this user note
	*/
	@Override
	public java.lang.String getEmail() {
		return _userNote.getEmail();
	}

	/**
	* Sets the email of this user note.
	*
	* @param email the email of this user note
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_userNote.setEmail(email);
	}

	/**
	* Returns the question of this user note.
	*
	* @return the question of this user note
	*/
	@Override
	public java.lang.String getQuestion() {
		return _userNote.getQuestion();
	}

	/**
	* Sets the question of this user note.
	*
	* @param question the question of this user note
	*/
	@Override
	public void setQuestion(java.lang.String question) {
		_userNote.setQuestion(question);
	}

	@Override
	public boolean isNew() {
		return _userNote.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userNote.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userNote.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userNote.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userNote.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userNote.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userNote.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userNote.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userNote.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userNote.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userNote.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserNoteWrapper((UserNote)_userNote.clone());
	}

	@Override
	public int compareTo(com.kb2fty7.testapplication.model.UserNote userNote) {
		return _userNote.compareTo(userNote);
	}

	@Override
	public int hashCode() {
		return _userNote.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.kb2fty7.testapplication.model.UserNote> toCacheModel() {
		return _userNote.toCacheModel();
	}

	@Override
	public com.kb2fty7.testapplication.model.UserNote toEscapedModel() {
		return new UserNoteWrapper(_userNote.toEscapedModel());
	}

	@Override
	public com.kb2fty7.testapplication.model.UserNote toUnescapedModel() {
		return new UserNoteWrapper(_userNote.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userNote.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userNote.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userNote.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserNoteWrapper)) {
			return false;
		}

		UserNoteWrapper userNoteWrapper = (UserNoteWrapper)obj;

		if (Validator.equals(_userNote, userNoteWrapper._userNote)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserNote getWrappedUserNote() {
		return _userNote;
	}

	@Override
	public UserNote getWrappedModel() {
		return _userNote;
	}

	@Override
	public void resetOriginalValues() {
		_userNote.resetOriginalValues();
	}

	private UserNote _userNote;
}