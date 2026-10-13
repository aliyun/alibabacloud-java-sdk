// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextDatabaseSyncConnectionResponseBody body;

    public static UpdateContextDatabaseSyncConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncConnectionResponse self = new UpdateContextDatabaseSyncConnectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextDatabaseSyncConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextDatabaseSyncConnectionResponse setBody(UpdateContextDatabaseSyncConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextDatabaseSyncConnectionResponseBody getBody() {
        return this.body;
    }

}
