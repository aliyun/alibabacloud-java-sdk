// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextDatabaseSyncJobResponseBody body;

    public static UpdateContextDatabaseSyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncJobResponse self = new UpdateContextDatabaseSyncJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextDatabaseSyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextDatabaseSyncJobResponse setBody(UpdateContextDatabaseSyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextDatabaseSyncJobResponseBody getBody() {
        return this.body;
    }

}
