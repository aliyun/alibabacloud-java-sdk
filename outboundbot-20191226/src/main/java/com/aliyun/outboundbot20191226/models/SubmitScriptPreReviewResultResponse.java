// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitScriptPreReviewResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitScriptPreReviewResultResponseBody body;

    public static SubmitScriptPreReviewResultResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitScriptPreReviewResultResponse self = new SubmitScriptPreReviewResultResponse();
        return TeaModel.build(map, self);
    }

    public SubmitScriptPreReviewResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitScriptPreReviewResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitScriptPreReviewResultResponse setBody(SubmitScriptPreReviewResultResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitScriptPreReviewResultResponseBody getBody() {
        return this.body;
    }

}
