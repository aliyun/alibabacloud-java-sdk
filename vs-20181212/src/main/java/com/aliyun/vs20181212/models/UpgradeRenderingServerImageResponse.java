// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingServerImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeRenderingServerImageResponseBody body;

    public static UpgradeRenderingServerImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingServerImageResponse self = new UpgradeRenderingServerImageResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingServerImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeRenderingServerImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeRenderingServerImageResponse setBody(UpgradeRenderingServerImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeRenderingServerImageResponseBody getBody() {
        return this.body;
    }

}
