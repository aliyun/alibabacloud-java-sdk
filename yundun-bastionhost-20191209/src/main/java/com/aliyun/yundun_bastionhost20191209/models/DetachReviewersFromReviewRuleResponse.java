// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachReviewersFromReviewRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachReviewersFromReviewRuleResponseBody body;

    public static DetachReviewersFromReviewRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachReviewersFromReviewRuleResponse self = new DetachReviewersFromReviewRuleResponse();
        return TeaModel.build(map, self);
    }

    public DetachReviewersFromReviewRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachReviewersFromReviewRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachReviewersFromReviewRuleResponse setBody(DetachReviewersFromReviewRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachReviewersFromReviewRuleResponseBody getBody() {
        return this.body;
    }

}
