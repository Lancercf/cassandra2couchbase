/**
 */
package couchbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link couchbase.JSONArray#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see couchbase.CouchbasePackage#getJSONArray()
 * @model
 * @generated
 */
public interface JSONArray extends JSONElement {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' reference list.
	 * The list contents are of type {@link couchbase.JSONElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' reference list.
	 * @see couchbase.CouchbasePackage#getJSONArray_Array()
	 * @model required="true"
	 * @generated
	 */
	EList<JSONElement> getArray();

} // JSONArray
