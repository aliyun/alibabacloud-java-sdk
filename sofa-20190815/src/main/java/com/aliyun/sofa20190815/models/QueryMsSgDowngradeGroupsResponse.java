// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgDowngradeGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgDowngradeGroupsResponseBody body;

    public static QueryMsSgDowngradeGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgDowngradeGroupsResponse self = new QueryMsSgDowngradeGroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgDowngradeGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgDowngradeGroupsResponse setBody(QueryMsSgDowngradeGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgDowngradeGroupsResponseBody getBody() {
        return this.body;
    }

}
