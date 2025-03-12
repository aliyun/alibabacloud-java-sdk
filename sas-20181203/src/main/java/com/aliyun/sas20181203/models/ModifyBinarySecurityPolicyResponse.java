// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBinarySecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBinarySecurityPolicyResponseBody body;

    public static ModifyBinarySecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBinarySecurityPolicyResponse self = new ModifyBinarySecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBinarySecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBinarySecurityPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBinarySecurityPolicyResponse setBody(ModifyBinarySecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBinarySecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
