// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsResourceGroupByNameResponseBody body;

    public static QueryRmsResourceGroupByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupByNameResponse self = new QueryRmsResourceGroupByNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsResourceGroupByNameResponse setBody(QueryRmsResourceGroupByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsResourceGroupByNameResponseBody getBody() {
        return this.body;
    }

}
