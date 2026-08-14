// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyReviewRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyReviewRuleResponseBody body;

    public static ModifyReviewRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReviewRuleResponse self = new ModifyReviewRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReviewRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReviewRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReviewRuleResponse setBody(ModifyReviewRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReviewRuleResponseBody getBody() {
        return this.body;
    }

}
