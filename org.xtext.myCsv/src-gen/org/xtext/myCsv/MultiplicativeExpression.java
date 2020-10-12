/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.myCsv.MultiplicativeExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.xtext.myCsv.MultiplicativeExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.xtext.myCsv.MyCsvPackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(UnaryExpression)
   * @see org.xtext.myCsv.MyCsvPackage#getMultiplicativeExpression_Lhs()
   * @model containment="true"
   * @generated
   */
  UnaryExpression getLhs();

  /**
   * Sets the value of the '{@link org.xtext.myCsv.MultiplicativeExpression#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(UnaryExpression value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.myCsv.MultiplicativeExpressionRhs}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference list.
   * @see org.xtext.myCsv.MyCsvPackage#getMultiplicativeExpression_Rhs()
   * @model containment="true"
   * @generated
   */
  EList<MultiplicativeExpressionRhs> getRhs();

} // MultiplicativeExpression
