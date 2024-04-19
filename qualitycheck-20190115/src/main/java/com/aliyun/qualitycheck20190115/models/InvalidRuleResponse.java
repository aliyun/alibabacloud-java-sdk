// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InvalidRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvalidRuleResponseBody body;

    public static InvalidRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        InvalidRuleResponse self = new InvalidRuleResponse();
        return TeaModel.build(map, self);
    }

    public InvalidRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvalidRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvalidRuleResponse setBody(InvalidRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public InvalidRuleResponseBody getBody() {
        return this.body;
    }

}
