// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class RestartFileSharesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestartFileSharesResponseBody body;

    public static RestartFileSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartFileSharesResponse self = new RestartFileSharesResponse();
        return TeaModel.build(map, self);
    }

    public RestartFileSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartFileSharesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartFileSharesResponse setBody(RestartFileSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartFileSharesResponseBody getBody() {
        return this.body;
    }

}
