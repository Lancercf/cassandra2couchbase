/**
 */
package cassandra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cassandra.Keyspace#getName <em>Name</em>}</li>
 *   <li>{@link cassandra.Keyspace#getColumnfamilies <em>Columnfamilies</em>}</li>
 * </ul>
 * </p>
 *
 * @see cassandra.CassandraPackage#getKeyspace()
 * @model
 * @generated
 */
public interface Keyspace extends EObject {
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
	 * @see cassandra.CassandraPackage#getKeyspace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cassandra.Keyspace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columnfamilies</b></em>' containment reference list.
	 * The list contents are of type {@link cassandra.ColumnFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnfamilies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnfamilies</em>' containment reference list.
	 * @see cassandra.CassandraPackage#getKeyspace_Columnfamilies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ColumnFamily> getColumnfamilies();

} // Keyspace
