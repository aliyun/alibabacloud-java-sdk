// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteTLSCipherPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteTLSCipherPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTLSCipherPolicyResponse setBody(DeleteTLSCipherPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTLSCipherPolicyResponseBody getBody() {
        return this.body;
    }

}
