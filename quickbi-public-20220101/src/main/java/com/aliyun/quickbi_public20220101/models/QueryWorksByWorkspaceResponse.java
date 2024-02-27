// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWorksByWorkspaceResponseBody body;

    public static QueryWorksByWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByWorkspaceResponse self = new QueryWorksByWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorksByWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorksByWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWorksByWorkspaceResponse setBody(QueryWorksByWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorksByWorkspaceResponseBody getBody() {
        return this.body;
    }

}
