// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadPublicKeyResponseBody body;

    public static UploadPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadPublicKeyResponse self = new UploadPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public UploadPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadPublicKeyResponse setBody(UploadPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadPublicKeyResponseBody getBody() {
        return this.body;
    }

}
