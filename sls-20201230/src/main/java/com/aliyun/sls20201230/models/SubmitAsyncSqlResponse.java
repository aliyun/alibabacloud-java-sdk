// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SubmitAsyncSqlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsyncSqlResponseData body;

    public static SubmitAsyncSqlResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsyncSqlResponse self = new SubmitAsyncSqlResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAsyncSqlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAsyncSqlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAsyncSqlResponse setBody(AsyncSqlResponseData body) {
        this.body = body;
        return this;
    }
    public AsyncSqlResponseData getBody() {
        return this.body;
    }

}
