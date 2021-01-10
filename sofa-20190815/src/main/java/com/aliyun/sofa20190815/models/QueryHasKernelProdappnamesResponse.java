// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasKernelProdappnamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasKernelProdappnamesResponseBody body;

    public static QueryHasKernelProdappnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasKernelProdappnamesResponse self = new QueryHasKernelProdappnamesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasKernelProdappnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasKernelProdappnamesResponse setBody(QueryHasKernelProdappnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasKernelProdappnamesResponseBody getBody() {
        return this.body;
    }

}
