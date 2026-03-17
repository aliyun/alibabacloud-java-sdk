// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyACLRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyACLRuleResponseBody body;

    public static ModifyACLRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyACLRuleResponse self = new ModifyACLRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyACLRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyACLRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyACLRuleResponse setBody(ModifyACLRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyACLRuleResponseBody getBody() {
        return this.body;
    }

}
