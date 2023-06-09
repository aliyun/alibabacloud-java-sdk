// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class SchemaTablesValue extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("primaryTable")
    public Boolean primaryTable;

    @NameInMap("fields")
    public java.util.Map<String, SchemaTablesValueFieldsValue> fields;

    public static SchemaTablesValue build(java.util.Map<String, ?> map) throws Exception {
        SchemaTablesValue self = new SchemaTablesValue();
        return TeaModel.build(map, self);
    }

    public SchemaTablesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SchemaTablesValue setPrimaryTable(Boolean primaryTable) {
        this.primaryTable = primaryTable;
        return this;
    }
    public Boolean getPrimaryTable() {
        return this.primaryTable;
    }

    public SchemaTablesValue setFields(java.util.Map<String, SchemaTablesValueFieldsValue> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.Map<String, SchemaTablesValueFieldsValue> getFields() {
        return this.fields;
    }

}
