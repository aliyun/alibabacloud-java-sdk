// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QuerySupplementDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySupplementDetailResponseBody body;

    public static QuerySupplementDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplementDetailResponse self = new QuerySupplementDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupplementDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySupplementDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySupplementDetailResponse setBody(QuerySupplementDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySupplementDetailResponseBody getBody() {
        return this.body;
    }

}
