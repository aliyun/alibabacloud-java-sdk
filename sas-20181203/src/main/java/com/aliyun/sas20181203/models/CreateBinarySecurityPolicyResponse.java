// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBinarySecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBinarySecurityPolicyResponseBody body;

    public static CreateBinarySecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBinarySecurityPolicyResponse self = new CreateBinarySecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateBinarySecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBinarySecurityPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBinarySecurityPolicyResponse setBody(CreateBinarySecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBinarySecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
