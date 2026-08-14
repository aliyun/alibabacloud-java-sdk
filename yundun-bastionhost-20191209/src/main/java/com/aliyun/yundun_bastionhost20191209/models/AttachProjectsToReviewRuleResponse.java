// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachProjectsToReviewRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachProjectsToReviewRuleResponseBody body;

    public static AttachProjectsToReviewRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachProjectsToReviewRuleResponse self = new AttachProjectsToReviewRuleResponse();
        return TeaModel.build(map, self);
    }

    public AttachProjectsToReviewRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachProjectsToReviewRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachProjectsToReviewRuleResponse setBody(AttachProjectsToReviewRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachProjectsToReviewRuleResponseBody getBody() {
        return this.body;
    }

}
