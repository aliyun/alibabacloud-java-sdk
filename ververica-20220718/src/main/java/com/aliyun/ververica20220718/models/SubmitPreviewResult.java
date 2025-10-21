// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SubmitPreviewResult extends TeaModel {
    @NameInMap("queryId")
    public String queryId;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("tableSchemas")
    public java.util.List<TableSchema> tableSchemas;

    public static SubmitPreviewResult build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreviewResult self = new SubmitPreviewResult();
        return TeaModel.build(map, self);
    }

    public SubmitPreviewResult setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public SubmitPreviewResult setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SubmitPreviewResult setTableSchemas(java.util.List<TableSchema> tableSchemas) {
        this.tableSchemas = tableSchemas;
        return this;
    }
    public java.util.List<TableSchema> getTableSchemas() {
        return this.tableSchemas;
    }

}
