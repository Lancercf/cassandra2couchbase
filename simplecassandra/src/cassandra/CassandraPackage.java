/**
 */
package cassandra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * <!-- begin-model-doc -->
 *  Keyspaces are quite simple, from an RDBMS point of view you can compare this to your schema, normally you have one per application. A keyspace contains the ColumnFamilies. 
 * <!-- end-model-doc -->
 * @see cassandra.CassandraFactory
 * @model kind="package"
 * @generated
 */
public interface CassandraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cassandra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cass/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cassandra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CassandraPackage eINSTANCE = cassandra.impl.CassandraPackageImpl.init();

	/**
	 * The meta object id for the '{@link cassandra.impl.KeyspaceImpl <em>Keyspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.KeyspaceImpl
	 * @see cassandra.impl.CassandraPackageImpl#getKeyspace()
	 * @generated
	 */
	int KEYSPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYSPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columnfamilies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYSPACE__COLUMNFAMILIES = 1;

	/**
	 * The number of structural features of the '<em>Keyspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYSPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Keyspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYSPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.ColumnFamilyImpl <em>Column Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.ColumnFamilyImpl
	 * @see cassandra.impl.CassandraPackageImpl#getColumnFamily()
	 * @generated
	 */
	int COLUMN_FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FAMILY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FAMILY__ROWS = 1;

	/**
	 * The number of structural features of the '<em>Column Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FAMILY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FAMILY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.RowImpl
	 * @see cassandra.impl.CassandraPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__KEY = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Supercolumns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SUPERCOLUMNS = 2;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.ColumnImpl
	 * @see cassandra.impl.CassandraPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__KEY = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.SuperColumnImpl <em>Super Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.SuperColumnImpl
	 * @see cassandra.impl.CassandraPackageImpl#getSuperColumn()
	 * @generated
	 */
	int SUPER_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COLUMN__KEY = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COLUMN__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Super Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Super Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.DataTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.IntegerTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.UTF8TypeImpl <em>UTF8 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.UTF8TypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getUTF8Type()
	 * @generated
	 */
	int UTF8_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTF8_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UTF8 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTF8_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UTF8 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTF8_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.FloatTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.BooleanTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.UUIDTypeImpl <em>UUID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.UUIDTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getUUIDType()
	 * @generated
	 */
	int UUID_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UUID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UUID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.AsciiTypeImpl <em>Ascii Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.AsciiTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getAsciiType()
	 * @generated
	 */
	int ASCII_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCII_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ascii Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCII_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ascii Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCII_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.DoubleTypeImpl <em>Double Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.DoubleTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getDoubleType()
	 * @generated
	 */
	int DOUBLE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.CounterColumnTypeImpl <em>Counter Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.CounterColumnTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getCounterColumnType()
	 * @generated
	 */
	int COUNTER_COLUMN_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_COLUMN_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Counter Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_COLUMN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Counter Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_COLUMN_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.DecimalTypeImpl <em>Decimal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.DecimalTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getDecimalType()
	 * @generated
	 */
	int DECIMAL_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.BytesTypeImpl <em>Bytes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.BytesTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getBytesType()
	 * @generated
	 */
	int BYTES_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTES_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bytes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTES_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bytes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTES_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cassandra.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cassandra.impl.DateTypeImpl
	 * @see cassandra.impl.CassandraPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see cassandra.impl.CassandraPackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 17;

	/**
	 * The meta object id for the '<em>Bytes</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Blob
	 * @see cassandra.impl.CassandraPackageImpl#getBytes()
	 * @generated
	 */
	int BYTES = 18;

	/**
	 * The meta object id for the '<em>Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see cassandra.impl.CassandraPackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 19;


	/**
	 * Returns the meta object for class '{@link cassandra.Keyspace <em>Keyspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyspace</em>'.
	 * @see cassandra.Keyspace
	 * @generated
	 */
	EClass getKeyspace();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.Keyspace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cassandra.Keyspace#getName()
	 * @see #getKeyspace()
	 * @generated
	 */
	EAttribute getKeyspace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cassandra.Keyspace#getColumnfamilies <em>Columnfamilies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columnfamilies</em>'.
	 * @see cassandra.Keyspace#getColumnfamilies()
	 * @see #getKeyspace()
	 * @generated
	 */
	EReference getKeyspace_Columnfamilies();

	/**
	 * Returns the meta object for class '{@link cassandra.ColumnFamily <em>Column Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Family</em>'.
	 * @see cassandra.ColumnFamily
	 * @generated
	 */
	EClass getColumnFamily();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.ColumnFamily#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cassandra.ColumnFamily#getName()
	 * @see #getColumnFamily()
	 * @generated
	 */
	EAttribute getColumnFamily_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cassandra.ColumnFamily#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see cassandra.ColumnFamily#getRows()
	 * @see #getColumnFamily()
	 * @generated
	 */
	EReference getColumnFamily_Rows();

	/**
	 * Returns the meta object for class '{@link cassandra.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see cassandra.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.Row#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cassandra.Row#getKey()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link cassandra.Row#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see cassandra.Row#getColumns()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link cassandra.Row#getSupercolumns <em>Supercolumns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supercolumns</em>'.
	 * @see cassandra.Row#getSupercolumns()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Supercolumns();

	/**
	 * Returns the meta object for class '{@link cassandra.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see cassandra.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.Column#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cassandra.Column#getKey()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Key();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.Column#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see cassandra.Column#getTimestamp()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link cassandra.Column#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see cassandra.Column#getValue()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.SuperColumn <em>Super Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Column</em>'.
	 * @see cassandra.SuperColumn
	 * @generated
	 */
	EClass getSuperColumn();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.SuperColumn#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cassandra.SuperColumn#getKey()
	 * @see #getSuperColumn()
	 * @generated
	 */
	EAttribute getSuperColumn_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link cassandra.SuperColumn#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see cassandra.SuperColumn#getColumns()
	 * @see #getSuperColumn()
	 * @generated
	 */
	EReference getSuperColumn_Columns();

	/**
	 * Returns the meta object for class '{@link cassandra.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see cassandra.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.IntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.IntegerType#getValue()
	 * @see #getIntegerType()
	 * @generated
	 */
	EAttribute getIntegerType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.UTF8Type <em>UTF8 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UTF8 Type</em>'.
	 * @see cassandra.UTF8Type
	 * @generated
	 */
	EClass getUTF8Type();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.UTF8Type#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.UTF8Type#getValue()
	 * @see #getUTF8Type()
	 * @generated
	 */
	EAttribute getUTF8Type_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see cassandra.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link cassandra.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see cassandra.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.FloatType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.FloatType#getValue()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see cassandra.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.BooleanType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.BooleanType#isValue()
	 * @see #getBooleanType()
	 * @generated
	 */
	EAttribute getBooleanType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.UUIDType <em>UUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UUID Type</em>'.
	 * @see cassandra.UUIDType
	 * @generated
	 */
	EClass getUUIDType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.UUIDType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.UUIDType#getValue()
	 * @see #getUUIDType()
	 * @generated
	 */
	EAttribute getUUIDType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.AsciiType <em>Ascii Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ascii Type</em>'.
	 * @see cassandra.AsciiType
	 * @generated
	 */
	EClass getAsciiType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.AsciiType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.AsciiType#getValue()
	 * @see #getAsciiType()
	 * @generated
	 */
	EAttribute getAsciiType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Type</em>'.
	 * @see cassandra.DoubleType
	 * @generated
	 */
	EClass getDoubleType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.DoubleType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.DoubleType#getValue()
	 * @see #getDoubleType()
	 * @generated
	 */
	EAttribute getDoubleType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.CounterColumnType <em>Counter Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter Column Type</em>'.
	 * @see cassandra.CounterColumnType
	 * @generated
	 */
	EClass getCounterColumnType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.CounterColumnType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.CounterColumnType#getValue()
	 * @see #getCounterColumnType()
	 * @generated
	 */
	EAttribute getCounterColumnType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Type</em>'.
	 * @see cassandra.DecimalType
	 * @generated
	 */
	EClass getDecimalType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.DecimalType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.DecimalType#getValue()
	 * @see #getDecimalType()
	 * @generated
	 */
	EAttribute getDecimalType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.BytesType <em>Bytes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bytes Type</em>'.
	 * @see cassandra.BytesType
	 * @generated
	 */
	EClass getBytesType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.BytesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.BytesType#getValue()
	 * @see #getBytesType()
	 * @generated
	 */
	EAttribute getBytesType_Value();

	/**
	 * Returns the meta object for class '{@link cassandra.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see cassandra.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for the attribute '{@link cassandra.DateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cassandra.DateType#getValue()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Value();

	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the meta object for data type '{@link java.sql.Blob <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bytes</em>'.
	 * @see java.sql.Blob
	 * @model instanceClass="java.sql.Blob"
	 * @generated
	 */
	EDataType getBytes();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Decimal</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 * @generated
	 */
	EDataType getDecimal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CassandraFactory getCassandraFactory();

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
		 * The meta object literal for the '{@link cassandra.impl.KeyspaceImpl <em>Keyspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.KeyspaceImpl
		 * @see cassandra.impl.CassandraPackageImpl#getKeyspace()
		 * @generated
		 */
		EClass KEYSPACE = eINSTANCE.getKeyspace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYSPACE__NAME = eINSTANCE.getKeyspace_Name();

		/**
		 * The meta object literal for the '<em><b>Columnfamilies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYSPACE__COLUMNFAMILIES = eINSTANCE.getKeyspace_Columnfamilies();

		/**
		 * The meta object literal for the '{@link cassandra.impl.ColumnFamilyImpl <em>Column Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.ColumnFamilyImpl
		 * @see cassandra.impl.CassandraPackageImpl#getColumnFamily()
		 * @generated
		 */
		EClass COLUMN_FAMILY = eINSTANCE.getColumnFamily();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_FAMILY__NAME = eINSTANCE.getColumnFamily_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_FAMILY__ROWS = eINSTANCE.getColumnFamily_Rows();

		/**
		 * The meta object literal for the '{@link cassandra.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.RowImpl
		 * @see cassandra.impl.CassandraPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__KEY = eINSTANCE.getRow_Key();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__COLUMNS = eINSTANCE.getRow_Columns();

		/**
		 * The meta object literal for the '<em><b>Supercolumns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__SUPERCOLUMNS = eINSTANCE.getRow_Supercolumns();

		/**
		 * The meta object literal for the '{@link cassandra.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.ColumnImpl
		 * @see cassandra.impl.CassandraPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__KEY = eINSTANCE.getColumn_Key();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TIMESTAMP = eINSTANCE.getColumn_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__VALUE = eINSTANCE.getColumn_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.SuperColumnImpl <em>Super Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.SuperColumnImpl
		 * @see cassandra.impl.CassandraPackageImpl#getSuperColumn()
		 * @generated
		 */
		EClass SUPER_COLUMN = eINSTANCE.getSuperColumn();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_COLUMN__KEY = eINSTANCE.getSuperColumn_Key();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_COLUMN__COLUMNS = eINSTANCE.getSuperColumn_Columns();

		/**
		 * The meta object literal for the '{@link cassandra.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.IntegerTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE__VALUE = eINSTANCE.getIntegerType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.UTF8TypeImpl <em>UTF8 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.UTF8TypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getUTF8Type()
		 * @generated
		 */
		EClass UTF8_TYPE = eINSTANCE.getUTF8Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTF8_TYPE__VALUE = eINSTANCE.getUTF8Type_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.DataTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link cassandra.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.FloatTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__VALUE = eINSTANCE.getFloatType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.BooleanTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_TYPE__VALUE = eINSTANCE.getBooleanType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.UUIDTypeImpl <em>UUID Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.UUIDTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getUUIDType()
		 * @generated
		 */
		EClass UUID_TYPE = eINSTANCE.getUUIDType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UUID_TYPE__VALUE = eINSTANCE.getUUIDType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.AsciiTypeImpl <em>Ascii Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.AsciiTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getAsciiType()
		 * @generated
		 */
		EClass ASCII_TYPE = eINSTANCE.getAsciiType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASCII_TYPE__VALUE = eINSTANCE.getAsciiType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.DoubleTypeImpl <em>Double Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.DoubleTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getDoubleType()
		 * @generated
		 */
		EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_TYPE__VALUE = eINSTANCE.getDoubleType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.CounterColumnTypeImpl <em>Counter Column Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.CounterColumnTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getCounterColumnType()
		 * @generated
		 */
		EClass COUNTER_COLUMN_TYPE = eINSTANCE.getCounterColumnType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER_COLUMN_TYPE__VALUE = eINSTANCE.getCounterColumnType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.DecimalTypeImpl <em>Decimal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.DecimalTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getDecimalType()
		 * @generated
		 */
		EClass DECIMAL_TYPE = eINSTANCE.getDecimalType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_TYPE__VALUE = eINSTANCE.getDecimalType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.BytesTypeImpl <em>Bytes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.BytesTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getBytesType()
		 * @generated
		 */
		EClass BYTES_TYPE = eINSTANCE.getBytesType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTES_TYPE__VALUE = eINSTANCE.getBytesType_Value();

		/**
		 * The meta object literal for the '{@link cassandra.impl.DateTypeImpl <em>Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cassandra.impl.DateTypeImpl
		 * @see cassandra.impl.CassandraPackageImpl#getDateType()
		 * @generated
		 */
		EClass DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TYPE__VALUE = eINSTANCE.getDateType_Value();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see cassandra.impl.CassandraPackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

		/**
		 * The meta object literal for the '<em>Bytes</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Blob
		 * @see cassandra.impl.CassandraPackageImpl#getBytes()
		 * @generated
		 */
		EDataType BYTES = eINSTANCE.getBytes();

		/**
		 * The meta object literal for the '<em>Decimal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see cassandra.impl.CassandraPackageImpl#getDecimal()
		 * @generated
		 */
		EDataType DECIMAL = eINSTANCE.getDecimal();

	}

} //CassandraPackage
