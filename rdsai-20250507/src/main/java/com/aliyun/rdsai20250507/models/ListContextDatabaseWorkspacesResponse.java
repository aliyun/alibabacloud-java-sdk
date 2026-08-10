// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseWorkspacesResponseBody body;

    public static ListContextDatabaseWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseWorkspacesResponse self = new ListContextDatabaseWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseWorkspacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseWorkspacesResponse setBody(ListContextDatabaseWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseWorkspacesResponseBody getBody() {
        return this.body;
    }

}
