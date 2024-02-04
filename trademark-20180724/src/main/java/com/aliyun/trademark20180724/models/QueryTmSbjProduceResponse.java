// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTmSbjProduceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTmSbjProduceResponseBody body;

    public static QueryTmSbjProduceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTmSbjProduceResponse self = new QueryTmSbjProduceResponse();
        return TeaModel.build(map, self);
    }

    public QueryTmSbjProduceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTmSbjProduceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTmSbjProduceResponse setBody(QueryTmSbjProduceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTmSbjProduceResponseBody getBody() {
        return this.body;
    }

}
