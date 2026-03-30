// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class PreviewVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewVoiceResponseBody body;

    public static PreviewVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewVoiceResponse self = new PreviewVoiceResponse();
        return TeaModel.build(map, self);
    }

    public PreviewVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewVoiceResponse setBody(PreviewVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewVoiceResponseBody getBody() {
        return this.body;
    }

}
