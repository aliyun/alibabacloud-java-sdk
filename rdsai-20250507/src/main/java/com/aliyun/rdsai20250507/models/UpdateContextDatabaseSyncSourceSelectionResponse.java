// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncSourceSelectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextDatabaseSyncSourceSelectionResponseBody body;

    public static UpdateContextDatabaseSyncSourceSelectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncSourceSelectionResponse self = new UpdateContextDatabaseSyncSourceSelectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncSourceSelectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextDatabaseSyncSourceSelectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextDatabaseSyncSourceSelectionResponse setBody(UpdateContextDatabaseSyncSourceSelectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextDatabaseSyncSourceSelectionResponseBody getBody() {
        return this.body;
    }

}
