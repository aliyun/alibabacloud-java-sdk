// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseSyncJobResponseBody body;

    public static GetContextDatabaseSyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncJobResponse self = new GetContextDatabaseSyncJobResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseSyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseSyncJobResponse setBody(GetContextDatabaseSyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseSyncJobResponseBody getBody() {
        return this.body;
    }

}
