// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteContextDatabaseSyncConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextDatabaseSyncConnectionResponseBody body;

    public static DeleteContextDatabaseSyncConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDatabaseSyncConnectionResponse self = new DeleteContextDatabaseSyncConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextDatabaseSyncConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextDatabaseSyncConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextDatabaseSyncConnectionResponse setBody(DeleteContextDatabaseSyncConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextDatabaseSyncConnectionResponseBody getBody() {
        return this.body;
    }

}
