// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaTaskreportsummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaTaskreportsummaryResponseBody body;

    public static QueryLinkeLinkaTaskreportsummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaTaskreportsummaryResponse self = new QueryLinkeLinkaTaskreportsummaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaTaskreportsummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaTaskreportsummaryResponse setBody(QueryLinkeLinkaTaskreportsummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaTaskreportsummaryResponseBody getBody() {
        return this.body;
    }

}
