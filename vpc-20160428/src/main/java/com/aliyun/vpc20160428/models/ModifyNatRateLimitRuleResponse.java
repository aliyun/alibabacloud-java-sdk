// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatRateLimitRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNatRateLimitRuleResponseBody body;

    public static ModifyNatRateLimitRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatRateLimitRuleResponse self = new ModifyNatRateLimitRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNatRateLimitRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNatRateLimitRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNatRateLimitRuleResponse setBody(ModifyNatRateLimitRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNatRateLimitRuleResponseBody getBody() {
        return this.body;
    }

}
