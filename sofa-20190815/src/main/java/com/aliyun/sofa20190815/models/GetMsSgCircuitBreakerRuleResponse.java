// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsSgCircuitBreakerRuleResponseBody body;

    public static GetMsSgCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgCircuitBreakerRuleResponse self = new GetMsSgCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetMsSgCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsSgCircuitBreakerRuleResponse setBody(GetMsSgCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsSgCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
