// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSystemparameterconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSystemparameterconfigResponseBody body;

    public static QueryLinkefabricFabricSystemparameterconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSystemparameterconfigResponse self = new QueryLinkefabricFabricSystemparameterconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSystemparameterconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSystemparameterconfigResponse setBody(QueryLinkefabricFabricSystemparameterconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSystemparameterconfigResponseBody getBody() {
        return this.body;
    }

}
