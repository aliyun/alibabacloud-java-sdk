// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TableResult extends TeaModel {
    @NameInMap("rowUpdates")
    public java.util.List<RowUpdate> rowUpdates;

    @NameInMap("tableName")
    public String tableName;

    public static TableResult build(java.util.Map<String, ?> map) throws Exception {
        TableResult self = new TableResult();
        return TeaModel.build(map, self);
    }

    public TableResult setRowUpdates(java.util.List<RowUpdate> rowUpdates) {
        this.rowUpdates = rowUpdates;
        return this;
    }
    public java.util.List<RowUpdate> getRowUpdates() {
        return this.rowUpdates;
    }

    public TableResult setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
