// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupByidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsResourceGroupByidResponseBody body;

    public static QueryRmsResourceGroupByidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupByidResponse self = new QueryRmsResourceGroupByidResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupByidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsResourceGroupByidResponse setBody(QueryRmsResourceGroupByidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsResourceGroupByidResponseBody getBody() {
        return this.body;
    }

}
