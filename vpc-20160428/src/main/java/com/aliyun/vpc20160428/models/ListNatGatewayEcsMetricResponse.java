// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatGatewayEcsMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNatGatewayEcsMetricResponseBody body;

    public static ListNatGatewayEcsMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNatGatewayEcsMetricResponse self = new ListNatGatewayEcsMetricResponse();
        return TeaModel.build(map, self);
    }

    public ListNatGatewayEcsMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNatGatewayEcsMetricResponse setBody(ListNatGatewayEcsMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNatGatewayEcsMetricResponseBody getBody() {
        return this.body;
    }

}
