// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradePxfsVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradePxfsVersionResponseBody body;

    public static UpgradePxfsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradePxfsVersionResponse self = new UpgradePxfsVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradePxfsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradePxfsVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradePxfsVersionResponse setBody(UpgradePxfsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePxfsVersionResponseBody getBody() {
        return this.body;
    }

}
