// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseSyncConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextDatabaseSyncConnectionResponseBody body;

    public static CreateContextDatabaseSyncConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseSyncConnectionResponse self = new CreateContextDatabaseSyncConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseSyncConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextDatabaseSyncConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextDatabaseSyncConnectionResponse setBody(CreateContextDatabaseSyncConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextDatabaseSyncConnectionResponseBody getBody() {
        return this.body;
    }

}
