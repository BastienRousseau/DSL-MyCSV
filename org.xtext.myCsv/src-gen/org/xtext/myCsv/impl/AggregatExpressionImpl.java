/**
 * generated by Xtext 2.23.0
 */
package org.xtext.myCsv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.myCsv.Aggregat;
import org.xtext.myCsv.AggregatExpression;
import org.xtext.myCsv.Field;
import org.xtext.myCsv.MyCsvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregat Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.myCsv.impl.AggregatExpressionImpl#getAggregatOp <em>Aggregat Op</em>}</li>
 *   <li>{@link org.xtext.myCsv.impl.AggregatExpressionImpl#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregatExpressionImpl extends ExpressionCalculPrimaryImpl implements AggregatExpression
{
  /**
   * The default value of the '{@link #getAggregatOp() <em>Aggregat Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatOp()
   * @generated
   * @ordered
   */
  protected static final Aggregat AGGREGAT_OP_EDEFAULT = Aggregat.COUNT;

  /**
   * The cached value of the '{@link #getAggregatOp() <em>Aggregat Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatOp()
   * @generated
   * @ordered
   */
  protected Aggregat aggregatOp = AGGREGAT_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected Field arg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AggregatExpressionImpl()
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
    return MyCsvPackage.Literals.AGGREGAT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Aggregat getAggregatOp()
  {
    return aggregatOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAggregatOp(Aggregat newAggregatOp)
  {
    Aggregat oldAggregatOp = aggregatOp;
    aggregatOp = newAggregatOp == null ? AGGREGAT_OP_EDEFAULT : newAggregatOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyCsvPackage.AGGREGAT_EXPRESSION__AGGREGAT_OP, oldAggregatOp, aggregatOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Field getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(Field newArg, NotificationChain msgs)
  {
    Field oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyCsvPackage.AGGREGAT_EXPRESSION__ARG, oldArg, newArg);
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
  public void setArg(Field newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyCsvPackage.AGGREGAT_EXPRESSION__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyCsvPackage.AGGREGAT_EXPRESSION__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyCsvPackage.AGGREGAT_EXPRESSION__ARG, newArg, newArg));
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
      case MyCsvPackage.AGGREGAT_EXPRESSION__ARG:
        return basicSetArg(null, msgs);
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
      case MyCsvPackage.AGGREGAT_EXPRESSION__AGGREGAT_OP:
        return getAggregatOp();
      case MyCsvPackage.AGGREGAT_EXPRESSION__ARG:
        return getArg();
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
      case MyCsvPackage.AGGREGAT_EXPRESSION__AGGREGAT_OP:
        setAggregatOp((Aggregat)newValue);
        return;
      case MyCsvPackage.AGGREGAT_EXPRESSION__ARG:
        setArg((Field)newValue);
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
      case MyCsvPackage.AGGREGAT_EXPRESSION__AGGREGAT_OP:
        setAggregatOp(AGGREGAT_OP_EDEFAULT);
        return;
      case MyCsvPackage.AGGREGAT_EXPRESSION__ARG:
        setArg((Field)null);
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
      case MyCsvPackage.AGGREGAT_EXPRESSION__AGGREGAT_OP:
        return aggregatOp != AGGREGAT_OP_EDEFAULT;
      case MyCsvPackage.AGGREGAT_EXPRESSION__ARG:
        return arg != null;
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
    result.append(" (aggregatOp: ");
    result.append(aggregatOp);
    result.append(')');
    return result.toString();
  }

} //AggregatExpressionImpl
