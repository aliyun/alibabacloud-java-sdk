// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteReviewRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteReviewRulesResponseBody body;

    public static DeleteReviewRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReviewRulesResponse self = new DeleteReviewRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReviewRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReviewRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReviewRulesResponse setBody(DeleteReviewRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReviewRulesResponseBody getBody() {
        return this.body;
    }

}
