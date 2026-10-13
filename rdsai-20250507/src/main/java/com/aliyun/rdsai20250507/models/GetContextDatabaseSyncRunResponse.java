// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseSyncRunResponseBody body;

    public static GetContextDatabaseSyncRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncRunResponse self = new GetContextDatabaseSyncRunResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseSyncRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseSyncRunResponse setBody(GetContextDatabaseSyncRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseSyncRunResponseBody getBody() {
        return this.body;
    }

}
