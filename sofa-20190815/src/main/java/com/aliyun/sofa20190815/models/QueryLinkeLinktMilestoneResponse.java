// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktMilestoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktMilestoneResponseBody body;

    public static QueryLinkeLinktMilestoneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktMilestoneResponse self = new QueryLinkeLinktMilestoneResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktMilestoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktMilestoneResponse setBody(QueryLinkeLinktMilestoneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktMilestoneResponseBody getBody() {
        return this.body;
    }

}
