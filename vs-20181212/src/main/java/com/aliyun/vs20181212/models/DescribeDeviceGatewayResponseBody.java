// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceGatewayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public Long port;

    /**
     * <strong>example:</strong>
     * <p>gb28181</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>f5578fbc-694c-461d-a2a2-eb090775cef0</p>
     */
    @NameInMap("Token")
    public String token;

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

    public DescribeDeviceGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceGatewayResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
