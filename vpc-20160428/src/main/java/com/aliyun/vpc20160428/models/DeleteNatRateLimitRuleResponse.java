// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatRateLimitRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNatRateLimitRuleResponseBody body;

    public static DeleteNatRateLimitRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatRateLimitRuleResponse self = new DeleteNatRateLimitRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNatRateLimitRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNatRateLimitRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNatRateLimitRuleResponse setBody(DeleteNatRateLimitRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNatRateLimitRuleResponseBody getBody() {
        return this.body;
    }

}
