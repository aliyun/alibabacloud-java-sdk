// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncRunsResponseBody body;

    public static ListContextDatabaseSyncRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncRunsResponse self = new ListContextDatabaseSyncRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncRunsResponse setBody(ListContextDatabaseSyncRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncRunsResponseBody getBody() {
        return this.body;
    }

}
