// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TableMeta extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>paimon</p>
     */
    @NameInMap("catalogName")
    public String catalogName;

    /**
     * <strong>example:</strong>
     * <p>paimon-ods</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>order-table</p>
     */
    @NameInMap("tableName")
    public String tableName;

    public static TableMeta build(java.util.Map<String, ?> map) throws Exception {
        TableMeta self = new TableMeta();
        return TeaModel.build(map, self);
    }

    public TableMeta setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public TableMeta setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public TableMeta setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
