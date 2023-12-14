// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class EnableGatewayIpv6Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableGatewayIpv6ResponseBody body;

    public static EnableGatewayIpv6Response build(java.util.Map<String, ?> map) throws Exception {
        EnableGatewayIpv6Response self = new EnableGatewayIpv6Response();
        return TeaModel.build(map, self);
    }

    public EnableGatewayIpv6Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableGatewayIpv6Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableGatewayIpv6Response setBody(EnableGatewayIpv6ResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableGatewayIpv6ResponseBody getBody() {
        return this.body;
    }

}
