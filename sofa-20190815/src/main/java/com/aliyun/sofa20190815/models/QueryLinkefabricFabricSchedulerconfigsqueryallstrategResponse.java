// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponseBody body;

    public static QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse self = new QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse setBody(QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponseBody getBody() {
        return this.body;
    }

}
