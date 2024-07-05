// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindDirectoryResponseBody body;

    public static UnbindDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDirectoryResponse self = new UnbindDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindDirectoryResponse setBody(UnbindDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDirectoryResponseBody getBody() {
        return this.body;
    }

}
