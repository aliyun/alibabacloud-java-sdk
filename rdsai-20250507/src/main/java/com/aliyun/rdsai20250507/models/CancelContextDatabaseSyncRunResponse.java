// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CancelContextDatabaseSyncRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelContextDatabaseSyncRunResponseBody body;

    public static CancelContextDatabaseSyncRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelContextDatabaseSyncRunResponse self = new CancelContextDatabaseSyncRunResponse();
        return TeaModel.build(map, self);
    }

    public CancelContextDatabaseSyncRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelContextDatabaseSyncRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelContextDatabaseSyncRunResponse setBody(CancelContextDatabaseSyncRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelContextDatabaseSyncRunResponseBody getBody() {
        return this.body;
    }

}
