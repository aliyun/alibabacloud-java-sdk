// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ResetConsumeOffsetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
