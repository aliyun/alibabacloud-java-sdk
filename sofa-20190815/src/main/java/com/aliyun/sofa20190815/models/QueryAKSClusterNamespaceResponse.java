// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSClusterNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAKSClusterNamespaceResponseBody body;

    public static QueryAKSClusterNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSClusterNamespaceResponse self = new QueryAKSClusterNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAKSClusterNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAKSClusterNamespaceResponse setBody(QueryAKSClusterNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAKSClusterNamespaceResponseBody getBody() {
        return this.body;
    }

}
