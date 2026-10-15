// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UninstallAppPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallAppPluginResponseBody body;

    public static UninstallAppPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallAppPluginResponse self = new UninstallAppPluginResponse();
        return TeaModel.build(map, self);
    }

    public UninstallAppPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallAppPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallAppPluginResponse setBody(UninstallAppPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallAppPluginResponseBody getBody() {
        return this.body;
    }

}
