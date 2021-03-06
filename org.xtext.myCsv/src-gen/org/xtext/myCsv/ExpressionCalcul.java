/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Calcul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.myCsv.ExpressionCalcul#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.myCsv.MyCsvPackage#getExpressionCalcul()
 * @model
 * @generated
 */
public interface ExpressionCalcul extends Value
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(AdditiveExpression)
   * @see org.xtext.myCsv.MyCsvPackage#getExpressionCalcul_Expr()
   * @model containment="true"
   * @generated
   */
  AdditiveExpression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.myCsv.ExpressionCalcul#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(AdditiveExpression value);

} // ExpressionCalcul
