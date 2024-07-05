// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindDirectoryResponseBody body;

    public static BindDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDirectoryResponse self = new BindDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public BindDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindDirectoryResponse setBody(BindDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDirectoryResponseBody getBody() {
        return this.body;
    }

}
