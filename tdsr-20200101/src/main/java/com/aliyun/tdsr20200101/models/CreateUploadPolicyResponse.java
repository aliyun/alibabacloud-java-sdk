// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUploadPolicyResponseBody body;

    public static CreateUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadPolicyResponse self = new CreateUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUploadPolicyResponse setBody(CreateUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
