// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopChannelResponseBody body;

    public static StopChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        StopChannelResponse self = new StopChannelResponse();
        return TeaModel.build(map, self);
    }

    public StopChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopChannelResponse setBody(StopChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public StopChannelResponseBody getBody() {
        return this.body;
    }

}
