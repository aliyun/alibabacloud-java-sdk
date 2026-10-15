// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class InstallAppPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallAppPluginResponseBody body;

    public static InstallAppPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallAppPluginResponse self = new InstallAppPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallAppPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallAppPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallAppPluginResponse setBody(InstallAppPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallAppPluginResponseBody getBody() {
        return this.body;
    }

}
