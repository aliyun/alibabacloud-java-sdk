// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricTaskstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricTaskstatusResponseBody body;

    public static QueryLinkefabricFabricTaskstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricTaskstatusResponse self = new QueryLinkefabricFabricTaskstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricTaskstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricTaskstatusResponse setBody(QueryLinkefabricFabricTaskstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricTaskstatusResponseBody getBody() {
        return this.body;
    }

}
