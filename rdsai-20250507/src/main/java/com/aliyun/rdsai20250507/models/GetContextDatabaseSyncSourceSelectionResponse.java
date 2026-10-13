// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncSourceSelectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseSyncSourceSelectionResponseBody body;

    public static GetContextDatabaseSyncSourceSelectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncSourceSelectionResponse self = new GetContextDatabaseSyncSourceSelectionResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncSourceSelectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseSyncSourceSelectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseSyncSourceSelectionResponse setBody(GetContextDatabaseSyncSourceSelectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseSyncSourceSelectionResponseBody getBody() {
        return this.body;
    }

}
