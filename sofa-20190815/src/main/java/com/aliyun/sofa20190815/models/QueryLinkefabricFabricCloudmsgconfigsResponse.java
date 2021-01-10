// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudmsgconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricCloudmsgconfigsResponseBody body;

    public static QueryLinkefabricFabricCloudmsgconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudmsgconfigsResponse self = new QueryLinkefabricFabricCloudmsgconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudmsgconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricCloudmsgconfigsResponse setBody(QueryLinkefabricFabricCloudmsgconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricCloudmsgconfigsResponseBody getBody() {
        return this.body;
    }

}
