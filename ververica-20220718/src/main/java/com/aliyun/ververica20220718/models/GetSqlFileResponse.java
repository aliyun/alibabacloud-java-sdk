// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetSqlFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlFileResponseBody body;

    public static GetSqlFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlFileResponse self = new GetSqlFileResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlFileResponse setBody(GetSqlFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlFileResponseBody getBody() {
        return this.body;
    }

}
