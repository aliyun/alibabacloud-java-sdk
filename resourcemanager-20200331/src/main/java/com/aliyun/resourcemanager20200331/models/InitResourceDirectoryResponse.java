// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InitResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitResourceDirectoryResponseBody body;

    public static InitResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        InitResourceDirectoryResponse self = new InitResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public InitResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitResourceDirectoryResponse setBody(InitResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public InitResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
