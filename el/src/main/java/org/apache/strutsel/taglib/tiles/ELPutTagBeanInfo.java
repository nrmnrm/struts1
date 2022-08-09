/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.strutsel.taglib.tiles;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import java.util.ArrayList;

/**
 * This is the <code>BeanInfo</code> descriptor for the
 * <code>org.apache.strutsel.taglib.tiles.ELPutTag</code> class.  It is needed
 * to override the default mapping of custom tag attribute names to class
 * attribute names.
 */
public class ELPutTagBeanInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        ArrayList<PropertyDescriptor> proplist = new ArrayList<>();

        try {
            proplist.add(new PropertyDescriptor("name", ELPutTag.class, null,
                    "setNameExpr"));
        } catch (IntrospectionException ex) {
        }

        try {
            proplist.add(new PropertyDescriptor("value", ELPutTag.class, null,
                    "setValueExpr"));
        } catch (IntrospectionException ex) {
        }

        try {
            proplist.add(new PropertyDescriptor("content", ELPutTag.class,
                    null, "setContentExpr"));
        } catch (IntrospectionException ex) {
        }

        try {
            proplist.add(new PropertyDescriptor("direct", ELPutTag.class, null,
                    "setDirectExpr"));
        } catch (IntrospectionException ex) {
        }

        try {
            proplist.add(new PropertyDescriptor("type", ELPutTag.class, null,
                    "setTypeExpr"));
        } catch (IntrospectionException ex) {
        }

        try {
            proplist.add(new PropertyDescriptor("beanName", ELPutTag.class,
                    null, "setBeanNameExpr"));
        } catch (IntrospectionException ex) {
        }

        try {
            proplist.add(new PropertyDescriptor("beanProperty", ELPutTag.class,
                    null, "setBeanPropertyExpr"));
        } catch (IntrospectionException ex) {
        }

        try {
            proplist.add(new PropertyDescriptor("beanScope", ELPutTag.class,
                    null, "setBeanScopeExpr"));
        } catch (IntrospectionException ex) {
        }

        try {
            proplist.add(new PropertyDescriptor("role", ELPutTag.class, null,
                    "setRoleExpr"));
        } catch (IntrospectionException ex) {
        }

        PropertyDescriptor[] result = new PropertyDescriptor[0];

        return (proplist.toArray(result));
    }
}
