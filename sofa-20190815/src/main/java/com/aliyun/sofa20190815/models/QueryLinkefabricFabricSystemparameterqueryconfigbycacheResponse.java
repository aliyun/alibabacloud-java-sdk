// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponseBody body;

    public static QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse self = new QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse setBody(QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponseBody getBody() {
        return this.body;
    }

}
