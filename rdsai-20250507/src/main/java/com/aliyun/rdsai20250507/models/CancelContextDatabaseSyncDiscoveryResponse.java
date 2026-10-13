// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CancelContextDatabaseSyncDiscoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelContextDatabaseSyncDiscoveryResponseBody body;

    public static CancelContextDatabaseSyncDiscoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelContextDatabaseSyncDiscoveryResponse self = new CancelContextDatabaseSyncDiscoveryResponse();
        return TeaModel.build(map, self);
    }

    public CancelContextDatabaseSyncDiscoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelContextDatabaseSyncDiscoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelContextDatabaseSyncDiscoveryResponse setBody(CancelContextDatabaseSyncDiscoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelContextDatabaseSyncDiscoveryResponseBody getBody() {
        return this.body;
    }

}
