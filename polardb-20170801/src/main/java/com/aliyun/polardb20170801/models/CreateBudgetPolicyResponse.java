// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBudgetPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBudgetPolicyResponseBody body;

    public static CreateBudgetPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBudgetPolicyResponse self = new CreateBudgetPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateBudgetPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBudgetPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBudgetPolicyResponse setBody(CreateBudgetPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBudgetPolicyResponseBody getBody() {
        return this.body;
    }

}
