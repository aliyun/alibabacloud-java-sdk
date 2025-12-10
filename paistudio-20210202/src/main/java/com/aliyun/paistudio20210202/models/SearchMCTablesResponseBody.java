// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class SearchMCTablesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
     */
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
