/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.myCsv.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyCsvFactoryImpl extends EFactoryImpl implements MyCsvFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyCsvFactory init()
  {
    try
    {
      MyCsvFactory theMyCsvFactory = (MyCsvFactory)EPackage.Registry.INSTANCE.getEFactory(MyCsvPackage.eNS_URI);
      if (theMyCsvFactory != null)
      {
        return theMyCsvFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyCsvFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyCsvFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyCsvPackage.PROGRAM: return createProgram();
      case MyCsvPackage.LINE_INDEX: return createLineIndex();
      case MyCsvPackage.LINE_INDEX_COND: return createLineIndexCond();
      case MyCsvPackage.LINE_INDEX_NUM: return createLineIndexNum();
      case MyCsvPackage.FIELD_INDEX: return createFieldIndex();
      case MyCsvPackage.FIELD_INDEX_NAME: return createFieldIndexName();
      case MyCsvPackage.FIELD_INDEX_NUM: return createFieldIndexNum();
      case MyCsvPackage.CELL_INDEX: return createCellIndex();
      case MyCsvPackage.VALUE: return createValue();
      case MyCsvPackage.VALUES: return createValues();
      case MyCsvPackage.PATH: return createPath();
      case MyCsvPackage.FIELD: return createField();
      case MyCsvPackage.STATEMENT: return createStatement();
      case MyCsvPackage.LOAD: return createLoad();
      case MyCsvPackage.STORE: return createStore();
      case MyCsvPackage.EXPORT_JSON: return createExportJson();
      case MyCsvPackage.PROJECTION: return createProjection();
      case MyCsvPackage.SELECT: return createSelect();
      case MyCsvPackage.DELETE: return createDelete();
      case MyCsvPackage.DELETE_LINE: return createDeleteLine();
      case MyCsvPackage.DELETE_FIELD: return createDeleteField();
      case MyCsvPackage.INSERT: return createInsert();
      case MyCsvPackage.INSERT_LINE: return createInsertLine();
      case MyCsvPackage.INSERT_FIELD: return createInsertField();
      case MyCsvPackage.MODIFY: return createModify();
      case MyCsvPackage.MODIFY_LINE: return createModifyLine();
      case MyCsvPackage.MODIFY_FIELD: return createModifyField();
      case MyCsvPackage.MODIFY_CELL: return createModifyCell();
      case MyCsvPackage.PRINT: return createPrint();
      case MyCsvPackage.PRINT_LINE: return createPrintLine();
      case MyCsvPackage.PRINT_FIELD: return createPrintField();
      case MyCsvPackage.PRINT_CELL: return createPrintCell();
      case MyCsvPackage.PRINT_EXPR: return createPrintExpr();
      case MyCsvPackage.RENAME_FIELD: return createRenameField();
      case MyCsvPackage.EXPRESSION_LOG: return createExpressionLog();
      case MyCsvPackage.OR_EXPRESSION: return createOrExpression();
      case MyCsvPackage.AND_EXPRESSION: return createAndExpression();
      case MyCsvPackage.UNARY_LOG_EXPRESSION: return createUnaryLogExpression();
      case MyCsvPackage.EXPRESSION_LOG_PRIMARY: return createExpressionLogPrimary();
      case MyCsvPackage.NESTED_LOG_EXPRESSION: return createNestedLogExpression();
      case MyCsvPackage.EXPRESSION_REL: return createExpressionRel();
      case MyCsvPackage.EXPRESSION_CALCUL: return createExpressionCalcul();
      case MyCsvPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case MyCsvPackage.ADDITIVE_EXPRESSION_RHS: return createAdditiveExpressionRhs();
      case MyCsvPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case MyCsvPackage.MULTIPLICATIVE_EXPRESSION_RHS: return createMultiplicativeExpressionRhs();
      case MyCsvPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case MyCsvPackage.EXPRESSION_CALCUL_PRIMARY: return createExpressionCalculPrimary();
      case MyCsvPackage.AGGREGAT_EXPRESSION: return createAggregatExpression();
      case MyCsvPackage.LITTERAL_INT: return createLitteralInt();
      case MyCsvPackage.LITTERAL_FLOAT: return createLitteralFloat();
      case MyCsvPackage.LITTERAL_STRING: return createLitteralString();
      case MyCsvPackage.NESTED_EXPRESSION_CALCUL: return createNestedExpressionCalcul();
      case MyCsvPackage.PRINT_TABLE: return createPrintTable();
      case MyCsvPackage.NB_FIELD: return createNbField();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyCsvPackage.BIN_OP_REL:
        return createBinOpRelFromString(eDataType, initialValue);
      case MyCsvPackage.AGGREGAT:
        return createAggregatFromString(eDataType, initialValue);
      case MyCsvPackage.BIN_OP_ADD:
        return createBinOpAddFromString(eDataType, initialValue);
      case MyCsvPackage.BIN_OP_MULT:
        return createBinOpMultFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyCsvPackage.BIN_OP_REL:
        return convertBinOpRelToString(eDataType, instanceValue);
      case MyCsvPackage.AGGREGAT:
        return convertAggregatToString(eDataType, instanceValue);
      case MyCsvPackage.BIN_OP_ADD:
        return convertBinOpAddToString(eDataType, instanceValue);
      case MyCsvPackage.BIN_OP_MULT:
        return convertBinOpMultToString(eDataType, instanceValue);
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
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LineIndex createLineIndex()
  {
    LineIndexImpl lineIndex = new LineIndexImpl();
    return lineIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LineIndexCond createLineIndexCond()
  {
    LineIndexCondImpl lineIndexCond = new LineIndexCondImpl();
    return lineIndexCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LineIndexNum createLineIndexNum()
  {
    LineIndexNumImpl lineIndexNum = new LineIndexNumImpl();
    return lineIndexNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldIndex createFieldIndex()
  {
    FieldIndexImpl fieldIndex = new FieldIndexImpl();
    return fieldIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldIndexName createFieldIndexName()
  {
    FieldIndexNameImpl fieldIndexName = new FieldIndexNameImpl();
    return fieldIndexName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldIndexNum createFieldIndexNum()
  {
    FieldIndexNumImpl fieldIndexNum = new FieldIndexNumImpl();
    return fieldIndexNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellIndex createCellIndex()
  {
    CellIndexImpl cellIndex = new CellIndexImpl();
    return cellIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Values createValues()
  {
    ValuesImpl values = new ValuesImpl();
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Load createLoad()
  {
    LoadImpl load = new LoadImpl();
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExportJson createExportJson()
  {
    ExportJsonImpl exportJson = new ExportJsonImpl();
    return exportJson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Projection createProjection()
  {
    ProjectionImpl projection = new ProjectionImpl();
    return projection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Delete createDelete()
  {
    DeleteImpl delete = new DeleteImpl();
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeleteLine createDeleteLine()
  {
    DeleteLineImpl deleteLine = new DeleteLineImpl();
    return deleteLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeleteField createDeleteField()
  {
    DeleteFieldImpl deleteField = new DeleteFieldImpl();
    return deleteField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Insert createInsert()
  {
    InsertImpl insert = new InsertImpl();
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InsertLine createInsertLine()
  {
    InsertLineImpl insertLine = new InsertLineImpl();
    return insertLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InsertField createInsertField()
  {
    InsertFieldImpl insertField = new InsertFieldImpl();
    return insertField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Modify createModify()
  {
    ModifyImpl modify = new ModifyImpl();
    return modify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModifyLine createModifyLine()
  {
    ModifyLineImpl modifyLine = new ModifyLineImpl();
    return modifyLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModifyField createModifyField()
  {
    ModifyFieldImpl modifyField = new ModifyFieldImpl();
    return modifyField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModifyCell createModifyCell()
  {
    ModifyCellImpl modifyCell = new ModifyCellImpl();
    return modifyCell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Print createPrint()
  {
    PrintImpl print = new PrintImpl();
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintLine createPrintLine()
  {
    PrintLineImpl printLine = new PrintLineImpl();
    return printLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintField createPrintField()
  {
    PrintFieldImpl printField = new PrintFieldImpl();
    return printField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintCell createPrintCell()
  {
    PrintCellImpl printCell = new PrintCellImpl();
    return printCell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintExpr createPrintExpr()
  {
    PrintExprImpl printExpr = new PrintExprImpl();
    return printExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RenameField createRenameField()
  {
    RenameFieldImpl renameField = new RenameFieldImpl();
    return renameField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionLog createExpressionLog()
  {
    ExpressionLogImpl expressionLog = new ExpressionLogImpl();
    return expressionLog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryLogExpression createUnaryLogExpression()
  {
    UnaryLogExpressionImpl unaryLogExpression = new UnaryLogExpressionImpl();
    return unaryLogExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionLogPrimary createExpressionLogPrimary()
  {
    ExpressionLogPrimaryImpl expressionLogPrimary = new ExpressionLogPrimaryImpl();
    return expressionLogPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedLogExpression createNestedLogExpression()
  {
    NestedLogExpressionImpl nestedLogExpression = new NestedLogExpressionImpl();
    return nestedLogExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionRel createExpressionRel()
  {
    ExpressionRelImpl expressionRel = new ExpressionRelImpl();
    return expressionRel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionCalcul createExpressionCalcul()
  {
    ExpressionCalculImpl expressionCalcul = new ExpressionCalculImpl();
    return expressionCalcul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditiveExpressionRhs createAdditiveExpressionRhs()
  {
    AdditiveExpressionRhsImpl additiveExpressionRhs = new AdditiveExpressionRhsImpl();
    return additiveExpressionRhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicativeExpressionRhs createMultiplicativeExpressionRhs()
  {
    MultiplicativeExpressionRhsImpl multiplicativeExpressionRhs = new MultiplicativeExpressionRhsImpl();
    return multiplicativeExpressionRhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionCalculPrimary createExpressionCalculPrimary()
  {
    ExpressionCalculPrimaryImpl expressionCalculPrimary = new ExpressionCalculPrimaryImpl();
    return expressionCalculPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AggregatExpression createAggregatExpression()
  {
    AggregatExpressionImpl aggregatExpression = new AggregatExpressionImpl();
    return aggregatExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LitteralInt createLitteralInt()
  {
    LitteralIntImpl litteralInt = new LitteralIntImpl();
    return litteralInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LitteralFloat createLitteralFloat()
  {
    LitteralFloatImpl litteralFloat = new LitteralFloatImpl();
    return litteralFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LitteralString createLitteralString()
  {
    LitteralStringImpl litteralString = new LitteralStringImpl();
    return litteralString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedExpressionCalcul createNestedExpressionCalcul()
  {
    NestedExpressionCalculImpl nestedExpressionCalcul = new NestedExpressionCalculImpl();
    return nestedExpressionCalcul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintTable createPrintTable()
  {
    PrintTableImpl printTable = new PrintTableImpl();
    return printTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NbField createNbField()
  {
    NbFieldImpl nbField = new NbFieldImpl();
    return nbField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinOpRel createBinOpRelFromString(EDataType eDataType, String initialValue)
  {
    BinOpRel result = BinOpRel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinOpRelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregat createAggregatFromString(EDataType eDataType, String initialValue)
  {
    Aggregat result = Aggregat.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAggregatToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinOpAdd createBinOpAddFromString(EDataType eDataType, String initialValue)
  {
    BinOpAdd result = BinOpAdd.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinOpAddToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinOpMult createBinOpMultFromString(EDataType eDataType, String initialValue)
  {
    BinOpMult result = BinOpMult.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinOpMultToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyCsvPackage getMyCsvPackage()
  {
    return (MyCsvPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyCsvPackage getPackage()
  {
    return MyCsvPackage.eINSTANCE;
  }

} //MyCsvFactoryImpl
