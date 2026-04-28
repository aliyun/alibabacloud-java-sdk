// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteBudgetPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBudgetPolicyResponseBody body;

    public static DeleteBudgetPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBudgetPolicyResponse self = new DeleteBudgetPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBudgetPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBudgetPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBudgetPolicyResponse setBody(DeleteBudgetPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBudgetPolicyResponseBody getBody() {
        return this.body;
    }

}
