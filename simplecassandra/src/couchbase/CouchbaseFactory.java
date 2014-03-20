/**
 */
package couchbase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see couchbase.CouchbasePackage
 * @generated
 */
public interface CouchbaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CouchbaseFactory eINSTANCE = couchbase.impl.CouchbaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JSON Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Element</em>'.
	 * @generated
	 */
	JSONElement createJSONElement();

	/**
	 * Returns a new object of class '<em>JSON Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Object</em>'.
	 * @generated
	 */
	JSONObject createJSONObject();

	/**
	 * Returns a new object of class '<em>JSON Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Array</em>'.
	 * @generated
	 */
	JSONArray createJSONArray();

	/**
	 * Returns a new object of class '<em>JSON Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Primitive</em>'.
	 * @generated
	 */
	JSONPrimitive createJSONPrimitive();

	/**
	 * Returns a new object of class '<em>JSON String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON String</em>'.
	 * @generated
	 */
	JSONString createJSONString();

	/**
	 * Returns a new object of class '<em>JSON Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Int</em>'.
	 * @generated
	 */
	JSONInt createJSONInt();

	/**
	 * Returns a new object of class '<em>JSON Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Float</em>'.
	 * @generated
	 */
	JSONFloat createJSONFloat();

	/**
	 * Returns a new object of class '<em>JSON Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Boolean</em>'.
	 * @generated
	 */
	JSONBoolean createJSONBoolean();

	/**
	 * Returns a new object of class '<em>Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bucket</em>'.
	 * @generated
	 */
	Bucket createBucket();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CouchbasePackage getCouchbasePackage();

} //CouchbaseFactory
