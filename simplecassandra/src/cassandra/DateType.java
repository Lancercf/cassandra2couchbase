/**
 */
package cassandra;

import java.sql.Timestamp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cassandra.DateType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see cassandra.CassandraPackage#getDateType()
 * @model
 * @generated
 */
public interface DateType extends DataType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Timestamp)
	 * @see cassandra.CassandraPackage#getDateType_Value()
	 * @model dataType="cassandra.Timestamp"
	 * @generated
	 */
	Timestamp getValue();

	/**
	 * Sets the value of the '{@link cassandra.DateType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Timestamp value);

} // DateType
