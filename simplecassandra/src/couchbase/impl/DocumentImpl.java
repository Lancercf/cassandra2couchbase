/**
 */
package couchbase.impl;

import couchbase.CouchbasePackage;
import couchbase.Document;
import couchbase.Metadata;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link couchbase.impl.DocumentImpl#getMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends JSONObjectImpl implements Document {
	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected Metadata meta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CouchbasePackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMeta() {
		if (meta != null && meta.eIsProxy()) {
			InternalEObject oldMeta = (InternalEObject)meta;
			meta = (Metadata)eResolveProxy(oldMeta);
			if (meta != oldMeta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CouchbasePackage.DOCUMENT__META, oldMeta, meta));
			}
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata basicGetMeta() {
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeta(Metadata newMeta) {
		Metadata oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CouchbasePackage.DOCUMENT__META, oldMeta, meta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CouchbasePackage.DOCUMENT__META:
				if (resolve) return getMeta();
				return basicGetMeta();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CouchbasePackage.DOCUMENT__META:
				setMeta((Metadata)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CouchbasePackage.DOCUMENT__META:
				setMeta((Metadata)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CouchbasePackage.DOCUMENT__META:
				return meta != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		//if (eIsProxy()) return meta.toString();

		StringBuffer result = new StringBuffer();
		result.append("{\"");
		result.append(meta.getId());
		result.append("\":");
		return result.toString();
	}

} //DocumentImpl
