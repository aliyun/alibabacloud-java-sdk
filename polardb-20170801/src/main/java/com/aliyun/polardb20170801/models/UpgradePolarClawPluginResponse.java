// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradePolarClawPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradePolarClawPluginResponseBody body;

    public static UpgradePolarClawPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradePolarClawPluginResponse self = new UpgradePolarClawPluginResponse();
        return TeaModel.build(map, self);
    }

    public UpgradePolarClawPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradePolarClawPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradePolarClawPluginResponse setBody(UpgradePolarClawPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePolarClawPluginResponseBody getBody() {
        return this.body;
    }

}
