// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateTLSCipherPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateTLSCipherPolicyResponse setBody(CreateTLSCipherPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTLSCipherPolicyResponseBody getBody() {
        return this.body;
    }

}
