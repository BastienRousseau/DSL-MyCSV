/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.myCsv.LineIndexNum;
import org.xtext.myCsv.MyCsvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Index Num</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.myCsv.impl.LineIndexNumImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineIndexNumImpl extends LineIndexImpl implements LineIndexNum
{
  /**
   * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected EList<Integer> lines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LineIndexNumImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyCsvPackage.Literals.LINE_INDEX_NUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getLines()
  {
    if (lines == null)
    {
      lines = new EDataTypeEList<Integer>(Integer.class, this, MyCsvPackage.LINE_INDEX_NUM__LINES);
    }
    return lines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyCsvPackage.LINE_INDEX_NUM__LINES:
        return getLines();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyCsvPackage.LINE_INDEX_NUM__LINES:
        getLines().clear();
        getLines().addAll((Collection<? extends Integer>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyCsvPackage.LINE_INDEX_NUM__LINES:
        getLines().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyCsvPackage.LINE_INDEX_NUM__LINES:
        return lines != null && !lines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (lines: ");
    result.append(lines);
    result.append(')');
    return result.toString();
  }

} //LineIndexNumImpl
