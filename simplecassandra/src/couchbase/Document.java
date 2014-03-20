/**
 */
package couchbase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link couchbase.Document#getMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @see couchbase.CouchbasePackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends JSONObject {
	/**
	 * Returns the value of the '<em><b>Meta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' reference.
	 * @see #setMeta(Metadata)
	 * @see couchbase.CouchbasePackage#getDocument_Meta()
	 * @model required="true"
	 * @generated
	 */
	Metadata getMeta();

	/**
	 * Sets the value of the '{@link couchbase.Document#getMeta <em>Meta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(Metadata value);

} // Document
