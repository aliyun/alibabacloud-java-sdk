// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SubmitPreview extends TeaModel {
    @NameInMap("queryName")
    public String queryName;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("tableSchemas")
    public java.util.List<TableSchema> tableSchemas;

    public static SubmitPreview build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreview self = new SubmitPreview();
        return TeaModel.build(map, self);
    }

    public SubmitPreview setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public SubmitPreview setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SubmitPreview setTableSchemas(java.util.List<TableSchema> tableSchemas) {
        this.tableSchemas = tableSchemas;
        return this;
    }
    public java.util.List<TableSchema> getTableSchemas() {
        return this.tableSchemas;
    }

}
