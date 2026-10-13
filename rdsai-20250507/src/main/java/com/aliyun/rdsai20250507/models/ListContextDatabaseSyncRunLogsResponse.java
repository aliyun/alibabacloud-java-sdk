// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncRunLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncRunLogsResponseBody body;

    public static ListContextDatabaseSyncRunLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncRunLogsResponse self = new ListContextDatabaseSyncRunLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncRunLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncRunLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncRunLogsResponse setBody(ListContextDatabaseSyncRunLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncRunLogsResponseBody getBody() {
        return this.body;
    }

}
