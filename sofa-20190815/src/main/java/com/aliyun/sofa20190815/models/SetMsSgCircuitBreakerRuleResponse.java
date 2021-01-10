// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetMsSgCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetMsSgCircuitBreakerRuleResponseBody body;

    public static SetMsSgCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMsSgCircuitBreakerRuleResponse self = new SetMsSgCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public SetMsSgCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMsSgCircuitBreakerRuleResponse setBody(SetMsSgCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMsSgCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
