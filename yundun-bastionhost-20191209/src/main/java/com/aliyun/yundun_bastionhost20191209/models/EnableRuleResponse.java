// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class EnableRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableRuleResponseBody body;

    public static EnableRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableRuleResponse self = new EnableRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableRuleResponse setBody(EnableRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRuleResponseBody getBody() {
        return this.body;
    }

}
