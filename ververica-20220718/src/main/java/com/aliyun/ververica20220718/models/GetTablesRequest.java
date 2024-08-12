// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetTablesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>item</p>
     */
    @NameInMap("tableName")
    public String tableName;

    public static GetTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTablesRequest self = new GetTablesRequest();
        return TeaModel.build(map, self);
    }

    public GetTablesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
