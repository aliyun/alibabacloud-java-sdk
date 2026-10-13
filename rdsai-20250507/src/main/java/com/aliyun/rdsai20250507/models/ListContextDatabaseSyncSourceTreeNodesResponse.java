// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncSourceTreeNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncSourceTreeNodesResponseBody body;

    public static ListContextDatabaseSyncSourceTreeNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncSourceTreeNodesResponse self = new ListContextDatabaseSyncSourceTreeNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncSourceTreeNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncSourceTreeNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncSourceTreeNodesResponse setBody(ListContextDatabaseSyncSourceTreeNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncSourceTreeNodesResponseBody getBody() {
        return this.body;
    }

}
