// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyActionEventPolicyResponseBody body;

    public static ModifyActionEventPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventPolicyResponse self = new ModifyActionEventPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyActionEventPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyActionEventPolicyResponse setBody(ModifyActionEventPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActionEventPolicyResponseBody getBody() {
        return this.body;
    }

}
