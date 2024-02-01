// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableNatGatewayEcsMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableNatGatewayEcsMetricResponseBody body;

    public static DisableNatGatewayEcsMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableNatGatewayEcsMetricResponse self = new DisableNatGatewayEcsMetricResponse();
        return TeaModel.build(map, self);
    }

    public DisableNatGatewayEcsMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableNatGatewayEcsMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableNatGatewayEcsMetricResponse setBody(DisableNatGatewayEcsMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableNatGatewayEcsMetricResponseBody getBody() {
        return this.body;
    }

}
