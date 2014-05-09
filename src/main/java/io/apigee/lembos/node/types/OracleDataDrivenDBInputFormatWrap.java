/*
 * Copyright 2014 Apigee Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apigee.lembos.node.types;

import org.apache.hadoop.mapreduce.lib.db.OracleDataDrivenDBInputFormat;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSStaticFunction;

/**
 * Java implementation of the {@link OracleDataDrivenDBInputFormat} JavaScript object.
 *
 * <b>Note:</b> Only exposes the static methods
 */
public final class OracleDataDrivenDBInputFormatWrap extends ScriptableObject {

    private static final long serialVersionUID = -1728955593792804626L;
    public static final String CLASS_NAME = "OracleDataDrivenDBInputFormat";

    /* JavaScript Methods */

    /**
     * Java wrapper for
     * {@link OracleDataDrivenDBInputFormat#setInput(org.apache.hadoop.mapreduce.Job, Class, String, String)} and
     * {@link OracleDataDrivenDBInputFormat#setInput(org.apache.hadoop.mapreduce.Job, Class, String, String,
     *                                               String, String...)}.
     *
     * @param ctx the JavaScript context
     * @param thisObj the 'this' object
     * @param args the function arguments
     * @param func the function being called
     */
    @JSStaticFunction
    public static void setInput(final Context ctx, final Scriptable thisObj, final Object[] args,
                                    final Function func) {
        DataDrivenDBInputFormatHelper.setInput(OracleDataDrivenDBInputFormat.class, ctx, thisObj, args, func);
    }

    /**
     * Java wrapper for
     * {@link OracleDataDrivenDBInputFormat#setBoundingQuery(org.apache.hadoop.conf.Configuration, String)}.
     *
     * @param ctx the JavaScript context
     * @param thisObj the 'this' object
     * @param args the function arguments
     * @param func the function being called
     */
    @JSStaticFunction
    public static void setBoundingQuery(final Context ctx, final Scriptable thisObj, final Object[] args,
                                        final Function func) {
        DataDrivenDBInputFormatHelper.setBoundingQuery(OracleDataDrivenDBInputFormat.class, ctx, thisObj, args, func);
    }

    /* Java Methods */

    /**
     * {@inheritDoc}
     */
    @Override
    public String getClassName() {
        return CLASS_NAME;
    }

}
