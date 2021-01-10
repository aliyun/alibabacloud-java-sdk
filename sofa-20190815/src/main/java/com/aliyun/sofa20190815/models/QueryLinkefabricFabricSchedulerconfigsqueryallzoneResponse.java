// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponseBody body;

    public static QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse self = new QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse setBody(QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponseBody getBody() {
        return this.body;
    }

}
