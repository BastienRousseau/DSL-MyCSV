/*
 * generated by Xtext 2.23.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.myCsv.ui.internal.MyCsvActivator;

public class MyCsvUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MyCsvActivator.getInstance().getInjector("org.xtext.MyCsv");
	}

}