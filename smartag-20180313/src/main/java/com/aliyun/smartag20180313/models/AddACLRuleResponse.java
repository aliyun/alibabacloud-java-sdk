// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddACLRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddACLRuleResponseBody body;

    public static AddACLRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddACLRuleResponse self = new AddACLRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddACLRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddACLRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddACLRuleResponse setBody(AddACLRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddACLRuleResponseBody getBody() {
        return this.body;
    }

}
