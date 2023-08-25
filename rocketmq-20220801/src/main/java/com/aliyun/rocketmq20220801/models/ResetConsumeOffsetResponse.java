// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ResetConsumeOffsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetConsumeOffsetResponseBody body;

    public static ResetConsumeOffsetResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetConsumeOffsetResponse self = new ResetConsumeOffsetResponse();
        return TeaModel.build(map, self);
    }

    public ResetConsumeOffsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetConsumeOffsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetConsumeOffsetResponse setBody(ResetConsumeOffsetResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetConsumeOffsetResponseBody getBody() {
        return this.body;
    }

}
