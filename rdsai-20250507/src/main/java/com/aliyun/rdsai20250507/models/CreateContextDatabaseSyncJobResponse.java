// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseSyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextDatabaseSyncJobResponseBody body;

    public static CreateContextDatabaseSyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseSyncJobResponse self = new CreateContextDatabaseSyncJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseSyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextDatabaseSyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextDatabaseSyncJobResponse setBody(CreateContextDatabaseSyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextDatabaseSyncJobResponseBody getBody() {
        return this.body;
    }

}
