// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UninstallPolarClawPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallPolarClawPluginResponseBody body;

    public static UninstallPolarClawPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallPolarClawPluginResponse self = new UninstallPolarClawPluginResponse();
        return TeaModel.build(map, self);
    }

    public UninstallPolarClawPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallPolarClawPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallPolarClawPluginResponse setBody(UninstallPolarClawPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallPolarClawPluginResponseBody getBody() {
        return this.body;
    }

}
