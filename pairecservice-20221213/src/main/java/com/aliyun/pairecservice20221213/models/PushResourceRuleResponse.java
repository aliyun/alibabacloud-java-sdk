// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PushResourceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushResourceRuleResponseBody body;

    public static PushResourceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PushResourceRuleResponse self = new PushResourceRuleResponse();
        return TeaModel.build(map, self);
    }

    public PushResourceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushResourceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushResourceRuleResponse setBody(PushResourceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PushResourceRuleResponseBody getBody() {
        return this.body;
    }

}
