// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsSgCircuitBreakerRuleResponseBody body;

    public static AddMsSgCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgCircuitBreakerRuleResponse self = new AddMsSgCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddMsSgCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsSgCircuitBreakerRuleResponse setBody(AddMsSgCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsSgCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
