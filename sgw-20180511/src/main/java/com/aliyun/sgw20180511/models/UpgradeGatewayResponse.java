// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UpgradeGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeGatewayResponseBody body;

    public static UpgradeGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeGatewayResponse self = new UpgradeGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeGatewayResponse setBody(UpgradeGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeGatewayResponseBody getBody() {
        return this.body;
    }

}
