// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSchedulerconfigsreleasetaskResponseBody body;

    public static QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse self = new QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse setBody(QueryLinkefabricFabricSchedulerconfigsreleasetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSchedulerconfigsreleasetaskResponseBody getBody() {
        return this.body;
    }

}
