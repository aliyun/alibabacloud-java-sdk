// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class QueryWorksByWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryWorksByWorkspaceResponse setBody(QueryWorksByWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorksByWorkspaceResponseBody getBody() {
        return this.body;
    }

}
