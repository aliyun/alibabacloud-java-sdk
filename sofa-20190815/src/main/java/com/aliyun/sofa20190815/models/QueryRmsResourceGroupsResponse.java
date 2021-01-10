// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsResourceGroupsResponseBody body;

    public static QueryRmsResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupsResponse self = new QueryRmsResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsResourceGroupsResponse setBody(QueryRmsResourceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsResourceGroupsResponseBody getBody() {
        return this.body;
    }

}
