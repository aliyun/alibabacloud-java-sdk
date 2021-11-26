// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DisableApplicationScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableApplicationScalingRuleResponseBody body;

    public static DisableApplicationScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationScalingRuleResponse self = new DisableApplicationScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationScalingRuleResponse setBody(DisableApplicationScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationScalingRuleResponseBody getBody() {
        return this.body;
    }

}
