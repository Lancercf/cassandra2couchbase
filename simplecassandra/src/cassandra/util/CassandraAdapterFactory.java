/**
 */
package cassandra.util;

import cassandra.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cassandra.CassandraPackage
 * @generated
 */
public class CassandraAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CassandraPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CassandraAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CassandraPackage.eINSTANCE;
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
	protected CassandraSwitch<Adapter> modelSwitch =
		new CassandraSwitch<Adapter>() {
			@Override
			public Adapter caseKeyspace(Keyspace object) {
				return createKeyspaceAdapter();
			}
			@Override
			public Adapter caseColumnFamily(ColumnFamily object) {
				return createColumnFamilyAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseSuperColumn(SuperColumn object) {
				return createSuperColumnAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseUTF8Type(UTF8Type object) {
				return createUTF8TypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseFloatType(FloatType object) {
				return createFloatTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseUUIDType(UUIDType object) {
				return createUUIDTypeAdapter();
			}
			@Override
			public Adapter caseAsciiType(AsciiType object) {
				return createAsciiTypeAdapter();
			}
			@Override
			public Adapter caseDoubleType(DoubleType object) {
				return createDoubleTypeAdapter();
			}
			@Override
			public Adapter caseCounterColumnType(CounterColumnType object) {
				return createCounterColumnTypeAdapter();
			}
			@Override
			public Adapter caseDecimalType(DecimalType object) {
				return createDecimalTypeAdapter();
			}
			@Override
			public Adapter caseBytesType(BytesType object) {
				return createBytesTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link cassandra.Keyspace <em>Keyspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.Keyspace
	 * @generated
	 */
	public Adapter createKeyspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.ColumnFamily <em>Column Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.ColumnFamily
	 * @generated
	 */
	public Adapter createColumnFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.SuperColumn <em>Super Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.SuperColumn
	 * @generated
	 */
	public Adapter createSuperColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.UTF8Type <em>UTF8 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.UTF8Type
	 * @generated
	 */
	public Adapter createUTF8TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.FloatType
	 * @generated
	 */
	public Adapter createFloatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.UUIDType <em>UUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.UUIDType
	 * @generated
	 */
	public Adapter createUUIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.AsciiType <em>Ascii Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.AsciiType
	 * @generated
	 */
	public Adapter createAsciiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.DoubleType
	 * @generated
	 */
	public Adapter createDoubleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.CounterColumnType <em>Counter Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.CounterColumnType
	 * @generated
	 */
	public Adapter createCounterColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.DecimalType
	 * @generated
	 */
	public Adapter createDecimalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.BytesType <em>Bytes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.BytesType
	 * @generated
	 */
	public Adapter createBytesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cassandra.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cassandra.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
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

} //CassandraAdapterFactory
