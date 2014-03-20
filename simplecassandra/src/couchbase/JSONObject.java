/**
 */
package couchbase;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link couchbase.JSONObject#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see couchbase.CouchbasePackage#getJSONObject()
 * @model
 * @generated
 */
public interface JSONObject extends JSONElement {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;java.lang.String, couchbase.JSONElement>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference list.
	 * @see couchbase.CouchbasePackage#getJSONObject_Map()
	 * @model mapType="couchbase.EStringToJSONElement<org.eclipse.emf.ecore.EString, couchbase.JSONElement>"
	 * @generated
	 */
	EList<Map.Entry<String, JSONElement>> getMap();

} // JSONObject
