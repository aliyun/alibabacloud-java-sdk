// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class EnableApplicationScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationScalingRuleResponseBody body;

    public static EnableApplicationScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationScalingRuleResponse self = new EnableApplicationScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationScalingRuleResponse setBody(EnableApplicationScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationScalingRuleResponseBody getBody() {
        return this.body;
    }

}
