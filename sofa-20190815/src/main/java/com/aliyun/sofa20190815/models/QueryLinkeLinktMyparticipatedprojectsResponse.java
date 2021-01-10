// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktMyparticipatedprojectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktMyparticipatedprojectsResponseBody body;

    public static QueryLinkeLinktMyparticipatedprojectsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktMyparticipatedprojectsResponse self = new QueryLinkeLinktMyparticipatedprojectsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktMyparticipatedprojectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktMyparticipatedprojectsResponse setBody(QueryLinkeLinktMyparticipatedprojectsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktMyparticipatedprojectsResponseBody getBody() {
        return this.body;
    }

}
