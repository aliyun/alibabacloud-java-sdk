// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateUploadFilePolicyResponseBody body;

    public static GenerateUploadFilePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyResponse self = new GenerateUploadFilePolicyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUploadFilePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUploadFilePolicyResponse setBody(GenerateUploadFilePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUploadFilePolicyResponseBody getBody() {
        return this.body;
    }

}
