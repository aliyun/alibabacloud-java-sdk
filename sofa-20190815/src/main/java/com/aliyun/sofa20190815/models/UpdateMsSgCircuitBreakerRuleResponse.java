// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgCircuitBreakerRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsSgCircuitBreakerRuleResponseBody body;

    public static UpdateMsSgCircuitBreakerRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgCircuitBreakerRuleResponse self = new UpdateMsSgCircuitBreakerRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgCircuitBreakerRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsSgCircuitBreakerRuleResponse setBody(UpdateMsSgCircuitBreakerRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsSgCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

}
