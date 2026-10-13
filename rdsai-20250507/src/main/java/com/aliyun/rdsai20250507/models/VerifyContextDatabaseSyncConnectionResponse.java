// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class VerifyContextDatabaseSyncConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyContextDatabaseSyncConnectionResponseBody body;

    public static VerifyContextDatabaseSyncConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyContextDatabaseSyncConnectionResponse self = new VerifyContextDatabaseSyncConnectionResponse();
        return TeaModel.build(map, self);
    }

    public VerifyContextDatabaseSyncConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyContextDatabaseSyncConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyContextDatabaseSyncConnectionResponse setBody(VerifyContextDatabaseSyncConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyContextDatabaseSyncConnectionResponseBody getBody() {
        return this.body;
    }

}
