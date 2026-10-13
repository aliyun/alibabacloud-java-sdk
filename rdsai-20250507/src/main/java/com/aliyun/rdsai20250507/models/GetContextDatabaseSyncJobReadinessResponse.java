// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncJobReadinessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseSyncJobReadinessResponseBody body;

    public static GetContextDatabaseSyncJobReadinessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncJobReadinessResponse self = new GetContextDatabaseSyncJobReadinessResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncJobReadinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseSyncJobReadinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseSyncJobReadinessResponse setBody(GetContextDatabaseSyncJobReadinessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseSyncJobReadinessResponseBody getBody() {
        return this.body;
    }

}
