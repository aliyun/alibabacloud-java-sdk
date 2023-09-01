// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SimpleQuery extends TeaModel {
    @NameInMap("field")
    public byte[] field;

    @NameInMap("operation")
    public byte[] operation;

    @NameInMap("sub_queries")
    public java.util.List<SimpleQuery> subQueries;

    @NameInMap("value")
    public byte[] value;

    public static SimpleQuery build(java.util.Map<String, ?> map) throws Exception {
        SimpleQuery self = new SimpleQuery();
        return TeaModel.build(map, self);
    }

    public SimpleQuery setField(byte[] field) {
        this.field = field;
        return this;
    }
    public byte[] getField() {
        return this.field;
    }

    public SimpleQuery setOperation(byte[] operation) {
        this.operation = operation;
        return this;
    }
    public byte[] getOperation() {
        return this.operation;
    }

    public SimpleQuery setSubQueries(java.util.List<SimpleQuery> subQueries) {
        this.subQueries = subQueries;
        return this;
    }
    public java.util.List<SimpleQuery> getSubQueries() {
        return this.subQueries;
    }

    public SimpleQuery setValue(byte[] value) {
        this.value = value;
        return this;
    }
    public byte[] getValue() {
        return this.value;
    }

}
