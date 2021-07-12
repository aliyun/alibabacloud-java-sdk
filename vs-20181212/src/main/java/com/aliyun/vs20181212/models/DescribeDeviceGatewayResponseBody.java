// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceGatewayResponseBody extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("Token")
    public String token;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Port")
    public Long port;

    @NameInMap("Protocol")
    public String protocol;

    public static DescribeDeviceGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceGatewayResponseBody self = new DescribeDeviceGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceGatewayResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeDeviceGatewayResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DescribeDeviceGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceGatewayResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DescribeDeviceGatewayResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
