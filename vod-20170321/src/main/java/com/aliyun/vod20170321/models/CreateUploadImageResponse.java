// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUploadImageResponseBody body;

    public static CreateUploadImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadImageResponse self = new CreateUploadImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUploadImageResponse setBody(CreateUploadImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadImageResponseBody getBody() {
        return this.body;
    }

}
