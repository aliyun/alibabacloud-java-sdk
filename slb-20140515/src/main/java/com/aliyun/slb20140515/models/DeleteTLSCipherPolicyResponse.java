// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteTLSCipherPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTLSCipherPolicyResponseBody body;

    public static DeleteTLSCipherPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTLSCipherPolicyResponse self = new DeleteTLSCipherPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTLSCipherPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTLSCipherPolicyResponse setBody(DeleteTLSCipherPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTLSCipherPolicyResponseBody getBody() {
        return this.body;
    }

}
