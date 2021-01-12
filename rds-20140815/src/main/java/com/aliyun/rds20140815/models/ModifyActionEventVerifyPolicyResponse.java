// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventVerifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyActionEventVerifyPolicyResponseBody body;

    public static ModifyActionEventVerifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventVerifyPolicyResponse self = new ModifyActionEventVerifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyActionEventVerifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyActionEventVerifyPolicyResponse setBody(ModifyActionEventVerifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActionEventVerifyPolicyResponseBody getBody() {
        return this.body;
    }

}
