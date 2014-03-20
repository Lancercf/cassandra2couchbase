/**
 */
package couchbase.util;

import couchbase.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see couchbase.CouchbasePackage
 * @generated
 */
public class CouchbaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CouchbasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouchbaseSwitch() {
		if (modelPackage == null) {
			modelPackage = CouchbasePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CouchbasePackage.JSON_ELEMENT: {
				JSONElement jsonElement = (JSONElement)theEObject;
				T result = caseJSONElement(jsonElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.JSON_OBJECT: {
				JSONObject jsonObject = (JSONObject)theEObject;
				T result = caseJSONObject(jsonObject);
				if (result == null) result = caseJSONElement(jsonObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.JSON_ARRAY: {
				JSONArray jsonArray = (JSONArray)theEObject;
				T result = caseJSONArray(jsonArray);
				if (result == null) result = caseJSONElement(jsonArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.JSON_PRIMITIVE: {
				JSONPrimitive jsonPrimitive = (JSONPrimitive)theEObject;
				T result = caseJSONPrimitive(jsonPrimitive);
				if (result == null) result = caseJSONElement(jsonPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.JSON_STRING: {
				JSONString jsonString = (JSONString)theEObject;
				T result = caseJSONString(jsonString);
				if (result == null) result = caseJSONPrimitive(jsonString);
				if (result == null) result = caseJSONElement(jsonString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.JSON_INT: {
				JSONInt jsonInt = (JSONInt)theEObject;
				T result = caseJSONInt(jsonInt);
				if (result == null) result = caseJSONPrimitive(jsonInt);
				if (result == null) result = caseJSONElement(jsonInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.JSON_FLOAT: {
				JSONFloat jsonFloat = (JSONFloat)theEObject;
				T result = caseJSONFloat(jsonFloat);
				if (result == null) result = caseJSONPrimitive(jsonFloat);
				if (result == null) result = caseJSONElement(jsonFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.JSON_BOOLEAN: {
				JSONBoolean jsonBoolean = (JSONBoolean)theEObject;
				T result = caseJSONBoolean(jsonBoolean);
				if (result == null) result = caseJSONPrimitive(jsonBoolean);
				if (result == null) result = caseJSONElement(jsonBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.ESTRING_TO_JSON_ELEMENT: {
				@SuppressWarnings("unchecked") Map.Entry<String, JSONElement> eStringToJSONElement = (Map.Entry<String, JSONElement>)theEObject;
				T result = caseEStringToJSONElement(eStringToJSONElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.BUCKET: {
				Bucket bucket = (Bucket)theEObject;
				T result = caseBucket(bucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseJSONObject(document);
				if (result == null) result = caseJSONElement(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.ESTRING_TO_DOCUMENT: {
				@SuppressWarnings("unchecked") Map.Entry<String, Document> eStringToDocument = (Map.Entry<String, Document>)theEObject;
				T result = caseEStringToDocument(eStringToDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CouchbasePackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONElement(JSONElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONObject(JSONObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONArray(JSONArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONPrimitive(JSONPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONString(JSONString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONInt(JSONInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONFloat(JSONFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONBoolean(JSONBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To JSON Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To JSON Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToJSONElement(Map.Entry<String, JSONElement> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBucket(Bucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToDocument(Map.Entry<String, Document> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CouchbaseSwitch
