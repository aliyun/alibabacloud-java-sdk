// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateMcpServiceRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("connection")
    public CreateMcpServiceRequestConnection connection;

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
     * <p>Specifies whether to enable the MCP service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The service name of the MCP service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log-query</p>
     */
    @NameInMap("mcpServiceName")
    public String mcpServiceName;

    /**
     * <p>The request body parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("network")
    public CreateMcpServiceRequestNetwork network;

    /**
     * <p>The list of MCP tools.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;query_logs&quot;}]</p>
     */
    @NameInMap("tools")
    public java.util.List<CreateMcpServiceRequestTools> tools;

    public static CreateMcpServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServiceRequest self = new CreateMcpServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpServiceRequest setConnection(CreateMcpServiceRequestConnection connection) {
        this.connection = connection;
        return this;
    }
    public CreateMcpServiceRequestConnection getConnection() {
        return this.connection;
    }

    public CreateMcpServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMcpServiceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateMcpServiceRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateMcpServiceRequest setMcpServiceName(String mcpServiceName) {
        this.mcpServiceName = mcpServiceName;
        return this;
    }
    public String getMcpServiceName() {
        return this.mcpServiceName;
    }

    public CreateMcpServiceRequest setNetwork(CreateMcpServiceRequestNetwork network) {
        this.network = network;
        return this;
    }
    public CreateMcpServiceRequestNetwork getNetwork() {
        return this.network;
    }

    public CreateMcpServiceRequest setTools(java.util.List<CreateMcpServiceRequestTools> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<CreateMcpServiceRequestTools> getTools() {
        return this.tools;
    }

    public static class CreateMcpServiceRequestConnectionAuth extends TeaModel {
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

        public static CreateMcpServiceRequestConnectionAuth build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServiceRequestConnectionAuth self = new CreateMcpServiceRequestConnectionAuth();
            return TeaModel.build(map, self);
        }

        public CreateMcpServiceRequestConnectionAuth setKeyInfo(java.util.Map<String, String> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.Map<String, String> getKeyInfo() {
            return this.keyInfo;
        }

        public CreateMcpServiceRequestConnectionAuth setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMcpServiceRequestConnection extends TeaModel {
        /**
         * <p>The request body parameters.</p>
         */
        @NameInMap("auth")
        public CreateMcpServiceRequestConnectionAuth auth;

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
         * <p>The platform type of the MCP service. Valid values: AIGateway and Custom.</p>
         * <p>This parameter is required.</p>
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

        public static CreateMcpServiceRequestConnection build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServiceRequestConnection self = new CreateMcpServiceRequestConnection();
            return TeaModel.build(map, self);
        }

        public CreateMcpServiceRequestConnection setAuth(CreateMcpServiceRequestConnectionAuth auth) {
            this.auth = auth;
            return this;
        }
        public CreateMcpServiceRequestConnectionAuth getAuth() {
            return this.auth;
        }

        public CreateMcpServiceRequestConnection setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateMcpServiceRequestConnection setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public CreateMcpServiceRequestConnection setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateMcpServiceRequestConnection setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public CreateMcpServiceRequestConnection setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

    }

    public static class CreateMcpServiceRequestNetwork extends TeaModel {
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
         * <p>This parameter is required.</p>
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

        public static CreateMcpServiceRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServiceRequestNetwork self = new CreateMcpServiceRequestNetwork();
            return TeaModel.build(map, self);
        }

        public CreateMcpServiceRequestNetwork setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public CreateMcpServiceRequestNetwork setAccessPort(Long accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public Long getAccessPort() {
            return this.accessPort;
        }

        public CreateMcpServiceRequestNetwork setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public CreateMcpServiceRequestNetwork setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public CreateMcpServiceRequestNetwork setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateMcpServiceRequestNetwork setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateMcpServiceRequestNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateMcpServiceRequestNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateMcpServiceRequestNetwork setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

    }

    public static class CreateMcpServiceRequestTools extends TeaModel {
        /**
         * <p>The request body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("annotations")
        public java.util.Map<String, ?> annotations;

        /**
         * <p>Specifies whether user confirmation is required before calling the MCP tool.</p>
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
         * <p>Specifies whether to enable the MCP tool.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The request body parameters.</p>
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
         * <p>The request body parameters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;query&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;query&quot;]}</p>
         */
        @NameInMap("inputSchema")
        public java.util.Map<String, ?> inputSchema;

        /**
         * <p>The name of the MCP tool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>query_logs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The request body parameters.</p>
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

        public static CreateMcpServiceRequestTools build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServiceRequestTools self = new CreateMcpServiceRequestTools();
            return TeaModel.build(map, self);
        }

        public CreateMcpServiceRequestTools setAnnotations(java.util.Map<String, ?> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, ?> getAnnotations() {
            return this.annotations;
        }

        public CreateMcpServiceRequestTools setConfirm(Boolean confirm) {
            this.confirm = confirm;
            return this;
        }
        public Boolean getConfirm() {
            return this.confirm;
        }

        public CreateMcpServiceRequestTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMcpServiceRequestTools setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateMcpServiceRequestTools setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateMcpServiceRequestTools setExecution(java.util.Map<String, ?> execution) {
            this.execution = execution;
            return this;
        }
        public java.util.Map<String, ?> getExecution() {
            return this.execution;
        }

        public CreateMcpServiceRequestTools setIcons(java.util.List<java.util.Map<String, ?>> icons) {
            this.icons = icons;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getIcons() {
            return this.icons;
        }

        public CreateMcpServiceRequestTools setInputSchema(java.util.Map<String, ?> inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public java.util.Map<String, ?> getInputSchema() {
            return this.inputSchema;
        }

        public CreateMcpServiceRequestTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpServiceRequestTools setOutputSchema(java.util.Map<String, ?> outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        public java.util.Map<String, ?> getOutputSchema() {
            return this.outputSchema;
        }

        public CreateMcpServiceRequestTools setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
