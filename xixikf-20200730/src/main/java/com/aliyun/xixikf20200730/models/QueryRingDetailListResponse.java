// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class QueryRingDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRingDetailListResponseBody body;

    public static QueryRingDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRingDetailListResponse self = new QueryRingDetailListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRingDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRingDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRingDetailListResponse setBody(QueryRingDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRingDetailListResponseBody getBody() {
        return this.body;
    }

}
