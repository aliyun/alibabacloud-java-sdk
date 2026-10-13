// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class RetryFailedContextDatabaseSyncRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryFailedContextDatabaseSyncRunResponseBody body;

    public static RetryFailedContextDatabaseSyncRunResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryFailedContextDatabaseSyncRunResponse self = new RetryFailedContextDatabaseSyncRunResponse();
        return TeaModel.build(map, self);
    }

    public RetryFailedContextDatabaseSyncRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryFailedContextDatabaseSyncRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryFailedContextDatabaseSyncRunResponse setBody(RetryFailedContextDatabaseSyncRunResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryFailedContextDatabaseSyncRunResponseBody getBody() {
        return this.body;
    }

}
