// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UninstallCloudAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallCloudAppResponseBody body;

    public static UninstallCloudAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallCloudAppResponse self = new UninstallCloudAppResponse();
        return TeaModel.build(map, self);
    }

    public UninstallCloudAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallCloudAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallCloudAppResponse setBody(UninstallCloudAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallCloudAppResponseBody getBody() {
        return this.body;
    }

}
