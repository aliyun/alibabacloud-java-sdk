// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EraseVideoSubtitlesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EraseVideoSubtitlesResponse setBody(EraseVideoSubtitlesResponseBody body) {
        this.body = body;
        return this;
    }
    public EraseVideoSubtitlesResponseBody getBody() {
        return this.body;
    }

}
