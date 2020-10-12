/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.myCsv.DeleteLine;
import org.xtext.myCsv.LineIndex;
import org.xtext.myCsv.MyCsvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.myCsv.impl.DeleteLineImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteLineImpl extends DeleteImpl implements DeleteLine
{
  /**
   * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected LineIndex lines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeleteLineImpl()
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
    return MyCsvPackage.Literals.DELETE_LINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LineIndex getLines()
  {
    return lines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLines(LineIndex newLines, NotificationChain msgs)
  {
    LineIndex oldLines = lines;
    lines = newLines;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyCsvPackage.DELETE_LINE__LINES, oldLines, newLines);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLines(LineIndex newLines)
  {
    if (newLines != lines)
    {
      NotificationChain msgs = null;
      if (lines != null)
        msgs = ((InternalEObject)lines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyCsvPackage.DELETE_LINE__LINES, null, msgs);
      if (newLines != null)
        msgs = ((InternalEObject)newLines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyCsvPackage.DELETE_LINE__LINES, null, msgs);
      msgs = basicSetLines(newLines, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyCsvPackage.DELETE_LINE__LINES, newLines, newLines));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyCsvPackage.DELETE_LINE__LINES:
        return basicSetLines(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyCsvPackage.DELETE_LINE__LINES:
        return getLines();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyCsvPackage.DELETE_LINE__LINES:
        setLines((LineIndex)newValue);
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
      case MyCsvPackage.DELETE_LINE__LINES:
        setLines((LineIndex)null);
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
      case MyCsvPackage.DELETE_LINE__LINES:
        return lines != null;
    }
    return super.eIsSet(featureID);
  }

} //DeleteLineImpl
