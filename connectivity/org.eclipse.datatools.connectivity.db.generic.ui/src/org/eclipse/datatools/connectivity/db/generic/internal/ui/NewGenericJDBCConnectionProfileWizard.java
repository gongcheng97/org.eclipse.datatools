/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.connectivity.db.generic.internal.ui;

import org.eclipse.datatools.connectivity.ui.wizards.ExtensibleNewConnectionProfileWizard;

public class NewGenericJDBCConnectionProfileWizard extends
		ExtensibleNewConnectionProfileWizard {
	public NewGenericJDBCConnectionProfileWizard() {
		super(
				new GenericJDBCDBProfileDetailsWizardPage(
						"org.eclipse.datatools.connectivity.db.generic.internal.ui.GenericJDBCDBProfileDetailsWizardPage")); //$NON-NLS-1$
	}
}