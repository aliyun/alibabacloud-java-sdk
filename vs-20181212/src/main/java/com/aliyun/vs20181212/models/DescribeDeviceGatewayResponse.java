// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceGatewayResponseBody body;

    public static DescribeDeviceGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceGatewayResponse self = new DescribeDeviceGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceGatewayResponse setBody(DescribeDeviceGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceGatewayResponseBody getBody() {
        return this.body;
    }

}
