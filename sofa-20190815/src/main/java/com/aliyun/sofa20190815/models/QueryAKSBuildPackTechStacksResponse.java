// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSBuildPackTechStacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAKSBuildPackTechStacksResponseBody body;

    public static QueryAKSBuildPackTechStacksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSBuildPackTechStacksResponse self = new QueryAKSBuildPackTechStacksResponse();
        return TeaModel.build(map, self);
    }

    public QueryAKSBuildPackTechStacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAKSBuildPackTechStacksResponse setBody(QueryAKSBuildPackTechStacksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAKSBuildPackTechStacksResponseBody getBody() {
        return this.body;
    }

}
