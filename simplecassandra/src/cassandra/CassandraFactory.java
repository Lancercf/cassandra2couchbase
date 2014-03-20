/**
 */
package cassandra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cassandra.CassandraPackage
 * @generated
 */
public interface CassandraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CassandraFactory eINSTANCE = cassandra.impl.CassandraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Keyspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyspace</em>'.
	 * @generated
	 */
	Keyspace createKeyspace();

	/**
	 * Returns a new object of class '<em>Column Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Family</em>'.
	 * @generated
	 */
	ColumnFamily createColumnFamily();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Super Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Column</em>'.
	 * @generated
	 */
	SuperColumn createSuperColumn();

	/**
	 * Returns a new object of class '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Type</em>'.
	 * @generated
	 */
	IntegerType createIntegerType();

	/**
	 * Returns a new object of class '<em>UTF8 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UTF8 Type</em>'.
	 * @generated
	 */
	UTF8Type createUTF8Type();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Type</em>'.
	 * @generated
	 */
	FloatType createFloatType();

	/**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
	BooleanType createBooleanType();

	/**
	 * Returns a new object of class '<em>UUID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UUID Type</em>'.
	 * @generated
	 */
	UUIDType createUUIDType();

	/**
	 * Returns a new object of class '<em>Ascii Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ascii Type</em>'.
	 * @generated
	 */
	AsciiType createAsciiType();

	/**
	 * Returns a new object of class '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Type</em>'.
	 * @generated
	 */
	DoubleType createDoubleType();

	/**
	 * Returns a new object of class '<em>Counter Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter Column Type</em>'.
	 * @generated
	 */
	CounterColumnType createCounterColumnType();

	/**
	 * Returns a new object of class '<em>Decimal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Type</em>'.
	 * @generated
	 */
	DecimalType createDecimalType();

	/**
	 * Returns a new object of class '<em>Bytes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bytes Type</em>'.
	 * @generated
	 */
	BytesType createBytesType();

	/**
	 * Returns a new object of class '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Type</em>'.
	 * @generated
	 */
	DateType createDateType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CassandraPackage getCassandraPackage();

} //CassandraFactory
