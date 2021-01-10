// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricConfigdisableexecuteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricConfigdisableexecuteResponseBody body;

    public static QueryLinkefabricFabricConfigdisableexecuteResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricConfigdisableexecuteResponse self = new QueryLinkefabricFabricConfigdisableexecuteResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricConfigdisableexecuteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricConfigdisableexecuteResponse setBody(QueryLinkefabricFabricConfigdisableexecuteResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricConfigdisableexecuteResponseBody getBody() {
        return this.body;
    }

}
