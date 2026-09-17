// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingInstanceImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeRenderingInstanceImageResponseBody body;

    public static UpgradeRenderingInstanceImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingInstanceImageResponse self = new UpgradeRenderingInstanceImageResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingInstanceImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeRenderingInstanceImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeRenderingInstanceImageResponse setBody(UpgradeRenderingInstanceImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeRenderingInstanceImageResponseBody getBody() {
        return this.body;
    }

}
