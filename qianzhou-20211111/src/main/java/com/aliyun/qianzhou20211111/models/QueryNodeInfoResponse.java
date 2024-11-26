// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class QueryNodeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryNodeInfoResponseBody body;

    public static QueryNodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNodeInfoResponse self = new QueryNodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryNodeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNodeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNodeInfoResponse setBody(QueryNodeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNodeInfoResponseBody getBody() {
        return this.body;
    }

}
