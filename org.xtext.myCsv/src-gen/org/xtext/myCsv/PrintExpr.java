/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.myCsv.PrintExpr#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.myCsv.MyCsvPackage#getPrintExpr()
 * @model
 * @generated
 */
public interface PrintExpr extends Print
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Value)
   * @see org.xtext.myCsv.MyCsvPackage#getPrintExpr_Exp()
   * @model containment="true"
   * @generated
   */
  Value getExp();

  /**
   * Sets the value of the '{@link org.xtext.myCsv.PrintExpr#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Value value);

} // PrintExpr
