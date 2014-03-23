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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Р®СЂРёР№
 * @generated
 */
public class UserNoteSoap implements Serializable {
	public static UserNoteSoap toSoapModel(UserNote model) {
		UserNoteSoap soapModel = new UserNoteSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setLastname(model.getLastname());
		soapModel.setEmail(model.getEmail());
		soapModel.setQuestion(model.getQuestion());

		return soapModel;
	}

	public static UserNoteSoap[] toSoapModels(UserNote[] models) {
		UserNoteSoap[] soapModels = new UserNoteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserNoteSoap[][] toSoapModels(UserNote[][] models) {
		UserNoteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserNoteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserNoteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserNoteSoap[] toSoapModels(List<UserNote> models) {
		List<UserNoteSoap> soapModels = new ArrayList<UserNoteSoap>(models.size());

		for (UserNote model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserNoteSoap[soapModels.size()]);
	}

	public UserNoteSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getLastname() {
		return _lastname;
	}

	public void setLastname(String lastname) {
		_lastname = lastname;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getQuestion() {
		return _question;
	}

	public void setQuestion(String question) {
		_question = question;
	}

	private long _id;
	private String _name;
	private String _lastname;
	private String _email;
	private String _question;
}