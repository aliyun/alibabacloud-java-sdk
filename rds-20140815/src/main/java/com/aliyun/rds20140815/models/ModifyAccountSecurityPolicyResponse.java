// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountSecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountSecurityPolicyResponseBody body;

    public static ModifyAccountSecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountSecurityPolicyResponse self = new ModifyAccountSecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountSecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountSecurityPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountSecurityPolicyResponse setBody(ModifyAccountSecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountSecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
