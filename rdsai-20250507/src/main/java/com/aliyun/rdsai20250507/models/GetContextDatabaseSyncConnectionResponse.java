// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseSyncConnectionResponseBody body;

    public static GetContextDatabaseSyncConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncConnectionResponse self = new GetContextDatabaseSyncConnectionResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseSyncConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseSyncConnectionResponse setBody(GetContextDatabaseSyncConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseSyncConnectionResponseBody getBody() {
        return this.body;
    }

}
