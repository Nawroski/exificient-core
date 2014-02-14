/*
 * Copyright (C) 2007-2012 Siemens AG
 *
 * This program and its interfaces are free software;
 * you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.siemens.ct.exi.datatype;

import com.siemens.ct.exi.context.QNameContext;
import com.siemens.ct.exi.types.BuiltInType;

/**
 * 
 * @author Daniel.Peintner.EXT@siemens.com
 * @author Joerg.Heuer@siemens.com
 * 
 * @version 0.9.3-SNAPSHOT
 */

public abstract class AbstractDatatype implements Datatype {

	private static final long serialVersionUID = 682257950812949619L;

	// default built-in datatype (no dtr map used)
	protected final BuiltInType builtInType;

	// for codec map
	protected final QNameContext schemaType;

	public AbstractDatatype() {
		this(null, null);
	}

	public AbstractDatatype(BuiltInType builtInType, QNameContext schemaType) {
		this.builtInType = builtInType;
		this.schemaType = schemaType;
	}

	public BuiltInType getBuiltInType() {
		return builtInType;
	}

	public QNameContext getSchemaType() {
		return schemaType;
	}

	public boolean equals(Object o) {
		if (o instanceof Datatype) {
			return (builtInType == ((Datatype) o).getBuiltInType());
		} else {
			return false;
		}
	}

	public int hashCode() {
		return builtInType.ordinal();
	}

	public String toString() {
		return builtInType.toString();
	}
}
