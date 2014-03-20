/**
 */
package cassandra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A column family is a container for columns, like the table in a relational system.
 * A column family holds an ordered list of columns, which you can reference by the column name.
 * For all column families, each row is uniquely identified by its row key, similar to the primary key in a relational table. A column family is always partitioned on its row key, and the row key is always implicitly indexed.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cassandra.ColumnFamily#getName <em>Name</em>}</li>
 *   <li>{@link cassandra.ColumnFamily#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see cassandra.CassandraPackage#getColumnFamily()
 * @model
 * @generated
 */
public interface ColumnFamily extends EObject {
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
	 * @see cassandra.CassandraPackage#getColumnFamily_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cassandra.ColumnFamily#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link cassandra.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see cassandra.CassandraPackage#getColumnFamily_Rows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Row> getRows();

} // ColumnFamily
