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

import com.kb2fty7.testapplication.NoSuchUserNoteException;
import com.kb2fty7.testapplication.model.UserNote;
import com.kb2fty7.testapplication.model.impl.UserNoteImpl;
import com.kb2fty7.testapplication.model.impl.UserNoteModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Р®СЂРёР№
 * @see UserNotePersistence
 * @see UserNoteUtil
 * @generated
 */
public class UserNotePersistenceImpl extends BasePersistenceImpl<UserNote>
	implements UserNotePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserNoteUtil} to access the user note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserNoteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
			UserNoteModelImpl.FINDER_CACHE_ENABLED, UserNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
			UserNoteModelImpl.FINDER_CACHE_ENABLED, UserNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
			UserNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UserNotePersistenceImpl() {
		setModelClass(UserNote.class);
	}

	/**
	 * Caches the user note in the entity cache if it is enabled.
	 *
	 * @param userNote the user note
	 */
	@Override
	public void cacheResult(UserNote userNote) {
		EntityCacheUtil.putResult(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
			UserNoteImpl.class, userNote.getPrimaryKey(), userNote);

		userNote.resetOriginalValues();
	}

	/**
	 * Caches the user notes in the entity cache if it is enabled.
	 *
	 * @param userNotes the user notes
	 */
	@Override
	public void cacheResult(List<UserNote> userNotes) {
		for (UserNote userNote : userNotes) {
			if (EntityCacheUtil.getResult(
						UserNoteModelImpl.ENTITY_CACHE_ENABLED,
						UserNoteImpl.class, userNote.getPrimaryKey()) == null) {
				cacheResult(userNote);
			}
			else {
				userNote.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user notes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserNoteImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserNoteImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user note.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserNote userNote) {
		EntityCacheUtil.removeResult(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
			UserNoteImpl.class, userNote.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserNote> userNotes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserNote userNote : userNotes) {
			EntityCacheUtil.removeResult(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
				UserNoteImpl.class, userNote.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user note with the primary key. Does not add the user note to the database.
	 *
	 * @param id the primary key for the new user note
	 * @return the new user note
	 */
	@Override
	public UserNote create(long id) {
		UserNote userNote = new UserNoteImpl();

		userNote.setNew(true);
		userNote.setPrimaryKey(id);

		return userNote;
	}

	/**
	 * Removes the user note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user note
	 * @return the user note that was removed
	 * @throws com.kb2fty7.testapplication.NoSuchUserNoteException if a user note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserNote remove(long id)
		throws NoSuchUserNoteException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user note
	 * @return the user note that was removed
	 * @throws com.kb2fty7.testapplication.NoSuchUserNoteException if a user note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserNote remove(Serializable primaryKey)
		throws NoSuchUserNoteException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserNote userNote = (UserNote)session.get(UserNoteImpl.class,
					primaryKey);

			if (userNote == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserNoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userNote);
		}
		catch (NoSuchUserNoteException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UserNote removeImpl(UserNote userNote) throws SystemException {
		userNote = toUnwrappedModel(userNote);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userNote)) {
				userNote = (UserNote)session.get(UserNoteImpl.class,
						userNote.getPrimaryKeyObj());
			}

			if (userNote != null) {
				session.delete(userNote);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userNote != null) {
			clearCache(userNote);
		}

		return userNote;
	}

	@Override
	public UserNote updateImpl(
		com.kb2fty7.testapplication.model.UserNote userNote)
		throws SystemException {
		userNote = toUnwrappedModel(userNote);

		boolean isNew = userNote.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userNote.isNew()) {
				session.save(userNote);

				userNote.setNew(false);
			}
			else {
				session.merge(userNote);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
			UserNoteImpl.class, userNote.getPrimaryKey(), userNote);

		return userNote;
	}

	protected UserNote toUnwrappedModel(UserNote userNote) {
		if (userNote instanceof UserNoteImpl) {
			return userNote;
		}

		UserNoteImpl userNoteImpl = new UserNoteImpl();

		userNoteImpl.setNew(userNote.isNew());
		userNoteImpl.setPrimaryKey(userNote.getPrimaryKey());

		userNoteImpl.setId(userNote.getId());
		userNoteImpl.setName(userNote.getName());
		userNoteImpl.setLastname(userNote.getLastname());
		userNoteImpl.setEmail(userNote.getEmail());
		userNoteImpl.setQuestion(userNote.getQuestion());

		return userNoteImpl;
	}

	/**
	 * Returns the user note with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user note
	 * @return the user note
	 * @throws com.kb2fty7.testapplication.NoSuchUserNoteException if a user note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserNote findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserNoteException, SystemException {
		UserNote userNote = fetchByPrimaryKey(primaryKey);

		if (userNote == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserNoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userNote;
	}

	/**
	 * Returns the user note with the primary key or throws a {@link com.kb2fty7.testapplication.NoSuchUserNoteException} if it could not be found.
	 *
	 * @param id the primary key of the user note
	 * @return the user note
	 * @throws com.kb2fty7.testapplication.NoSuchUserNoteException if a user note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserNote findByPrimaryKey(long id)
		throws NoSuchUserNoteException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user note
	 * @return the user note, or <code>null</code> if a user note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserNote fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserNote userNote = (UserNote)EntityCacheUtil.getResult(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
				UserNoteImpl.class, primaryKey);

		if (userNote == _nullUserNote) {
			return null;
		}

		if (userNote == null) {
			Session session = null;

			try {
				session = openSession();

				userNote = (UserNote)session.get(UserNoteImpl.class, primaryKey);

				if (userNote != null) {
					cacheResult(userNote);
				}
				else {
					EntityCacheUtil.putResult(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
						UserNoteImpl.class, primaryKey, _nullUserNote);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserNoteModelImpl.ENTITY_CACHE_ENABLED,
					UserNoteImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userNote;
	}

	/**
	 * Returns the user note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user note
	 * @return the user note, or <code>null</code> if a user note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserNote fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user notes.
	 *
	 * @return the user notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserNote> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserNote> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<UserNote> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<UserNote> list = (List<UserNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERNOTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERNOTE;

				if (pagination) {
					sql = sql.concat(UserNoteModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserNote>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserNote>(list);
				}
				else {
					list = (List<UserNote>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the user notes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserNote userNote : findAll()) {
			remove(userNote);
		}
	}

	/**
	 * Returns the number of user notes.
	 *
	 * @return the number of user notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERNOTE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the user note persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.kb2fty7.testapplication.model.UserNote")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserNote>> listenersList = new ArrayList<ModelListener<UserNote>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserNote>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(UserNoteImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERNOTE = "SELECT userNote FROM UserNote userNote";
	private static final String _SQL_COUNT_USERNOTE = "SELECT COUNT(userNote) FROM UserNote userNote";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userNote.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserNote exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserNotePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static UserNote _nullUserNote = new UserNoteImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserNote> toCacheModel() {
				return _nullUserNoteCacheModel;
			}
		};

	private static CacheModel<UserNote> _nullUserNoteCacheModel = new CacheModel<UserNote>() {
			@Override
			public UserNote toEntityModel() {
				return _nullUserNote;
			}
		};
}