// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncSourcesResponseBody body;

    public static ListContextDatabaseSyncSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncSourcesResponse self = new ListContextDatabaseSyncSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncSourcesResponse setBody(ListContextDatabaseSyncSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncSourcesResponseBody getBody() {
        return this.body;
    }

}
