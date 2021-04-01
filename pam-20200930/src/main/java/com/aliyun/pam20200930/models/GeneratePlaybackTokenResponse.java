// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GeneratePlaybackTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GeneratePlaybackTokenResponseBody body;

    public static GeneratePlaybackTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GeneratePlaybackTokenResponse self = new GeneratePlaybackTokenResponse();
        return TeaModel.build(map, self);
    }

    public GeneratePlaybackTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeneratePlaybackTokenResponse setBody(GeneratePlaybackTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneratePlaybackTokenResponseBody getBody() {
        return this.body;
    }

}
