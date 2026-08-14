// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListReviewRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListReviewRulesResponseBody body;

    public static ListReviewRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReviewRulesResponse self = new ListReviewRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListReviewRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReviewRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReviewRulesResponse setBody(ListReviewRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReviewRulesResponseBody getBody() {
        return this.body;
    }

}
