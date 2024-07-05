// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDeviceGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeviceGatewayResponse setBody(DescribeDeviceGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceGatewayResponseBody getBody() {
        return this.body;
    }

}
