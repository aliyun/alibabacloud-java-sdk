// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class StartContextDatabaseSyncSourceDiscoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartContextDatabaseSyncSourceDiscoveryResponseBody body;

    public static StartContextDatabaseSyncSourceDiscoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        StartContextDatabaseSyncSourceDiscoveryResponse self = new StartContextDatabaseSyncSourceDiscoveryResponse();
        return TeaModel.build(map, self);
    }

    public StartContextDatabaseSyncSourceDiscoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartContextDatabaseSyncSourceDiscoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartContextDatabaseSyncSourceDiscoveryResponse setBody(StartContextDatabaseSyncSourceDiscoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public StartContextDatabaseSyncSourceDiscoveryResponseBody getBody() {
        return this.body;
    }

}
