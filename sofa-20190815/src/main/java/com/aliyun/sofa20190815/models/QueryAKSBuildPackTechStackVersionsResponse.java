// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSBuildPackTechStackVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAKSBuildPackTechStackVersionsResponseBody body;

    public static QueryAKSBuildPackTechStackVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSBuildPackTechStackVersionsResponse self = new QueryAKSBuildPackTechStackVersionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAKSBuildPackTechStackVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAKSBuildPackTechStackVersionsResponse setBody(QueryAKSBuildPackTechStackVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAKSBuildPackTechStackVersionsResponseBody getBody() {
        return this.body;
    }

}
