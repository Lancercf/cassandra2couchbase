/**
 */
package cassandra.impl;

import cassandra.*;

import java.math.BigDecimal;

import java.sql.Blob;
import java.sql.Timestamp;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CassandraFactoryImpl extends EFactoryImpl implements CassandraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CassandraFactory init() {
		try {
			CassandraFactory theCassandraFactory = (CassandraFactory)EPackage.Registry.INSTANCE.getEFactory(CassandraPackage.eNS_URI);
			if (theCassandraFactory != null) {
				return theCassandraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CassandraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CassandraFactoryImpl() {
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
			case CassandraPackage.KEYSPACE: return createKeyspace();
			case CassandraPackage.COLUMN_FAMILY: return createColumnFamily();
			case CassandraPackage.ROW: return createRow();
			case CassandraPackage.COLUMN: return createColumn();
			case CassandraPackage.SUPER_COLUMN: return createSuperColumn();
			case CassandraPackage.INTEGER_TYPE: return createIntegerType();
			case CassandraPackage.UTF8_TYPE: return createUTF8Type();
			case CassandraPackage.DATA_TYPE: return createDataType();
			case CassandraPackage.FLOAT_TYPE: return createFloatType();
			case CassandraPackage.BOOLEAN_TYPE: return createBooleanType();
			case CassandraPackage.UUID_TYPE: return createUUIDType();
			case CassandraPackage.ASCII_TYPE: return createAsciiType();
			case CassandraPackage.DOUBLE_TYPE: return createDoubleType();
			case CassandraPackage.COUNTER_COLUMN_TYPE: return createCounterColumnType();
			case CassandraPackage.DECIMAL_TYPE: return createDecimalType();
			case CassandraPackage.BYTES_TYPE: return createBytesType();
			case CassandraPackage.DATE_TYPE: return createDateType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CassandraPackage.TIMESTAMP:
				return createTimestampFromString(eDataType, initialValue);
			case CassandraPackage.BYTES:
				return createBytesFromString(eDataType, initialValue);
			case CassandraPackage.DECIMAL:
				return createDecimalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CassandraPackage.TIMESTAMP:
				return convertTimestampToString(eDataType, instanceValue);
			case CassandraPackage.BYTES:
				return convertBytesToString(eDataType, instanceValue);
			case CassandraPackage.DECIMAL:
				return convertDecimalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyspace createKeyspace() {
		KeyspaceImpl keyspace = new KeyspaceImpl();
		return keyspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnFamily createColumnFamily() {
		ColumnFamilyImpl columnFamily = new ColumnFamilyImpl();
		return columnFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperColumn createSuperColumn() {
		SuperColumnImpl superColumn = new SuperColumnImpl();
		return superColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTF8Type createUTF8Type() {
		UTF8TypeImpl utf8Type = new UTF8TypeImpl();
		return utf8Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUIDType createUUIDType() {
		UUIDTypeImpl uuidType = new UUIDTypeImpl();
		return uuidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsciiType createAsciiType() {
		AsciiTypeImpl asciiType = new AsciiTypeImpl();
		return asciiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleType createDoubleType() {
		DoubleTypeImpl doubleType = new DoubleTypeImpl();
		return doubleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CounterColumnType createCounterColumnType() {
		CounterColumnTypeImpl counterColumnType = new CounterColumnTypeImpl();
		return counterColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalType createDecimalType() {
		DecimalTypeImpl decimalType = new DecimalTypeImpl();
		return decimalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BytesType createBytesType() {
		BytesTypeImpl bytesType = new BytesTypeImpl();
		return bytesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp createTimestampFromString(EDataType eDataType, String initialValue) {
		return (Timestamp)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blob createBytesFromString(EDataType eDataType, String initialValue) {
		return (Blob)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBytesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CassandraPackage getCassandraPackage() {
		return (CassandraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CassandraPackage getPackage() {
		return CassandraPackage.eINSTANCE;
	}

} //CassandraFactoryImpl
