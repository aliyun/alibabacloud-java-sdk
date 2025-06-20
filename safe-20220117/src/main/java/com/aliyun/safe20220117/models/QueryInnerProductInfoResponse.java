// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryInnerProductInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInnerProductInfoResponseBody body;

    public static QueryInnerProductInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerProductInfoResponse self = new QueryInnerProductInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerProductInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInnerProductInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInnerProductInfoResponse setBody(QueryInnerProductInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInnerProductInfoResponseBody getBody() {
        return this.body;
    }

}
