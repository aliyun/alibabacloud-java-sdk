// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class InstallPolarClawPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallPolarClawPluginResponseBody body;

    public static InstallPolarClawPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallPolarClawPluginResponse self = new InstallPolarClawPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallPolarClawPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallPolarClawPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallPolarClawPluginResponse setBody(InstallPolarClawPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallPolarClawPluginResponseBody getBody() {
        return this.body;
    }

}
