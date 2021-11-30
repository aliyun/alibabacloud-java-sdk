// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateMultipartUploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitiateMultipartUploadResponseBody body;

    public static InitiateMultipartUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        InitiateMultipartUploadResponse self = new InitiateMultipartUploadResponse();
        return TeaModel.build(map, self);
    }

    public InitiateMultipartUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitiateMultipartUploadResponse setBody(InitiateMultipartUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public InitiateMultipartUploadResponseBody getBody() {
        return this.body;
    }

}
