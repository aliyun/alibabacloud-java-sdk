// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAllResourceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAllResourceGroupsResponseBody body;

    public static QueryRmsAllResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAllResourceGroupsResponse self = new QueryRmsAllResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAllResourceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAllResourceGroupsResponse setBody(QueryRmsAllResourceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAllResourceGroupsResponseBody getBody() {
        return this.body;
    }

}
