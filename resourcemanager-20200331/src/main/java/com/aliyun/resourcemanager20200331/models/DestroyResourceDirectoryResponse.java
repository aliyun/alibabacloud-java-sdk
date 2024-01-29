// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DestroyResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DestroyResourceDirectoryResponseBody body;

    public static DestroyResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyResourceDirectoryResponse self = new DestroyResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public DestroyResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestroyResourceDirectoryResponse setBody(DestroyResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
