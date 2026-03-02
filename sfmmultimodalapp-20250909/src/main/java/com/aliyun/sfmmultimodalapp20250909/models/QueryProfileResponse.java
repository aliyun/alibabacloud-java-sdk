// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProfileResponseBody body;

    public static QueryProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProfileResponse self = new QueryProfileResponse();
        return TeaModel.build(map, self);
    }

    public QueryProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProfileResponse setBody(QueryProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProfileResponseBody getBody() {
        return this.body;
    }

}
