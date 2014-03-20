/**
 */
package couchbase.util;

import couchbase.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see couchbase.CouchbasePackage
 * @generated
 */
public class CouchbaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CouchbasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouchbaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CouchbasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CouchbaseSwitch<Adapter> modelSwitch =
		new CouchbaseSwitch<Adapter>() {
			@Override
			public Adapter caseJSONElement(JSONElement object) {
				return createJSONElementAdapter();
			}
			@Override
			public Adapter caseJSONObject(JSONObject object) {
				return createJSONObjectAdapter();
			}
			@Override
			public Adapter caseJSONArray(JSONArray object) {
				return createJSONArrayAdapter();
			}
			@Override
			public Adapter caseJSONPrimitive(JSONPrimitive object) {
				return createJSONPrimitiveAdapter();
			}
			@Override
			public Adapter caseJSONString(JSONString object) {
				return createJSONStringAdapter();
			}
			@Override
			public Adapter caseJSONInt(JSONInt object) {
				return createJSONIntAdapter();
			}
			@Override
			public Adapter caseJSONFloat(JSONFloat object) {
				return createJSONFloatAdapter();
			}
			@Override
			public Adapter caseJSONBoolean(JSONBoolean object) {
				return createJSONBooleanAdapter();
			}
			@Override
			public Adapter caseEStringToJSONElement(Map.Entry<String, JSONElement> object) {
				return createEStringToJSONElementAdapter();
			}
			@Override
			public Adapter caseBucket(Bucket object) {
				return createBucketAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseEStringToDocument(Map.Entry<String, Document> object) {
				return createEStringToDocumentAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link couchbase.JSONElement <em>JSON Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.JSONElement
	 * @generated
	 */
	public Adapter createJSONElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.JSONObject <em>JSON Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.JSONObject
	 * @generated
	 */
	public Adapter createJSONObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.JSONArray <em>JSON Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.JSONArray
	 * @generated
	 */
	public Adapter createJSONArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.JSONPrimitive <em>JSON Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.JSONPrimitive
	 * @generated
	 */
	public Adapter createJSONPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.JSONString <em>JSON String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.JSONString
	 * @generated
	 */
	public Adapter createJSONStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.JSONInt <em>JSON Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.JSONInt
	 * @generated
	 */
	public Adapter createJSONIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.JSONFloat <em>JSON Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.JSONFloat
	 * @generated
	 */
	public Adapter createJSONFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.JSONBoolean <em>JSON Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.JSONBoolean
	 * @generated
	 */
	public Adapter createJSONBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To JSON Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToJSONElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.Bucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.Bucket
	 * @generated
	 */
	public Adapter createBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link couchbase.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see couchbase.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CouchbaseAdapterFactory
