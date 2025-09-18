// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryArmsEnableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryArmsEnableResponseBody body;

    public static QueryArmsEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryArmsEnableResponse self = new QueryArmsEnableResponse();
        return TeaModel.build(map, self);
    }

    public QueryArmsEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryArmsEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryArmsEnableResponse setBody(QueryArmsEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryArmsEnableResponseBody getBody() {
        return this.body;
    }

}
