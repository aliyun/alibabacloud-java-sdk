// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class FetchRemoteMcpToolsRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("connection")
    public FetchRemoteMcpToolsRequestConnection connection;

    /**
     * <p>The request body parameters.</p>
     */
    @NameInMap("network")
    public FetchRemoteMcpToolsRequestNetwork network;

    public static FetchRemoteMcpToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchRemoteMcpToolsRequest self = new FetchRemoteMcpToolsRequest();
        return TeaModel.build(map, self);
    }

    public FetchRemoteMcpToolsRequest setConnection(FetchRemoteMcpToolsRequestConnection connection) {
        this.connection = connection;
        return this;
    }
    public FetchRemoteMcpToolsRequestConnection getConnection() {
        return this.connection;
    }

    public FetchRemoteMcpToolsRequest setNetwork(FetchRemoteMcpToolsRequestNetwork network) {
        this.network = network;
        return this;
    }
    public FetchRemoteMcpToolsRequestNetwork getNetwork() {
        return this.network;
    }

    public static class FetchRemoteMcpToolsRequestConnectionAuth extends TeaModel {
        /**
         * <p>The request body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;token&quot;:&quot;example-token&quot;}</p>
         */
        @NameInMap("keyInfo")
        public java.util.Map<String, String> keyInfo;

        /**
         * <p>The authentication type. Currently, only bearer is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>bearer</p>
         */
        @NameInMap("type")
        public String type;

        public static FetchRemoteMcpToolsRequestConnectionAuth build(java.util.Map<String, ?> map) throws Exception {
            FetchRemoteMcpToolsRequestConnectionAuth self = new FetchRemoteMcpToolsRequestConnectionAuth();
            return TeaModel.build(map, self);
        }

        public FetchRemoteMcpToolsRequestConnectionAuth setKeyInfo(java.util.Map<String, String> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.Map<String, String> getKeyInfo() {
            return this.keyInfo;
        }

        public FetchRemoteMcpToolsRequestConnectionAuth setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class FetchRemoteMcpToolsRequestConnection extends TeaModel {
        /**
         * <p>The request body parameters.</p>
         */
        @NameInMap("auth")
        public FetchRemoteMcpToolsRequestConnectionAuth auth;

        /**
         * <p>The access endpoint of the MCP service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The MCP service platform type. Valid values: AIGateway and Custom.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>The timeout period for requests to the MCP service. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("timeout")
        public Long timeout;

        /**
         * <p>The transport protocol of the MCP service. Valid values: http and sse.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("transport")
        public String transport;

        public static FetchRemoteMcpToolsRequestConnection build(java.util.Map<String, ?> map) throws Exception {
            FetchRemoteMcpToolsRequestConnection self = new FetchRemoteMcpToolsRequestConnection();
            return TeaModel.build(map, self);
        }

        public FetchRemoteMcpToolsRequestConnection setAuth(FetchRemoteMcpToolsRequestConnectionAuth auth) {
            this.auth = auth;
            return this;
        }
        public FetchRemoteMcpToolsRequestConnectionAuth getAuth() {
            return this.auth;
        }

        public FetchRemoteMcpToolsRequestConnection setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public FetchRemoteMcpToolsRequestConnection setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public FetchRemoteMcpToolsRequestConnection setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public FetchRemoteMcpToolsRequestConnection setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public FetchRemoteMcpToolsRequestConnection setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

    }

    public static class FetchRemoteMcpToolsRequestNetwork extends TeaModel {
        /**
         * <p>The IP address used to access the MCP service over the VPC network.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.12</p>
         */
        @NameInMap("accessIp")
        public String accessIp;

        /**
         * <p>The port used to access the MCP service over the VPC network. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("accessPort")
        public Long accessPort;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The MCP Server instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-xxx</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The network access mode of the MCP service. Valid values: public and vpc.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The region where the VPC network resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("vswId")
        public String vswId;

        public static FetchRemoteMcpToolsRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            FetchRemoteMcpToolsRequestNetwork self = new FetchRemoteMcpToolsRequestNetwork();
            return TeaModel.build(map, self);
        }

        public FetchRemoteMcpToolsRequestNetwork setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public FetchRemoteMcpToolsRequestNetwork setAccessPort(Long accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public Long getAccessPort() {
            return this.accessPort;
        }

        public FetchRemoteMcpToolsRequestNetwork setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public FetchRemoteMcpToolsRequestNetwork setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public FetchRemoteMcpToolsRequestNetwork setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public FetchRemoteMcpToolsRequestNetwork setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public FetchRemoteMcpToolsRequestNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public FetchRemoteMcpToolsRequestNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public FetchRemoteMcpToolsRequestNetwork setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

    }

}
