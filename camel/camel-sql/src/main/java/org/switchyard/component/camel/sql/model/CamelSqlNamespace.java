/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.component.camel.sql.model;

import org.switchyard.config.model.BaseNamespace;
import org.switchyard.config.model.Descriptor;

/**
 * A Camel Sql config model namespace.
 *
 * @author David Ward &lt;<a href="mailto:dward@jboss.org">dward@jboss.org</a>&gt; &copy; 2013 Red Hat Inc.
 */
public final class CamelSqlNamespace extends BaseNamespace {

    /** The 1.0 namespace. */
    public static final CamelSqlNamespace V_1_0;
    /** The 1.1 namespace. */
    public static final CamelSqlNamespace V_1_1;
    /** The default namespace. */
    public static final CamelSqlNamespace DEFAULT;

    static {
        final Descriptor desc = new Descriptor(CamelSqlNamespace.class);
        final String section = "urn:switchyard-component-camel-sql:config";
        V_1_0 = new CamelSqlNamespace(desc, section, "1.0");
        V_1_1 = new CamelSqlNamespace(desc, section, "1.1");
        DEFAULT = new CamelSqlNamespace(desc, section);
    }

    private CamelSqlNamespace(Descriptor desc, String section) {
        super(desc, section);
    }

    private CamelSqlNamespace(Descriptor desc, String section, String version) {
        super(desc, section, version);
    }

}