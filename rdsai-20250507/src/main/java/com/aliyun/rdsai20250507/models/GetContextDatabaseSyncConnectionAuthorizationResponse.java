// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncConnectionAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseSyncConnectionAuthorizationResponseBody body;

    public static GetContextDatabaseSyncConnectionAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncConnectionAuthorizationResponse self = new GetContextDatabaseSyncConnectionAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponse setBody(GetContextDatabaseSyncConnectionAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseSyncConnectionAuthorizationResponseBody getBody() {
        return this.body;
    }

}
