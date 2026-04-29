// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradePolarClawChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradePolarClawChannelResponseBody body;

    public static UpgradePolarClawChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradePolarClawChannelResponse self = new UpgradePolarClawChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpgradePolarClawChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradePolarClawChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradePolarClawChannelResponse setBody(UpgradePolarClawChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePolarClawChannelResponseBody getBody() {
        return this.body;
    }

}
