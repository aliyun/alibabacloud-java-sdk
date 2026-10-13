// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncConnectionsResponseBody body;

    public static ListContextDatabaseSyncConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncConnectionsResponse self = new ListContextDatabaseSyncConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncConnectionsResponse setBody(ListContextDatabaseSyncConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncConnectionsResponseBody getBody() {
        return this.body;
    }

}
