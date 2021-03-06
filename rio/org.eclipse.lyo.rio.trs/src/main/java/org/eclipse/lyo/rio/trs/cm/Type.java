/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * Contributors:
 * 
 *    Ernest Mah - Initial implementation
 *******************************************************************************/

package org.eclipse.lyo.rio.trs.cm;

public enum Type
{
    Defect("Defect"),
    Task("Task"),
    Story("Story"),
    Bug_Report("Bug Report"),
    Feature_Request("Feature Request");

    private String value;

    Type(final String value)
    {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static Type fromString(final String string)
    {
        final Type[] values = Type.values();
        for (final Type value : values)
        {
            if (value.value.equals(string))
            {
                return value;
            }
        }

        return null;
    }
}
