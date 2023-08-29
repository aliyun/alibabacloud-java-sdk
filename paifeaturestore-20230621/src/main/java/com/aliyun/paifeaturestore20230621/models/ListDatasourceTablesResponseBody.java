// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourceTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public java.util.List<String> tables;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatasourceTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourceTablesResponseBody self = new ListDatasourceTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasourceTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasourceTablesResponseBody setTables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<String> getTables() {
        return this.tables;
    }

    public ListDatasourceTablesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
