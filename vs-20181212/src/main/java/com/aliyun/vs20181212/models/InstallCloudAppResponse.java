// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class InstallCloudAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallCloudAppResponseBody body;

    public static InstallCloudAppResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAppResponse self = new InstallCloudAppResponse();
        return TeaModel.build(map, self);
    }

    public InstallCloudAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallCloudAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallCloudAppResponse setBody(InstallCloudAppResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallCloudAppResponseBody getBody() {
        return this.body;
    }

}
