// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DebugResourceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DebugResourceRuleResponseBody body;

    public static DebugResourceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DebugResourceRuleResponse self = new DebugResourceRuleResponse();
        return TeaModel.build(map, self);
    }

    public DebugResourceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DebugResourceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DebugResourceRuleResponse setBody(DebugResourceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DebugResourceRuleResponseBody getBody() {
        return this.body;
    }

}
