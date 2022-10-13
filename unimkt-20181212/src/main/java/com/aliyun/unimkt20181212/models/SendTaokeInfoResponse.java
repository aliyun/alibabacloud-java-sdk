// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class SendTaokeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendTaokeInfoResponseBody body;

    public static SendTaokeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTaokeInfoResponse self = new SendTaokeInfoResponse();
        return TeaModel.build(map, self);
    }

    public SendTaokeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTaokeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendTaokeInfoResponse setBody(SendTaokeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTaokeInfoResponseBody getBody() {
        return this.body;
    }

}
