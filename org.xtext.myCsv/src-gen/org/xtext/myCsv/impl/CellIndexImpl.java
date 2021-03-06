/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.myCsv.CellIndex;
import org.xtext.myCsv.Field;
import org.xtext.myCsv.MyCsvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.myCsv.impl.CellIndexImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.xtext.myCsv.impl.CellIndexImpl#getColnum <em>Colnum</em>}</li>
 *   <li>{@link org.xtext.myCsv.impl.CellIndexImpl#getColname <em>Colname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellIndexImpl extends MinimalEObjectImpl.Container implements CellIndex
{
  /**
   * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLine()
   * @generated
   * @ordered
   */
  protected static final int LINE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLine()
   * @generated
   * @ordered
   */
  protected int line = LINE_EDEFAULT;

  /**
   * The default value of the '{@link #getColnum() <em>Colnum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColnum()
   * @generated
   * @ordered
   */
  protected static final int COLNUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColnum() <em>Colnum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColnum()
   * @generated
   * @ordered
   */
  protected int colnum = COLNUM_EDEFAULT;

  /**
   * The cached value of the '{@link #getColname() <em>Colname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColname()
   * @generated
   * @ordered
   */
  protected Field colname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellIndexImpl()
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
    return MyCsvPackage.Literals.CELL_INDEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLine()
  {
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLine(int newLine)
  {
    int oldLine = line;
    line = newLine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyCsvPackage.CELL_INDEX__LINE, oldLine, line));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getColnum()
  {
    return colnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColnum(int newColnum)
  {
    int oldColnum = colnum;
    colnum = newColnum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyCsvPackage.CELL_INDEX__COLNUM, oldColnum, colnum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Field getColname()
  {
    return colname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColname(Field newColname, NotificationChain msgs)
  {
    Field oldColname = colname;
    colname = newColname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyCsvPackage.CELL_INDEX__COLNAME, oldColname, newColname);
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
  public void setColname(Field newColname)
  {
    if (newColname != colname)
    {
      NotificationChain msgs = null;
      if (colname != null)
        msgs = ((InternalEObject)colname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyCsvPackage.CELL_INDEX__COLNAME, null, msgs);
      if (newColname != null)
        msgs = ((InternalEObject)newColname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyCsvPackage.CELL_INDEX__COLNAME, null, msgs);
      msgs = basicSetColname(newColname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyCsvPackage.CELL_INDEX__COLNAME, newColname, newColname));
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
      case MyCsvPackage.CELL_INDEX__COLNAME:
        return basicSetColname(null, msgs);
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
      case MyCsvPackage.CELL_INDEX__LINE:
        return getLine();
      case MyCsvPackage.CELL_INDEX__COLNUM:
        return getColnum();
      case MyCsvPackage.CELL_INDEX__COLNAME:
        return getColname();
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
      case MyCsvPackage.CELL_INDEX__LINE:
        setLine((Integer)newValue);
        return;
      case MyCsvPackage.CELL_INDEX__COLNUM:
        setColnum((Integer)newValue);
        return;
      case MyCsvPackage.CELL_INDEX__COLNAME:
        setColname((Field)newValue);
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
      case MyCsvPackage.CELL_INDEX__LINE:
        setLine(LINE_EDEFAULT);
        return;
      case MyCsvPackage.CELL_INDEX__COLNUM:
        setColnum(COLNUM_EDEFAULT);
        return;
      case MyCsvPackage.CELL_INDEX__COLNAME:
        setColname((Field)null);
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
      case MyCsvPackage.CELL_INDEX__LINE:
        return line != LINE_EDEFAULT;
      case MyCsvPackage.CELL_INDEX__COLNUM:
        return colnum != COLNUM_EDEFAULT;
      case MyCsvPackage.CELL_INDEX__COLNAME:
        return colname != null;
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
    result.append(" (line: ");
    result.append(line);
    result.append(", colnum: ");
    result.append(colnum);
    result.append(')');
    return result.toString();
  }

} //CellIndexImpl
