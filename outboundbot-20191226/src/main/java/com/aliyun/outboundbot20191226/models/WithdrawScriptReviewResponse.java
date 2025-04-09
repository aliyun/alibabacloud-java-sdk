// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class WithdrawScriptReviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WithdrawScriptReviewResponseBody body;

    public static WithdrawScriptReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        WithdrawScriptReviewResponse self = new WithdrawScriptReviewResponse();
        return TeaModel.build(map, self);
    }

    public WithdrawScriptReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WithdrawScriptReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WithdrawScriptReviewResponse setBody(WithdrawScriptReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawScriptReviewResponseBody getBody() {
        return this.body;
    }

}
