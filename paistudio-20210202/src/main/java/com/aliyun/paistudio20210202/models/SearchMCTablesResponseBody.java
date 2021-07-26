// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class SearchMCTablesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public java.util.List<String> tables;

    public static SearchMCTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMCTablesResponseBody self = new SearchMCTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMCTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMCTablesResponseBody setTables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<String> getTables() {
        return this.tables;
    }

}
