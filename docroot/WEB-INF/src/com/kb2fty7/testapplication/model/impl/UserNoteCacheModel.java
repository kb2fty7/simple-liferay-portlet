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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserNote in entity cache.
 *
 * @author Р®СЂРёР№
 * @see UserNote
 * @generated
 */
public class UserNoteCacheModel implements CacheModel<UserNote>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", lastname=");
		sb.append(lastname);
		sb.append(", email=");
		sb.append(email);
		sb.append(", question=");
		sb.append(question);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserNote toEntityModel() {
		UserNoteImpl userNoteImpl = new UserNoteImpl();

		userNoteImpl.setId(id);

		if (name == null) {
			userNoteImpl.setName(StringPool.BLANK);
		}
		else {
			userNoteImpl.setName(name);
		}

		if (lastname == null) {
			userNoteImpl.setLastname(StringPool.BLANK);
		}
		else {
			userNoteImpl.setLastname(lastname);
		}

		if (email == null) {
			userNoteImpl.setEmail(StringPool.BLANK);
		}
		else {
			userNoteImpl.setEmail(email);
		}

		if (question == null) {
			userNoteImpl.setQuestion(StringPool.BLANK);
		}
		else {
			userNoteImpl.setQuestion(question);
		}

		userNoteImpl.resetOriginalValues();

		return userNoteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		name = objectInput.readUTF();
		lastname = objectInput.readUTF();
		email = objectInput.readUTF();
		question = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (lastname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastname);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (question == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(question);
		}
	}

	public long id;
	public String name;
	public String lastname;
	public String email;
	public String question;
}