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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the user note service. This utility wraps {@link UserNotePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Р®СЂРёР№
 * @see UserNotePersistence
 * @see UserNotePersistenceImpl
 * @generated
 */
public class UserNoteUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(UserNote userNote) {
		getPersistence().clearCache(userNote);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserNote> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserNote update(UserNote userNote) throws SystemException {
		return getPersistence().update(userNote);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserNote update(UserNote userNote,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userNote, serviceContext);
	}

	/**
	* Caches the user note in the entity cache if it is enabled.
	*
	* @param userNote the user note
	*/
	public static void cacheResult(
		com.kb2fty7.testapplication.model.UserNote userNote) {
		getPersistence().cacheResult(userNote);
	}

	/**
	* Caches the user notes in the entity cache if it is enabled.
	*
	* @param userNotes the user notes
	*/
	public static void cacheResult(
		java.util.List<com.kb2fty7.testapplication.model.UserNote> userNotes) {
		getPersistence().cacheResult(userNotes);
	}

	/**
	* Creates a new user note with the primary key. Does not add the user note to the database.
	*
	* @param id the primary key for the new user note
	* @return the new user note
	*/
	public static com.kb2fty7.testapplication.model.UserNote create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the user note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user note
	* @return the user note that was removed
	* @throws com.kb2fty7.testapplication.NoSuchUserNoteException if a user note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.kb2fty7.testapplication.model.UserNote remove(long id)
		throws com.kb2fty7.testapplication.NoSuchUserNoteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.kb2fty7.testapplication.model.UserNote updateImpl(
		com.kb2fty7.testapplication.model.UserNote userNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userNote);
	}

	/**
	* Returns the user note with the primary key or throws a {@link com.kb2fty7.testapplication.NoSuchUserNoteException} if it could not be found.
	*
	* @param id the primary key of the user note
	* @return the user note
	* @throws com.kb2fty7.testapplication.NoSuchUserNoteException if a user note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.kb2fty7.testapplication.model.UserNote findByPrimaryKey(
		long id)
		throws com.kb2fty7.testapplication.NoSuchUserNoteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the user note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user note
	* @return the user note, or <code>null</code> if a user note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.kb2fty7.testapplication.model.UserNote fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the user notes.
	*
	* @return the user notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.kb2fty7.testapplication.model.UserNote> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.kb2fty7.testapplication.model.UserNote> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.kb2fty7.testapplication.model.UserNote> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user notes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user notes.
	*
	* @return the number of user notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserNotePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserNotePersistence)PortletBeanLocatorUtil.locate(com.kb2fty7.testapplication.service.ClpSerializer.getServletContextName(),
					UserNotePersistence.class.getName());

			ReferenceRegistry.registerReference(UserNoteUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserNotePersistence persistence) {
	}

	private static UserNotePersistence _persistence;
}