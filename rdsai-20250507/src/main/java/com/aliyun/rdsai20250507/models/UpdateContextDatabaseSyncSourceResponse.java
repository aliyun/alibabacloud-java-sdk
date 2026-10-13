// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextDatabaseSyncSourceResponseBody body;

    public static UpdateContextDatabaseSyncSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncSourceResponse self = new UpdateContextDatabaseSyncSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextDatabaseSyncSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextDatabaseSyncSourceResponse setBody(UpdateContextDatabaseSyncSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextDatabaseSyncSourceResponseBody getBody() {
        return this.body;
    }

}
