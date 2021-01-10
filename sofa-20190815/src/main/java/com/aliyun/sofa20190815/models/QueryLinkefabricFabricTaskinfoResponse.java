// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricTaskinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricTaskinfoResponseBody body;

    public static QueryLinkefabricFabricTaskinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricTaskinfoResponse self = new QueryLinkefabricFabricTaskinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricTaskinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricTaskinfoResponse setBody(QueryLinkefabricFabricTaskinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricTaskinfoResponseBody getBody() {
        return this.body;
    }

}
