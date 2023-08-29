// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourceTablesRequest extends TeaModel {
    @NameInMap("TableName")
    public String tableName;

    public static ListDatasourceTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourceTablesRequest self = new ListDatasourceTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasourceTablesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
