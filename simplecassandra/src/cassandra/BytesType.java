/**
 */
package cassandra;

import java.sql.Blob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bytes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cassandra.BytesType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see cassandra.CassandraPackage#getBytesType()
 * @model
 * @generated
 */
public interface BytesType extends DataType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Blob)
	 * @see cassandra.CassandraPackage#getBytesType_Value()
	 * @model dataType="cassandra.Bytes"
	 * @generated
	 */
	Blob getValue();

	/**
	 * Sets the value of the '{@link cassandra.BytesType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Blob value);

} // BytesType
