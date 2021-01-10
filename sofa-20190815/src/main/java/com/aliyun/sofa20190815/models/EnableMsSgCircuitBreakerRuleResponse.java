// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMsSgCircuitBreakerRuleResponseBody body;

    public static EnableMsSgCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgCircuitBreakerRuleResponse self = new EnableMsSgCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableMsSgCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMsSgCircuitBreakerRuleResponse setBody(EnableMsSgCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMsSgCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
