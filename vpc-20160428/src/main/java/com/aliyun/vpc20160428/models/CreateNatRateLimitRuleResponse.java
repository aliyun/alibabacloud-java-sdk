// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatRateLimitRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNatRateLimitRuleResponseBody body;

    public static CreateNatRateLimitRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatRateLimitRuleResponse self = new CreateNatRateLimitRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatRateLimitRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNatRateLimitRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNatRateLimitRuleResponse setBody(CreateNatRateLimitRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatRateLimitRuleResponseBody getBody() {
        return this.body;
    }

}
