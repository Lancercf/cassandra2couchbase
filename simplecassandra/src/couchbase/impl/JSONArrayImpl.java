/**
 */
package couchbase.impl;

import couchbase.CouchbasePackage;
import couchbase.JSONArray;
import couchbase.JSONElement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSON Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link couchbase.impl.JSONArrayImpl#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JSONArrayImpl extends JSONElementImpl implements JSONArray {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected EList<JSONElement> array;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CouchbasePackage.Literals.JSON_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JSONElement> getArray() {
		if (array == null) {
			array = new EObjectResolvingEList<JSONElement>(JSONElement.class, this, CouchbasePackage.JSON_ARRAY__ARRAY);
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CouchbasePackage.JSON_ARRAY__ARRAY:
				return getArray();
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
			case CouchbasePackage.JSON_ARRAY__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends JSONElement>)newValue);
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
			case CouchbasePackage.JSON_ARRAY__ARRAY:
				getArray().clear();
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
			case CouchbasePackage.JSON_ARRAY__ARRAY:
				return array != null && !array.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JSONArrayImpl
