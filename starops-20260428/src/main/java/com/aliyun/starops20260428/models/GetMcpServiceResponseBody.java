// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetMcpServiceResponseBody extends TeaModel {
    /**
     * <p>The MCP service details.</p>
     */
    @NameInMap("mcpService")
    public GetMcpServiceResponseBodyMcpService mcpService;

    /**
     * <p>The region of the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMcpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpServiceResponseBody self = new GetMcpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpServiceResponseBody setMcpService(GetMcpServiceResponseBodyMcpService mcpService) {
        this.mcpService = mcpService;
        return this;
    }
    public GetMcpServiceResponseBodyMcpService getMcpService() {
        return this.mcpService;
    }

    public GetMcpServiceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetMcpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMcpServiceResponseBodyMcpServiceConnectionAuth extends TeaModel {
        /**
         * <p>The key-value information required for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;token&quot;:&quot;example-token&quot;}</p>
         */
        @NameInMap("keyInfo")
        public java.util.Map<String, String> keyInfo;

        /**
         * <p>The authentication type. Currently, bearer is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>bearer</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMcpServiceResponseBodyMcpServiceConnectionAuth build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServiceResponseBodyMcpServiceConnectionAuth self = new GetMcpServiceResponseBodyMcpServiceConnectionAuth();
            return TeaModel.build(map, self);
        }

        public GetMcpServiceResponseBodyMcpServiceConnectionAuth setKeyInfo(java.util.Map<String, String> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.Map<String, String> getKeyInfo() {
            return this.keyInfo;
        }

        public GetMcpServiceResponseBodyMcpServiceConnectionAuth setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMcpServiceResponseBodyMcpServiceConnection extends TeaModel {
        /**
         * <p>The authentication configuration of the MCP service.</p>
         */
        @NameInMap("auth")
        public GetMcpServiceResponseBodyMcpServiceConnectionAuth auth;

        /**
         * <p>The access endpoint of the MCP service.</p>
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
         * <p>The MCP service transport protocol. Valid values: http and sse.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("transport")
        public String transport;

        public static GetMcpServiceResponseBodyMcpServiceConnection build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServiceResponseBodyMcpServiceConnection self = new GetMcpServiceResponseBodyMcpServiceConnection();
            return TeaModel.build(map, self);
        }

        public GetMcpServiceResponseBodyMcpServiceConnection setAuth(GetMcpServiceResponseBodyMcpServiceConnectionAuth auth) {
            this.auth = auth;
            return this;
        }
        public GetMcpServiceResponseBodyMcpServiceConnectionAuth getAuth() {
            return this.auth;
        }

        public GetMcpServiceResponseBodyMcpServiceConnection setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetMcpServiceResponseBodyMcpServiceConnection setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public GetMcpServiceResponseBodyMcpServiceConnection setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetMcpServiceResponseBodyMcpServiceConnection setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public GetMcpServiceResponseBodyMcpServiceConnection setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

    }

    public static class GetMcpServiceResponseBodyMcpServiceNetwork extends TeaModel {
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
         * <p>The virtual private cloud (VPC) ID.</p>
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

        public static GetMcpServiceResponseBodyMcpServiceNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServiceResponseBodyMcpServiceNetwork self = new GetMcpServiceResponseBodyMcpServiceNetwork();
            return TeaModel.build(map, self);
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setAccessPort(Long accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public Long getAccessPort() {
            return this.accessPort;
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetMcpServiceResponseBodyMcpServiceNetwork setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

    }

    public static class GetMcpServiceResponseBodyMcpServiceTools extends TeaModel {
        /**
         * <p>The annotation information of the MCP tool.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("annotations")
        public java.util.Map<String, ?> annotations;

        /**
         * <p>Indicates whether user confirmation is required before the MCP tool is called.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("confirm")
        public Boolean confirm;

        /**
         * <p>The description of the MCP tool.</p>
         * 
         * <strong>example:</strong>
         * <p>查询指定日志库中的日志。</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the MCP tool.</p>
         * 
         * <strong>example:</strong>
         * <p>日志查询工具</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>Indicates whether the MCP tool is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The execution configuration of the MCP tool.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("execution")
        public java.util.Map<String, ?> execution;

        /**
         * <p>The list of MCP tool icons.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("icons")
        public java.util.List<java.util.Map<String, ?>> icons;

        /**
         * <p>The JSON Schema of the MCP tool input parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;query&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;query&quot;]}</p>
         */
        @NameInMap("inputSchema")
        public java.util.Map<String, ?> inputSchema;

        /**
         * <p>The name of the MCP tool.</p>
         * 
         * <strong>example:</strong>
         * <p>query_logs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON Schema of the MCP tool output.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("outputSchema")
        public java.util.Map<String, ?> outputSchema;

        /**
         * <p>The title of the MCP tool.</p>
         * 
         * <strong>example:</strong>
         * <p>查询日志</p>
         */
        @NameInMap("title")
        public String title;

        public static GetMcpServiceResponseBodyMcpServiceTools build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServiceResponseBodyMcpServiceTools self = new GetMcpServiceResponseBodyMcpServiceTools();
            return TeaModel.build(map, self);
        }

        public GetMcpServiceResponseBodyMcpServiceTools setAnnotations(java.util.Map<String, ?> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, ?> getAnnotations() {
            return this.annotations;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setConfirm(Boolean confirm) {
            this.confirm = confirm;
            return this;
        }
        public Boolean getConfirm() {
            return this.confirm;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setExecution(java.util.Map<String, ?> execution) {
            this.execution = execution;
            return this;
        }
        public java.util.Map<String, ?> getExecution() {
            return this.execution;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setIcons(java.util.List<java.util.Map<String, ?>> icons) {
            this.icons = icons;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getIcons() {
            return this.icons;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setInputSchema(java.util.Map<String, ?> inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public java.util.Map<String, ?> getInputSchema() {
            return this.inputSchema;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setOutputSchema(java.util.Map<String, ?> outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        public java.util.Map<String, ?> getOutputSchema() {
            return this.outputSchema;
        }

        public GetMcpServiceResponseBodyMcpServiceTools setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetMcpServiceResponseBodyMcpService extends TeaModel {
        /**
         * <p>The MCP service connection configuration.</p>
         */
        @NameInMap("connection")
        public GetMcpServiceResponseBodyMcpServiceConnection connection;

        /**
         * <p>The description of the MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>通过 MCP 调用日志查询工具。</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>日志查询</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>Indicates whether the MCP service is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The service name of the MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>log-query</p>
         */
        @NameInMap("mcpServiceName")
        public String mcpServiceName;

        /**
         * <p>The network connectivity information.</p>
         */
        @NameInMap("network")
        public GetMcpServiceResponseBodyMcpServiceNetwork network;

        /**
         * <p>The list of MCP tools.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;query_logs&quot;}]</p>
         */
        @NameInMap("tools")
        public java.util.List<GetMcpServiceResponseBodyMcpServiceTools> tools;

        public static GetMcpServiceResponseBodyMcpService build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServiceResponseBodyMcpService self = new GetMcpServiceResponseBodyMcpService();
            return TeaModel.build(map, self);
        }

        public GetMcpServiceResponseBodyMcpService setConnection(GetMcpServiceResponseBodyMcpServiceConnection connection) {
            this.connection = connection;
            return this;
        }
        public GetMcpServiceResponseBodyMcpServiceConnection getConnection() {
            return this.connection;
        }

        public GetMcpServiceResponseBodyMcpService setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpServiceResponseBodyMcpService setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetMcpServiceResponseBodyMcpService setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetMcpServiceResponseBodyMcpService setMcpServiceName(String mcpServiceName) {
            this.mcpServiceName = mcpServiceName;
            return this;
        }
        public String getMcpServiceName() {
            return this.mcpServiceName;
        }

        public GetMcpServiceResponseBodyMcpService setNetwork(GetMcpServiceResponseBodyMcpServiceNetwork network) {
            this.network = network;
            return this;
        }
        public GetMcpServiceResponseBodyMcpServiceNetwork getNetwork() {
            return this.network;
        }

        public GetMcpServiceResponseBodyMcpService setTools(java.util.List<GetMcpServiceResponseBodyMcpServiceTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<GetMcpServiceResponseBodyMcpServiceTools> getTools() {
            return this.tools;
        }

    }

}
