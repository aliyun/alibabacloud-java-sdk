// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableNatGatewayEcsMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableNatGatewayEcsMetricResponse setBody(EnableNatGatewayEcsMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableNatGatewayEcsMetricResponseBody getBody() {
        return this.body;
    }

}
