// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisablePolarClawChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisablePolarClawChannelResponseBody body;

    public static DisablePolarClawChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DisablePolarClawChannelResponse self = new DisablePolarClawChannelResponse();
        return TeaModel.build(map, self);
    }

    public DisablePolarClawChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisablePolarClawChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisablePolarClawChannelResponse setBody(DisablePolarClawChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DisablePolarClawChannelResponseBody getBody() {
        return this.body;
    }

}
