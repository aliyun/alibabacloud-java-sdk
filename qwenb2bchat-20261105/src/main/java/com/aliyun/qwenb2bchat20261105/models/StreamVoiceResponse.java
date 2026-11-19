// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261105.models;

import com.aliyun.tea.*;

public class StreamVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StreamVoiceResponseBody body;

    public static StreamVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StreamVoiceResponse self = new StreamVoiceResponse();
        return TeaModel.build(map, self);
    }

    public StreamVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StreamVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StreamVoiceResponse setBody(StreamVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StreamVoiceResponseBody getBody() {
        return this.body;
    }

}
