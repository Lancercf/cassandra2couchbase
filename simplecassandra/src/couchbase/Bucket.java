/**
 */
package couchbase;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link couchbase.Bucket#getName <em>Name</em>}</li>
 *   <li>{@link couchbase.Bucket#getDocuments <em>Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @see couchbase.CouchbasePackage#getBucket()
 * @model
 * @generated
 */
public interface Bucket extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see couchbase.CouchbasePackage#getBucket_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link couchbase.Bucket#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;java.lang.String, couchbase.Document>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see couchbase.CouchbasePackage#getBucket_Documents()
	 * @model mapType="couchbase.EStringToDocument<org.eclipse.emf.ecore.EString, couchbase.Document>"
	 * @generated
	 */
	EList<Map.Entry<String, Document>> getDocuments();

} // Bucket
