/*
 * Copyright (c) 2013, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package vm.runtime.defmeth.shared.data.method;

import jdk.internal.org.objectweb.asm.Opcodes;
import vm.runtime.defmeth.shared.Printer;
import vm.runtime.defmeth.shared.data.Visitor;

/**
 * Represents abstract method (method w/o code) in both concrete classes
 * and interfaces.
 */
public class AbstractMethod extends Method {

    public AbstractMethod(int acc, String name, String desc, String sig) {
        super(Opcodes.ACC_ABSTRACT | acc, name, desc, sig);
    }

    @Override
    public void visit(Visitor v) {
        v.visitAbstractMethod(this);
    }

    @Override
    public String toString() {
        return Printer.print(this);
    }
}
