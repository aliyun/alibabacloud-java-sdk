// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DeleteSecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityPolicyResponseBody body;

    public static DeleteSecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityPolicyResponse self = new DeleteSecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityPolicyResponse setBody(DeleteSecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
