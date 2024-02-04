// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class SilenceTimeoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SilenceTimeoutResponseBody body;

    public static SilenceTimeoutResponse build(java.util.Map<String, ?> map) throws Exception {
        SilenceTimeoutResponse self = new SilenceTimeoutResponse();
        return TeaModel.build(map, self);
    }

    public SilenceTimeoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SilenceTimeoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SilenceTimeoutResponse setBody(SilenceTimeoutResponseBody body) {
        this.body = body;
        return this;
    }
    public SilenceTimeoutResponseBody getBody() {
        return this.body;
    }

}
