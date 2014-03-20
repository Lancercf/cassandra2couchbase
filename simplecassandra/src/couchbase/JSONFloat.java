/**
 */
package couchbase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link couchbase.JSONFloat#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see couchbase.CouchbasePackage#getJSONFloat()
 * @model
 * @generated
 */
public interface JSONFloat extends JSONPrimitive {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see couchbase.CouchbasePackage#getJSONFloat_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link couchbase.JSONFloat#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // JSONFloat
