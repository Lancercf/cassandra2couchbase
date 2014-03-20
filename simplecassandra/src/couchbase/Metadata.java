/**
 */
package couchbase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link couchbase.Metadata#getId <em>Id</em>}</li>
 *   <li>{@link couchbase.Metadata#getRev <em>Rev</em>}</li>
 *   <li>{@link couchbase.Metadata#getExpiration <em>Expiration</em>}</li>
 *   <li>{@link couchbase.Metadata#getFlags <em>Flags</em>}</li>
 *   <li>{@link couchbase.Metadata#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see couchbase.CouchbasePackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see couchbase.CouchbasePackage#getMetadata_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link couchbase.Metadata#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev</em>' attribute.
	 * @see #setRev(String)
	 * @see couchbase.CouchbasePackage#getMetadata_Rev()
	 * @model required="true"
	 * @generated
	 */
	String getRev();

	/**
	 * Sets the value of the '{@link couchbase.Metadata#getRev <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rev</em>' attribute.
	 * @see #getRev()
	 * @generated
	 */
	void setRev(String value);

	/**
	 * Returns the value of the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration</em>' attribute.
	 * @see #setExpiration(int)
	 * @see couchbase.CouchbasePackage#getMetadata_Expiration()
	 * @model required="true"
	 * @generated
	 */
	int getExpiration();

	/**
	 * Sets the value of the '{@link couchbase.Metadata#getExpiration <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration</em>' attribute.
	 * @see #getExpiration()
	 * @generated
	 */
	void setExpiration(int value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(int)
	 * @see couchbase.CouchbasePackage#getMetadata_Flags()
	 * @model required="true"
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link couchbase.Metadata#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see couchbase.CouchbasePackage#getMetadata_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link couchbase.Metadata#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Metadata
