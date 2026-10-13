// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteContextDatabaseSyncSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextDatabaseSyncSourceResponseBody body;

    public static DeleteContextDatabaseSyncSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDatabaseSyncSourceResponse self = new DeleteContextDatabaseSyncSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextDatabaseSyncSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextDatabaseSyncSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextDatabaseSyncSourceResponse setBody(DeleteContextDatabaseSyncSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextDatabaseSyncSourceResponseBody getBody() {
        return this.body;
    }

}
