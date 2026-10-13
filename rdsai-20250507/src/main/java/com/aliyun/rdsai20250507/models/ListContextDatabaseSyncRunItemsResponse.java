// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncRunItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncRunItemsResponseBody body;

    public static ListContextDatabaseSyncRunItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncRunItemsResponse self = new ListContextDatabaseSyncRunItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncRunItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncRunItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncRunItemsResponse setBody(ListContextDatabaseSyncRunItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncRunItemsResponseBody getBody() {
        return this.body;
    }

}
