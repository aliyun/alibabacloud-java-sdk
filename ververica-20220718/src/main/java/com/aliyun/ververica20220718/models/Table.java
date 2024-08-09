// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
    @NameInMap("comment")
    public String comment;

    @NameInMap("name")
    public String name;

    @NameInMap("partitionKeys")
    public java.util.List<String> partitionKeys;

    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("schema")
    public Schema schema;

    public static Table build(java.util.Map<String, ?> map) throws Exception {
        Table self = new Table();
        return TeaModel.build(map, self);
    }

    public Table setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Table setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Table setPartitionKeys(java.util.List<String> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<String> getPartitionKeys() {
        return this.partitionKeys;
    }

    public Table setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public Table setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }
    public Schema getSchema() {
        return this.schema;
    }

}
