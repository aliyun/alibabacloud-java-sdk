// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateOssUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOssUploadResponseBody body;

    public static CreateOssUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOssUploadResponse self = new CreateOssUploadResponse();
        return TeaModel.build(map, self);
    }

    public CreateOssUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOssUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOssUploadResponse setBody(CreateOssUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOssUploadResponseBody getBody() {
        return this.body;
    }

}
