/**
 */
package couchbase.impl;

import couchbase.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CouchbaseFactoryImpl extends EFactoryImpl implements CouchbaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CouchbaseFactory init() {
		try {
			CouchbaseFactory theCouchbaseFactory = (CouchbaseFactory)EPackage.Registry.INSTANCE.getEFactory(CouchbasePackage.eNS_URI);
			if (theCouchbaseFactory != null) {
				return theCouchbaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CouchbaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouchbaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CouchbasePackage.JSON_ELEMENT: return createJSONElement();
			case CouchbasePackage.JSON_OBJECT: return createJSONObject();
			case CouchbasePackage.JSON_ARRAY: return createJSONArray();
			case CouchbasePackage.JSON_PRIMITIVE: return createJSONPrimitive();
			case CouchbasePackage.JSON_STRING: return createJSONString();
			case CouchbasePackage.JSON_INT: return createJSONInt();
			case CouchbasePackage.JSON_FLOAT: return createJSONFloat();
			case CouchbasePackage.JSON_BOOLEAN: return createJSONBoolean();
			case CouchbasePackage.ESTRING_TO_JSON_ELEMENT: return (EObject)createEStringToJSONElement();
			case CouchbasePackage.BUCKET: return createBucket();
			case CouchbasePackage.DOCUMENT: return createDocument();
			case CouchbasePackage.ESTRING_TO_DOCUMENT: return (EObject)createEStringToDocument();
			case CouchbasePackage.METADATA: return createMetadata();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONElement createJSONElement() {
		JSONElementImpl jsonElement = new JSONElementImpl();
		return jsonElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createJSONObject() {
		JSONObjectImpl jsonObject = new JSONObjectImpl();
		return jsonObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONArray createJSONArray() {
		JSONArrayImpl jsonArray = new JSONArrayImpl();
		return jsonArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONPrimitive createJSONPrimitive() {
		JSONPrimitiveImpl jsonPrimitive = new JSONPrimitiveImpl();
		return jsonPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONString createJSONString() {
		JSONStringImpl jsonString = new JSONStringImpl();
		return jsonString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONInt createJSONInt() {
		JSONIntImpl jsonInt = new JSONIntImpl();
		return jsonInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONFloat createJSONFloat() {
		JSONFloatImpl jsonFloat = new JSONFloatImpl();
		return jsonFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONBoolean createJSONBoolean() {
		JSONBooleanImpl jsonBoolean = new JSONBooleanImpl();
		return jsonBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, JSONElement> createEStringToJSONElement() {
		EStringToJSONElementImpl eStringToJSONElement = new EStringToJSONElementImpl();
		return eStringToJSONElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bucket createBucket() {
		BucketImpl bucket = new BucketImpl();
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Document> createEStringToDocument() {
		EStringToDocumentImpl eStringToDocument = new EStringToDocumentImpl();
		return eStringToDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouchbasePackage getCouchbasePackage() {
		return (CouchbasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CouchbasePackage getPackage() {
		return CouchbasePackage.eINSTANCE;
	}

} //CouchbaseFactoryImpl
