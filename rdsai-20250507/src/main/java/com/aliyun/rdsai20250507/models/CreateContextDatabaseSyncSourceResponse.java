// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseSyncSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextDatabaseSyncSourceResponseBody body;

    public static CreateContextDatabaseSyncSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseSyncSourceResponse self = new CreateContextDatabaseSyncSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseSyncSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextDatabaseSyncSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextDatabaseSyncSourceResponse setBody(CreateContextDatabaseSyncSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextDatabaseSyncSourceResponseBody getBody() {
        return this.body;
    }

}
