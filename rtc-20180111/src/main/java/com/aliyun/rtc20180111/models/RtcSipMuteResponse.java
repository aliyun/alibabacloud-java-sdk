// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSipMuteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RtcSipMuteResponseBody body;

    public static RtcSipMuteResponse build(java.util.Map<String, ?> map) throws Exception {
        RtcSipMuteResponse self = new RtcSipMuteResponse();
        return TeaModel.build(map, self);
    }

    public RtcSipMuteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RtcSipMuteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RtcSipMuteResponse setBody(RtcSipMuteResponseBody body) {
        this.body = body;
        return this;
    }
    public RtcSipMuteResponseBody getBody() {
        return this.body;
    }

}
