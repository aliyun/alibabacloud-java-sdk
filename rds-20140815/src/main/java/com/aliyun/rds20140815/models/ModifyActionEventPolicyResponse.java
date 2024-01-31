// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyActionEventPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyActionEventPolicyResponse setBody(ModifyActionEventPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActionEventPolicyResponseBody getBody() {
        return this.body;
    }

}
