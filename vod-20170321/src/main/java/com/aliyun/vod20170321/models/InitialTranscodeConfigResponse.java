// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class InitialTranscodeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitialTranscodeConfigResponseBody body;

    public static InitialTranscodeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        InitialTranscodeConfigResponse self = new InitialTranscodeConfigResponse();
        return TeaModel.build(map, self);
    }

    public InitialTranscodeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitialTranscodeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitialTranscodeConfigResponse setBody(InitialTranscodeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public InitialTranscodeConfigResponseBody getBody() {
        return this.body;
    }

}
