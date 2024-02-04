// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GenerateUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
