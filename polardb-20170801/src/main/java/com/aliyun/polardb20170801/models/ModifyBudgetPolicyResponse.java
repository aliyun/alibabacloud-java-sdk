// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyBudgetPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBudgetPolicyResponseBody body;

    public static ModifyBudgetPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBudgetPolicyResponse self = new ModifyBudgetPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBudgetPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBudgetPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBudgetPolicyResponse setBody(ModifyBudgetPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBudgetPolicyResponseBody getBody() {
        return this.body;
    }

}
