// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class QueryByInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryByInstanceInfoResponseBody body;

    public static QueryByInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryByInstanceInfoResponse self = new QueryByInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryByInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryByInstanceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryByInstanceInfoResponse setBody(QueryByInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryByInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
