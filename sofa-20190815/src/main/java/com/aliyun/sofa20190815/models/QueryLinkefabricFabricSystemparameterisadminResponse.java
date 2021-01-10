// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSystemparameterisadminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSystemparameterisadminResponseBody body;

    public static QueryLinkefabricFabricSystemparameterisadminResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSystemparameterisadminResponse self = new QueryLinkefabricFabricSystemparameterisadminResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSystemparameterisadminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSystemparameterisadminResponse setBody(QueryLinkefabricFabricSystemparameterisadminResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSystemparameterisadminResponseBody getBody() {
        return this.body;
    }

}
