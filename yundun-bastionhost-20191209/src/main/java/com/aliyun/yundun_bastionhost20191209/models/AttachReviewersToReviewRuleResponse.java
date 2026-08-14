// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachReviewersToReviewRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachReviewersToReviewRuleResponseBody body;

    public static AttachReviewersToReviewRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachReviewersToReviewRuleResponse self = new AttachReviewersToReviewRuleResponse();
        return TeaModel.build(map, self);
    }

    public AttachReviewersToReviewRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachReviewersToReviewRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachReviewersToReviewRuleResponse setBody(AttachReviewersToReviewRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachReviewersToReviewRuleResponseBody getBody() {
        return this.body;
    }

}
