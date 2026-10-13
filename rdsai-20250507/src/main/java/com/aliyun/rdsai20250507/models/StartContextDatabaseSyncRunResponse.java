// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class StartContextDatabaseSyncRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartContextDatabaseSyncRunResponseBody body;

    public static StartContextDatabaseSyncRunResponse build(java.util.Map<String, ?> map) throws Exception {
        StartContextDatabaseSyncRunResponse self = new StartContextDatabaseSyncRunResponse();
        return TeaModel.build(map, self);
    }

    public StartContextDatabaseSyncRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartContextDatabaseSyncRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartContextDatabaseSyncRunResponse setBody(StartContextDatabaseSyncRunResponseBody body) {
        this.body = body;
        return this;
    }
    public StartContextDatabaseSyncRunResponseBody getBody() {
        return this.body;
    }

}
