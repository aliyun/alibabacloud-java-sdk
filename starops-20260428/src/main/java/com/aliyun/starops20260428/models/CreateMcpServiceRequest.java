// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateMcpServiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("connection")
    public CreateMcpServiceRequestConnection connection;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("mcpServiceName")
    public String mcpServiceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("network")
    public CreateMcpServiceRequestNetwork network;

    /**
     * <p>This parameter is required.</p>
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
         * <p>key</p>
         */
        @NameInMap("keyInfo")
        public java.util.Map<String, String> keyInfo;

        /**
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
        @NameInMap("auth")
        public CreateMcpServiceRequestConnectionAuth auth;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://10.0.1.23:8080/mcp">http://10.0.1.23:8080/mcp</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
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
         * <strong>example:</strong>
         * <p>100.2.243.1</p>
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
         * <p>mcp-xxxx</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>sg-xxxx</p>
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
         * <p>vsw-xxxx</p>
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
        @NameInMap("annotations")
        public java.util.Map<String, ?> annotations;

        @NameInMap("confirm")
        public Boolean confirm;

        /**
         * <strong>example:</strong>
         * <p>hahahhahaha</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ahahah</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("execution")
        public java.util.Map<String, ?> execution;

        @NameInMap("icons")
        public java.util.List<java.util.Map<String, ?>> icons;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("inputSchema")
        public java.util.Map<String, ?> inputSchema;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agentloop-1654218979e79fb55dbddac2</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("outputSchema")
        public java.util.Map<String, ?> outputSchema;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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
