// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateResourceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceRuleResponseBody body;

    public static CreateResourceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRuleResponse self = new CreateResourceRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceRuleResponse setBody(CreateResourceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceRuleResponseBody getBody() {
        return this.body;
    }

}
