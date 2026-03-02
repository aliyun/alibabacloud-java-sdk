// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class LineageTable extends TeaModel {
    /**
     * <p>The information about columns.</p>
     */
    @NameInMap("columns")
    public java.util.List<LineageColumn> columns;

    /**
     * <p>The table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>434508</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The information about the table. The information includes the user who creates the table, the user who modifies the table, and the creation time and modification time of the table.</p>
     */
    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>order-test</p>
     */
    @NameInMap("tableName")
    public String tableName;

    /**
     * <p>The parameters of the table.</p>
     */
    @NameInMap("with")
    public java.util.Map<String, ?> with;

    public static LineageTable build(java.util.Map<String, ?> map) throws Exception {
        LineageTable self = new LineageTable();
        return TeaModel.build(map, self);
    }

    public LineageTable setColumns(java.util.List<LineageColumn> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<LineageColumn> getColumns() {
        return this.columns;
    }

    public LineageTable setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LineageTable setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public LineageTable setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public LineageTable setWith(java.util.Map<String, ?> with) {
        this.with = with;
        return this;
    }
    public java.util.Map<String, ?> getWith() {
        return this.with;
    }

}
