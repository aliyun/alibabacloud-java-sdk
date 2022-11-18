// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteACLRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteACLRuleResponseBody body;

    public static DeleteACLRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteACLRuleResponse self = new DeleteACLRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteACLRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteACLRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteACLRuleResponse setBody(DeleteACLRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteACLRuleResponseBody getBody() {
        return this.body;
    }

}
