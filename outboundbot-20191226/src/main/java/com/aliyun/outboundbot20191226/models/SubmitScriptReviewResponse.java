// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitScriptReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitScriptReviewResponseBody body;

    public static SubmitScriptReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitScriptReviewResponse self = new SubmitScriptReviewResponse();
        return TeaModel.build(map, self);
    }

    public SubmitScriptReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitScriptReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitScriptReviewResponse setBody(SubmitScriptReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitScriptReviewResponseBody getBody() {
        return this.body;
    }

}
