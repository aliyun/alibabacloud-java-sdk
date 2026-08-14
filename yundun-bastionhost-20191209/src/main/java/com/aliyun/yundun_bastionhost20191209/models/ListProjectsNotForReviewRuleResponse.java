// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectsNotForReviewRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectsNotForReviewRuleResponseBody body;

    public static ListProjectsNotForReviewRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsNotForReviewRuleResponse self = new ListProjectsNotForReviewRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsNotForReviewRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectsNotForReviewRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectsNotForReviewRuleResponse setBody(ListProjectsNotForReviewRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectsNotForReviewRuleResponseBody getBody() {
        return this.body;
    }

}
