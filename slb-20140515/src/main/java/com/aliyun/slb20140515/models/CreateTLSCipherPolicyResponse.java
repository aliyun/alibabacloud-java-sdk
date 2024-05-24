// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateTLSCipherPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTLSCipherPolicyResponseBody body;

    public static CreateTLSCipherPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTLSCipherPolicyResponse self = new CreateTLSCipherPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateTLSCipherPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTLSCipherPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTLSCipherPolicyResponse setBody(CreateTLSCipherPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTLSCipherPolicyResponseBody getBody() {
        return this.body;
    }

}
