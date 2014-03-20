/**
 */
package couchbase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see couchbase.CouchbaseFactory
 * @model kind="package"
 * @generated
 */
public interface CouchbasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "couchbase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "couchbase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "couchbase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CouchbasePackage eINSTANCE = couchbase.impl.CouchbasePackageImpl.init();

	/**
	 * The meta object id for the '{@link couchbase.impl.JSONElementImpl <em>JSON Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.JSONElementImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getJSONElement()
	 * @generated
	 */
	int JSON_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>JSON Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>JSON Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.JSONObjectImpl <em>JSON Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.JSONObjectImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getJSONObject()
	 * @generated
	 */
	int JSON_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__MAP = JSON_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSON Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_FEATURE_COUNT = JSON_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSON Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_OPERATION_COUNT = JSON_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.JSONArrayImpl <em>JSON Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.JSONArrayImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getJSONArray()
	 * @generated
	 */
	int JSON_ARRAY = 2;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY__ARRAY = JSON_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSON Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY_FEATURE_COUNT = JSON_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSON Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY_OPERATION_COUNT = JSON_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.JSONPrimitiveImpl <em>JSON Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.JSONPrimitiveImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getJSONPrimitive()
	 * @generated
	 */
	int JSON_PRIMITIVE = 3;

	/**
	 * The number of structural features of the '<em>JSON Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PRIMITIVE_FEATURE_COUNT = JSON_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JSON Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PRIMITIVE_OPERATION_COUNT = JSON_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.JSONStringImpl <em>JSON String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.JSONStringImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getJSONString()
	 * @generated
	 */
	int JSON_STRING = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_STRING__VALUE = JSON_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSON String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_STRING_FEATURE_COUNT = JSON_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSON String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_STRING_OPERATION_COUNT = JSON_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.JSONIntImpl <em>JSON Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.JSONIntImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getJSONInt()
	 * @generated
	 */
	int JSON_INT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_INT__VALUE = JSON_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSON Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_INT_FEATURE_COUNT = JSON_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSON Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_INT_OPERATION_COUNT = JSON_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.JSONFloatImpl <em>JSON Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.JSONFloatImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getJSONFloat()
	 * @generated
	 */
	int JSON_FLOAT = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FLOAT__VALUE = JSON_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSON Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FLOAT_FEATURE_COUNT = JSON_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSON Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FLOAT_OPERATION_COUNT = JSON_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.JSONBooleanImpl <em>JSON Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.JSONBooleanImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getJSONBoolean()
	 * @generated
	 */
	int JSON_BOOLEAN = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_BOOLEAN__VALUE = JSON_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSON Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_BOOLEAN_FEATURE_COUNT = JSON_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSON Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_BOOLEAN_OPERATION_COUNT = JSON_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.EStringToJSONElementImpl <em>EString To JSON Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.EStringToJSONElementImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getEStringToJSONElement()
	 * @generated
	 */
	int ESTRING_TO_JSON_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_JSON_ELEMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_JSON_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To JSON Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_JSON_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To JSON Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_JSON_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.BucketImpl <em>Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.BucketImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getBucket()
	 * @generated
	 */
	int BUCKET = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__DOCUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.DocumentImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 10;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MAP = JSON_OBJECT__MAP;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__META = JSON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = JSON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = JSON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.EStringToDocumentImpl <em>EString To Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.EStringToDocumentImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getEStringToDocument()
	 * @generated
	 */
	int ESTRING_TO_DOCUMENT = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_DOCUMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_DOCUMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link couchbase.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see couchbase.impl.MetadataImpl
	 * @see couchbase.impl.CouchbasePackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ID = 0;

	/**
	 * The feature id for the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__REV = 1;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__EXPIRATION = 2;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__FLAGS = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link couchbase.JSONElement <em>JSON Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Element</em>'.
	 * @see couchbase.JSONElement
	 * @generated
	 */
	EClass getJSONElement();

	/**
	 * Returns the meta object for class '{@link couchbase.JSONObject <em>JSON Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Object</em>'.
	 * @see couchbase.JSONObject
	 * @generated
	 */
	EClass getJSONObject();

	/**
	 * Returns the meta object for the reference list '{@link couchbase.JSONObject#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Map</em>'.
	 * @see couchbase.JSONObject#getMap()
	 * @see #getJSONObject()
	 * @generated
	 */
	EReference getJSONObject_Map();

	/**
	 * Returns the meta object for class '{@link couchbase.JSONArray <em>JSON Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Array</em>'.
	 * @see couchbase.JSONArray
	 * @generated
	 */
	EClass getJSONArray();

	/**
	 * Returns the meta object for the reference list '{@link couchbase.JSONArray#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Array</em>'.
	 * @see couchbase.JSONArray#getArray()
	 * @see #getJSONArray()
	 * @generated
	 */
	EReference getJSONArray_Array();

	/**
	 * Returns the meta object for class '{@link couchbase.JSONPrimitive <em>JSON Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Primitive</em>'.
	 * @see couchbase.JSONPrimitive
	 * @generated
	 */
	EClass getJSONPrimitive();

	/**
	 * Returns the meta object for class '{@link couchbase.JSONString <em>JSON String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON String</em>'.
	 * @see couchbase.JSONString
	 * @generated
	 */
	EClass getJSONString();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.JSONString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see couchbase.JSONString#getValue()
	 * @see #getJSONString()
	 * @generated
	 */
	EAttribute getJSONString_Value();

	/**
	 * Returns the meta object for class '{@link couchbase.JSONInt <em>JSON Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Int</em>'.
	 * @see couchbase.JSONInt
	 * @generated
	 */
	EClass getJSONInt();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.JSONInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see couchbase.JSONInt#getValue()
	 * @see #getJSONInt()
	 * @generated
	 */
	EAttribute getJSONInt_Value();

	/**
	 * Returns the meta object for class '{@link couchbase.JSONFloat <em>JSON Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Float</em>'.
	 * @see couchbase.JSONFloat
	 * @generated
	 */
	EClass getJSONFloat();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.JSONFloat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see couchbase.JSONFloat#getValue()
	 * @see #getJSONFloat()
	 * @generated
	 */
	EAttribute getJSONFloat_Value();

	/**
	 * Returns the meta object for class '{@link couchbase.JSONBoolean <em>JSON Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Boolean</em>'.
	 * @see couchbase.JSONBoolean
	 * @generated
	 */
	EClass getJSONBoolean();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.JSONBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see couchbase.JSONBoolean#isValue()
	 * @see #getJSONBoolean()
	 * @generated
	 */
	EAttribute getJSONBoolean_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To JSON Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To JSON Element</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="couchbase.JSONElement" valueRequired="true"
	 * @generated
	 */
	EClass getEStringToJSONElement();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToJSONElement()
	 * @generated
	 */
	EAttribute getEStringToJSONElement_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToJSONElement()
	 * @generated
	 */
	EReference getEStringToJSONElement_Value();

	/**
	 * Returns the meta object for class '{@link couchbase.Bucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bucket</em>'.
	 * @see couchbase.Bucket
	 * @generated
	 */
	EClass getBucket();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.Bucket#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see couchbase.Bucket#getName()
	 * @see #getBucket()
	 * @generated
	 */
	EAttribute getBucket_Name();

	/**
	 * Returns the meta object for the reference list '{@link couchbase.Bucket#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see couchbase.Bucket#getDocuments()
	 * @see #getBucket()
	 * @generated
	 */
	EReference getBucket_Documents();

	/**
	 * Returns the meta object for class '{@link couchbase.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see couchbase.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the reference '{@link couchbase.Document#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta</em>'.
	 * @see couchbase.Document#getMeta()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Meta();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To Document</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="couchbase.Document" valueRequired="true"
	 * @generated
	 */
	EClass getEStringToDocument();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToDocument()
	 * @generated
	 */
	EAttribute getEStringToDocument_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToDocument()
	 * @generated
	 */
	EReference getEStringToDocument_Value();

	/**
	 * Returns the meta object for class '{@link couchbase.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see couchbase.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.Metadata#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see couchbase.Metadata#getId()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Id();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.Metadata#getRev <em>Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rev</em>'.
	 * @see couchbase.Metadata#getRev()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Rev();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.Metadata#getExpiration <em>Expiration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration</em>'.
	 * @see couchbase.Metadata#getExpiration()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Expiration();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.Metadata#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see couchbase.Metadata#getFlags()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Flags();

	/**
	 * Returns the meta object for the attribute '{@link couchbase.Metadata#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see couchbase.Metadata#getType()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CouchbaseFactory getCouchbaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link couchbase.impl.JSONElementImpl <em>JSON Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.JSONElementImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getJSONElement()
		 * @generated
		 */
		EClass JSON_ELEMENT = eINSTANCE.getJSONElement();

		/**
		 * The meta object literal for the '{@link couchbase.impl.JSONObjectImpl <em>JSON Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.JSONObjectImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getJSONObject()
		 * @generated
		 */
		EClass JSON_OBJECT = eINSTANCE.getJSONObject();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_OBJECT__MAP = eINSTANCE.getJSONObject_Map();

		/**
		 * The meta object literal for the '{@link couchbase.impl.JSONArrayImpl <em>JSON Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.JSONArrayImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getJSONArray()
		 * @generated
		 */
		EClass JSON_ARRAY = eINSTANCE.getJSONArray();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_ARRAY__ARRAY = eINSTANCE.getJSONArray_Array();

		/**
		 * The meta object literal for the '{@link couchbase.impl.JSONPrimitiveImpl <em>JSON Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.JSONPrimitiveImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getJSONPrimitive()
		 * @generated
		 */
		EClass JSON_PRIMITIVE = eINSTANCE.getJSONPrimitive();

		/**
		 * The meta object literal for the '{@link couchbase.impl.JSONStringImpl <em>JSON String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.JSONStringImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getJSONString()
		 * @generated
		 */
		EClass JSON_STRING = eINSTANCE.getJSONString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_STRING__VALUE = eINSTANCE.getJSONString_Value();

		/**
		 * The meta object literal for the '{@link couchbase.impl.JSONIntImpl <em>JSON Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.JSONIntImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getJSONInt()
		 * @generated
		 */
		EClass JSON_INT = eINSTANCE.getJSONInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_INT__VALUE = eINSTANCE.getJSONInt_Value();

		/**
		 * The meta object literal for the '{@link couchbase.impl.JSONFloatImpl <em>JSON Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.JSONFloatImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getJSONFloat()
		 * @generated
		 */
		EClass JSON_FLOAT = eINSTANCE.getJSONFloat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_FLOAT__VALUE = eINSTANCE.getJSONFloat_Value();

		/**
		 * The meta object literal for the '{@link couchbase.impl.JSONBooleanImpl <em>JSON Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.JSONBooleanImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getJSONBoolean()
		 * @generated
		 */
		EClass JSON_BOOLEAN = eINSTANCE.getJSONBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_BOOLEAN__VALUE = eINSTANCE.getJSONBoolean_Value();

		/**
		 * The meta object literal for the '{@link couchbase.impl.EStringToJSONElementImpl <em>EString To JSON Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.EStringToJSONElementImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getEStringToJSONElement()
		 * @generated
		 */
		EClass ESTRING_TO_JSON_ELEMENT = eINSTANCE.getEStringToJSONElement();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_JSON_ELEMENT__KEY = eINSTANCE.getEStringToJSONElement_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_JSON_ELEMENT__VALUE = eINSTANCE.getEStringToJSONElement_Value();

		/**
		 * The meta object literal for the '{@link couchbase.impl.BucketImpl <em>Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.BucketImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getBucket()
		 * @generated
		 */
		EClass BUCKET = eINSTANCE.getBucket();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUCKET__NAME = eINSTANCE.getBucket_Name();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUCKET__DOCUMENTS = eINSTANCE.getBucket_Documents();

		/**
		 * The meta object literal for the '{@link couchbase.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.DocumentImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__META = eINSTANCE.getDocument_Meta();

		/**
		 * The meta object literal for the '{@link couchbase.impl.EStringToDocumentImpl <em>EString To Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.EStringToDocumentImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getEStringToDocument()
		 * @generated
		 */
		EClass ESTRING_TO_DOCUMENT = eINSTANCE.getEStringToDocument();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_DOCUMENT__KEY = eINSTANCE.getEStringToDocument_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_DOCUMENT__VALUE = eINSTANCE.getEStringToDocument_Value();

		/**
		 * The meta object literal for the '{@link couchbase.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see couchbase.impl.MetadataImpl
		 * @see couchbase.impl.CouchbasePackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__ID = eINSTANCE.getMetadata_Id();

		/**
		 * The meta object literal for the '<em><b>Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__REV = eINSTANCE.getMetadata_Rev();

		/**
		 * The meta object literal for the '<em><b>Expiration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__EXPIRATION = eINSTANCE.getMetadata_Expiration();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__FLAGS = eINSTANCE.getMetadata_Flags();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__TYPE = eINSTANCE.getMetadata_Type();

	}

} //CouchbasePackage
