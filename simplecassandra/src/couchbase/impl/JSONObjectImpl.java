/**
 */
package couchbase.impl;

import couchbase.CouchbasePackage;
import couchbase.JSONElement;
import couchbase.JSONObject;

import java.util.Collection;
import java.util.Map;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSON Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link couchbase.impl.JSONObjectImpl#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JSONObjectImpl extends JSONElementImpl implements JSONObject {
	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, JSONElement>> map;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CouchbasePackage.Literals.JSON_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map.Entry<String, JSONElement>> getMap() {
		if (map == null) {
			map = new EObjectResolvingEList<Map.Entry<String, JSONElement>>(Entry.class, this, CouchbasePackage.JSON_OBJECT__MAP);
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CouchbasePackage.JSON_OBJECT__MAP:
				return getMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CouchbasePackage.JSON_OBJECT__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends Map.Entry<String, JSONElement>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CouchbasePackage.JSON_OBJECT__MAP:
				getMap().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CouchbasePackage.JSON_OBJECT__MAP:
				return map != null && !map.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JSONObjectImpl
