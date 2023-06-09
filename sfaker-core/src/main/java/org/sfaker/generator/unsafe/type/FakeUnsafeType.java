/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sfaker.generator.unsafe.type;

import org.sfaker.generator.code.FakeCodegen;
import org.sfaker.generator.unsafe.FakeTypeGenerator;

import org.apache.spark.sql.catalyst.expressions.codegen.UnsafeWriter;
import org.apache.spark.sql.types.DataType;

public abstract class FakeUnsafeType implements FakeTypeGenerator, FakeCodegen {

    private final UnsafeWriter writer;
    private final DataType type;

    protected FakeUnsafeType(UnsafeWriter writer, DataType type) {
        this.writer = writer;
        this.type = type;
    }

    public UnsafeWriter writer() {
        return writer;
    }

    public DataType type() {
        return type;
    }
}
