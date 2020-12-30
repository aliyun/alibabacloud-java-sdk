// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableNatGatewayEcsMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableNatGatewayEcsMetricResponse setBody(DisableNatGatewayEcsMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableNatGatewayEcsMetricResponseBody getBody() {
        return this.body;
    }

}
