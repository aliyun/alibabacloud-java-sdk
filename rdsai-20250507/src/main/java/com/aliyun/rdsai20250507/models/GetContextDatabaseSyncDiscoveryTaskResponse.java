// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncDiscoveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseSyncDiscoveryTaskResponseBody body;

    public static GetContextDatabaseSyncDiscoveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncDiscoveryTaskResponse self = new GetContextDatabaseSyncDiscoveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncDiscoveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseSyncDiscoveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseSyncDiscoveryTaskResponse setBody(GetContextDatabaseSyncDiscoveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseSyncDiscoveryTaskResponseBody getBody() {
        return this.body;
    }

}
