/*
 * Copyright 2005-2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
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
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package com.sun.xml.internal.ws.api.server;

import com.sun.xml.internal.ws.developer.Stateful;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 * Meta annotation for selecting instance resolver.
 *
 * <p>
 * When service class is annotated with an annotation that has
 * {@link InstanceResolverAnnotation} as meta annotation, the JAX-WS RI
 * runtime will use the instance resolver class specified on {@link #value()}.
 *
 * <p>
 * The {@link InstanceResolver} class must have the public constructor that
 * takes {@link Class}, which represents the type of the service.
 *
 * <p>
 * See {@link Stateful} for a real example. This annotation is only for
 * advanced users of the JAX-WS RI.
 *
 * @since JAX-WS 2.1
 * @see Stateful
 * @author Kohsuke Kawaguchi
 */
@Target(ANNOTATION_TYPE)
@Retention(RUNTIME)
@Documented
public @interface InstanceResolverAnnotation {
    Class<? extends InstanceResolver> value();
}
