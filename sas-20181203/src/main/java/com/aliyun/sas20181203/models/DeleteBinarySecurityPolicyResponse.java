// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBinarySecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBinarySecurityPolicyResponseBody body;

    public static DeleteBinarySecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBinarySecurityPolicyResponse self = new DeleteBinarySecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBinarySecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBinarySecurityPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBinarySecurityPolicyResponse setBody(DeleteBinarySecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBinarySecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
