// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableNatGatewayEcsMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableNatGatewayEcsMetricResponseBody body;

    public static EnableNatGatewayEcsMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableNatGatewayEcsMetricResponse self = new EnableNatGatewayEcsMetricResponse();
        return TeaModel.build(map, self);
    }

    public EnableNatGatewayEcsMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableNatGatewayEcsMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableNatGatewayEcsMetricResponse setBody(EnableNatGatewayEcsMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableNatGatewayEcsMetricResponseBody getBody() {
        return this.body;
    }

}
