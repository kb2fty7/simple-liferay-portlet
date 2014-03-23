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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the user note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Р®СЂРёР№
 * @see UserNotePersistenceImpl
 * @see UserNoteUtil
 * @generated
 */
public interface UserNotePersistence extends BasePersistence<UserNote> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserNoteUtil} to access the user note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the user note in the entity cache if it is enabled.
	*
	* @param userNote the user note
	*/
	public void cacheResult(com.kb2fty7.testapplication.model.UserNote userNote);

	/**
	* Caches the user notes in the entity cache if it is enabled.
	*
	* @param userNotes the user notes
	*/
	public void cacheResult(
		java.util.List<com.kb2fty7.testapplication.model.UserNote> userNotes);

	/**
	* Creates a new user note with the primary key. Does not add the user note to the database.
	*
	* @param id the primary key for the new user note
	* @return the new user note
	*/
	public com.kb2fty7.testapplication.model.UserNote create(long id);

	/**
	* Removes the user note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user note
	* @return the user note that was removed
	* @throws com.kb2fty7.testapplication.NoSuchUserNoteException if a user note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.kb2fty7.testapplication.model.UserNote remove(long id)
		throws com.kb2fty7.testapplication.NoSuchUserNoteException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.kb2fty7.testapplication.model.UserNote updateImpl(
		com.kb2fty7.testapplication.model.UserNote userNote)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user note with the primary key or throws a {@link com.kb2fty7.testapplication.NoSuchUserNoteException} if it could not be found.
	*
	* @param id the primary key of the user note
	* @return the user note
	* @throws com.kb2fty7.testapplication.NoSuchUserNoteException if a user note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.kb2fty7.testapplication.model.UserNote findByPrimaryKey(long id)
		throws com.kb2fty7.testapplication.NoSuchUserNoteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user note
	* @return the user note, or <code>null</code> if a user note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.kb2fty7.testapplication.model.UserNote fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user notes.
	*
	* @return the user notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.kb2fty7.testapplication.model.UserNote> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kb2fty7.testapplication.model.impl.UserNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user notes
	* @param end the upper bound of the range of user notes (not inclusive)
	* @return the range of user notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.kb2fty7.testapplication.model.UserNote> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kb2fty7.testapplication.model.impl.UserNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user notes
	* @param end the upper bound of the range of user notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.kb2fty7.testapplication.model.UserNote> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user notes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user notes.
	*
	* @return the number of user notes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}