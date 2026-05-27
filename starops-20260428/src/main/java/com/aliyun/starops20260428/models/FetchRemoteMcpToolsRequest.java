// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class FetchRemoteMcpToolsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("connection")
    public FetchRemoteMcpToolsRequestConnection connection;

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
         * <strong>example:</strong>
         * <p>{&quot;token&quot;:&quot;example-token&quot;}</p>
         */
        @NameInMap("keyInfo")
        public java.util.Map<String, String> keyInfo;

        /**
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
        @NameInMap("auth")
        public FetchRemoteMcpToolsRequestConnectionAuth auth;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("timeout")
        public Long timeout;

        /**
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
         * <strong>example:</strong>
         * <p>10.0.0.12</p>
         */
        @NameInMap("accessIp")
        public String accessIp;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("accessPort")
        public Long accessPort;

        /**
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>mcp-xxx</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>sg-xxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
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
