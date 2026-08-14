// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateReviewRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReviewRuleResponseBody body;

    public static CreateReviewRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReviewRuleResponse self = new CreateReviewRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateReviewRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReviewRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReviewRuleResponse setBody(CreateReviewRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReviewRuleResponseBody getBody() {
        return this.body;
    }

}
