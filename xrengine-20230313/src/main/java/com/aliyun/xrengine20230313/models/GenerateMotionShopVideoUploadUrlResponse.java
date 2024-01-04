// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class GenerateMotionShopVideoUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateMotionShopVideoUploadUrlResponseBody body;

    public static GenerateMotionShopVideoUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateMotionShopVideoUploadUrlResponse self = new GenerateMotionShopVideoUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateMotionShopVideoUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateMotionShopVideoUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateMotionShopVideoUploadUrlResponse setBody(GenerateMotionShopVideoUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateMotionShopVideoUploadUrlResponseBody getBody() {
        return this.body;
    }

}
