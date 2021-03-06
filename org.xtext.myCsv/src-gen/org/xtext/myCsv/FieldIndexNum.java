/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Index Num</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.myCsv.FieldIndexNum#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.xtext.myCsv.MyCsvPackage#getFieldIndexNum()
 * @model
 * @generated
 */
public interface FieldIndexNum extends FieldIndex
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute list.
   * @see org.xtext.myCsv.MyCsvPackage#getFieldIndexNum_Columns()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getColumns();

} // FieldIndexNum
