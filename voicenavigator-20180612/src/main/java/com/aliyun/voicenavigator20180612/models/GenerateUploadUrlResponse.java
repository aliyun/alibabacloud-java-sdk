// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GenerateUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateUploadUrlResponseBody body;

    public static GenerateUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadUrlResponse self = new GenerateUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUploadUrlResponse setBody(GenerateUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUploadUrlResponseBody getBody() {
        return this.body;
    }

}
