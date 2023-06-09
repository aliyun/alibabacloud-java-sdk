// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DataSource extends TeaModel {
    @NameInMap("fields")
    public java.util.List<java.util.Map<String, String>> fields;

    @NameInMap("keyField")
    public String keyField;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("plugins")
    public java.util.Map<String, DataSourcePluginsValue> plugins;

    @NameInMap("schemaName")
    public String schemaName;

    @NameInMap("tableName")
    public String tableName;

    @NameInMap("type")
    public String type;

    public static DataSource build(java.util.Map<String, ?> map) throws Exception {
        DataSource self = new DataSource();
        return TeaModel.build(map, self);
    }

    public DataSource setFields(java.util.List<java.util.Map<String, String>> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getFields() {
        return this.fields;
    }

    public DataSource setKeyField(String keyField) {
        this.keyField = keyField;
        return this;
    }
    public String getKeyField() {
        return this.keyField;
    }

    public DataSource setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public DataSource setPlugins(java.util.Map<String, DataSourcePluginsValue> plugins) {
        this.plugins = plugins;
        return this;
    }
    public java.util.Map<String, DataSourcePluginsValue> getPlugins() {
        return this.plugins;
    }

    public DataSource setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public DataSource setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DataSource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
