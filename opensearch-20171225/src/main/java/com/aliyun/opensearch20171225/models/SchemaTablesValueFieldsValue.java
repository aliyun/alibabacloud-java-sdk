// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class SchemaTablesValueFieldsValue extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("primaryKey")
    public Boolean primaryKey;

    @NameInMap("type")
    public String type;

    @NameInMap("joinWith")
    public java.util.List<String> joinWith;

    @NameInMap("label")
    public String label;

    public static SchemaTablesValueFieldsValue build(java.util.Map<String, ?> map) throws Exception {
        SchemaTablesValueFieldsValue self = new SchemaTablesValueFieldsValue();
        return TeaModel.build(map, self);
    }

    public SchemaTablesValueFieldsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SchemaTablesValueFieldsValue setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    public SchemaTablesValueFieldsValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SchemaTablesValueFieldsValue setJoinWith(java.util.List<String> joinWith) {
        this.joinWith = joinWith;
        return this;
    }
    public java.util.List<String> getJoinWith() {
        return this.joinWith;
    }

    public SchemaTablesValueFieldsValue setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

}
