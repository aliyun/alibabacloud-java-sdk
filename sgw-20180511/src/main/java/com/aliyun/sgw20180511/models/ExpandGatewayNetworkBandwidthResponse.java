// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ExpandGatewayNetworkBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExpandGatewayNetworkBandwidthResponseBody body;

    public static ExpandGatewayNetworkBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ExpandGatewayNetworkBandwidthResponse self = new ExpandGatewayNetworkBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ExpandGatewayNetworkBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExpandGatewayNetworkBandwidthResponse setBody(ExpandGatewayNetworkBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ExpandGatewayNetworkBandwidthResponseBody getBody() {
        return this.body;
    }

}
