// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricConfigdisableswitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricConfigdisableswitchResponseBody body;

    public static QueryLinkefabricFabricConfigdisableswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricConfigdisableswitchResponse self = new QueryLinkefabricFabricConfigdisableswitchResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricConfigdisableswitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricConfigdisableswitchResponse setBody(QueryLinkefabricFabricConfigdisableswitchResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricConfigdisableswitchResponseBody getBody() {
        return this.body;
    }

}
