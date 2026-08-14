// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetReviewRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReviewRuleResponseBody body;

    public static GetReviewRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReviewRuleResponse self = new GetReviewRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetReviewRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReviewRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReviewRuleResponse setBody(GetReviewRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReviewRuleResponseBody getBody() {
        return this.body;
    }

}
