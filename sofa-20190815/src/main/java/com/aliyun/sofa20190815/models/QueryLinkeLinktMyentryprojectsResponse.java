// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktMyentryprojectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktMyentryprojectsResponseBody body;

    public static QueryLinkeLinktMyentryprojectsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktMyentryprojectsResponse self = new QueryLinkeLinktMyentryprojectsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktMyentryprojectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktMyentryprojectsResponse setBody(QueryLinkeLinktMyentryprojectsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktMyentryprojectsResponseBody getBody() {
        return this.body;
    }

}
