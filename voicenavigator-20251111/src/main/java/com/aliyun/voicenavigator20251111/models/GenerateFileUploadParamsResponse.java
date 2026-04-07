// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GenerateFileUploadParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateFileUploadParamsResponseBody body;

    public static GenerateFileUploadParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadParamsResponse self = new GenerateFileUploadParamsResponse();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateFileUploadParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateFileUploadParamsResponse setBody(GenerateFileUploadParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateFileUploadParamsResponseBody getBody() {
        return this.body;
    }

}
