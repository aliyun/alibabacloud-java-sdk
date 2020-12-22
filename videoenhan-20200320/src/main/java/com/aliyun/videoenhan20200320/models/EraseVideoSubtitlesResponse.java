// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EraseVideoSubtitlesResponseBody body;

    public static EraseVideoSubtitlesResponse build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesResponse self = new EraseVideoSubtitlesResponse();
        return TeaModel.build(map, self);
    }

    public EraseVideoSubtitlesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EraseVideoSubtitlesResponse setBody(EraseVideoSubtitlesResponseBody body) {
        this.body = body;
        return this;
    }
    public EraseVideoSubtitlesResponseBody getBody() {
        return this.body;
    }

}
