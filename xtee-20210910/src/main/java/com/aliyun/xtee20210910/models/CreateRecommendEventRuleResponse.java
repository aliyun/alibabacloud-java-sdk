// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRecommendEventRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecommendEventRuleResponseBody body;

    public static CreateRecommendEventRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendEventRuleResponse self = new CreateRecommendEventRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecommendEventRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecommendEventRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecommendEventRuleResponse setBody(CreateRecommendEventRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecommendEventRuleResponseBody getBody() {
        return this.body;
    }

}
