// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisablePolarClawPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisablePolarClawPluginResponseBody body;

    public static DisablePolarClawPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        DisablePolarClawPluginResponse self = new DisablePolarClawPluginResponse();
        return TeaModel.build(map, self);
    }

    public DisablePolarClawPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisablePolarClawPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisablePolarClawPluginResponse setBody(DisablePolarClawPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public DisablePolarClawPluginResponseBody getBody() {
        return this.body;
    }

}
