// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponseBody body;

    public static QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse self = new QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse setBody(QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponseBody getBody() {
        return this.body;
    }

}
