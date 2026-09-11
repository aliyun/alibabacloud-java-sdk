// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TranscribeChatVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TranscribeChatVoiceResponseBody body;

    public static TranscribeChatVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        TranscribeChatVoiceResponse self = new TranscribeChatVoiceResponse();
        return TeaModel.build(map, self);
    }

    public TranscribeChatVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranscribeChatVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranscribeChatVoiceResponse setBody(TranscribeChatVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public TranscribeChatVoiceResponseBody getBody() {
        return this.body;
    }

}
