// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ListMcpServicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("mcpServices")
    public ListMcpServicesResponseBodyMcpServices mcpServices;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListMcpServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpServicesResponseBody self = new ListMcpServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpServicesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpServicesResponseBody setMcpServices(ListMcpServicesResponseBodyMcpServices mcpServices) {
        this.mcpServices = mcpServices;
        return this;
    }
    public ListMcpServicesResponseBodyMcpServices getMcpServices() {
        return this.mcpServices;
    }

    public ListMcpServicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcpServicesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth extends TeaModel {
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

        public static ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth self = new ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth();
            return TeaModel.build(map, self);
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth setKeyInfo(java.util.Map<String, String> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.Map<String, String> getKeyInfo() {
            return this.keyInfo;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection extends TeaModel {
        @NameInMap("auth")
        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth auth;

        /**
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
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("transport")
        public String transport;

        public static ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection self = new ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection();
            return TeaModel.build(map, self);
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection setAuth(ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth auth) {
            this.auth = auth;
            return this;
        }
        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnectionAuth getAuth() {
            return this.auth;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

    }

    public static class ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork extends TeaModel {
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

        public static ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork self = new ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork();
            return TeaModel.build(map, self);
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setAccessPort(Long accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public Long getAccessPort() {
            return this.accessPort;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

    }

    public static class ListMcpServicesResponseBodyMcpServicesMcpServiceListTools extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("annotations")
        public java.util.Map<String, ?> annotations;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("confirm")
        public Boolean confirm;

        @NameInMap("description")
        public String description;

        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("execution")
        public java.util.Map<String, ?> execution;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("icons")
        public java.util.List<java.util.Map<String, ?>> icons;

        /**
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;query&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;query&quot;]}</p>
         */
        @NameInMap("inputSchema")
        public java.util.Map<String, ?> inputSchema;

        /**
         * <strong>example:</strong>
         * <p>query_logs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("outputSchema")
        public java.util.Map<String, ?> outputSchema;

        @NameInMap("title")
        public String title;

        public static ListMcpServicesResponseBodyMcpServicesMcpServiceListTools build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServicesResponseBodyMcpServicesMcpServiceListTools self = new ListMcpServicesResponseBodyMcpServicesMcpServiceListTools();
            return TeaModel.build(map, self);
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setAnnotations(java.util.Map<String, ?> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, ?> getAnnotations() {
            return this.annotations;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setConfirm(Boolean confirm) {
            this.confirm = confirm;
            return this;
        }
        public Boolean getConfirm() {
            return this.confirm;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setExecution(java.util.Map<String, ?> execution) {
            this.execution = execution;
            return this;
        }
        public java.util.Map<String, ?> getExecution() {
            return this.execution;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setIcons(java.util.List<java.util.Map<String, ?>> icons) {
            this.icons = icons;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getIcons() {
            return this.icons;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setInputSchema(java.util.Map<String, ?> inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public java.util.Map<String, ?> getInputSchema() {
            return this.inputSchema;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setOutputSchema(java.util.Map<String, ?> outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        public java.util.Map<String, ?> getOutputSchema() {
            return this.outputSchema;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceListTools setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListMcpServicesResponseBodyMcpServicesMcpServiceList extends TeaModel {
        @NameInMap("connection")
        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection connection;

        @NameInMap("description")
        public String description;

        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>log-query</p>
         */
        @NameInMap("mcpServiceName")
        public String mcpServiceName;

        @NameInMap("network")
        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork network;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;query_logs&quot;}]</p>
         */
        @NameInMap("tools")
        public java.util.List<ListMcpServicesResponseBodyMcpServicesMcpServiceListTools> tools;

        public static ListMcpServicesResponseBodyMcpServicesMcpServiceList build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServicesResponseBodyMcpServicesMcpServiceList self = new ListMcpServicesResponseBodyMcpServicesMcpServiceList();
            return TeaModel.build(map, self);
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceList setConnection(ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection connection) {
            this.connection = connection;
            return this;
        }
        public ListMcpServicesResponseBodyMcpServicesMcpServiceListConnection getConnection() {
            return this.connection;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceList setMcpServiceName(String mcpServiceName) {
            this.mcpServiceName = mcpServiceName;
            return this;
        }
        public String getMcpServiceName() {
            return this.mcpServiceName;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceList setNetwork(ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork network) {
            this.network = network;
            return this;
        }
        public ListMcpServicesResponseBodyMcpServicesMcpServiceListNetwork getNetwork() {
            return this.network;
        }

        public ListMcpServicesResponseBodyMcpServicesMcpServiceList setTools(java.util.List<ListMcpServicesResponseBodyMcpServicesMcpServiceListTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<ListMcpServicesResponseBodyMcpServicesMcpServiceListTools> getTools() {
            return this.tools;
        }

    }

    public static class ListMcpServicesResponseBodyMcpServices extends TeaModel {
        @NameInMap("mcpServiceList")
        public java.util.List<ListMcpServicesResponseBodyMcpServicesMcpServiceList> mcpServiceList;

        public static ListMcpServicesResponseBodyMcpServices build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServicesResponseBodyMcpServices self = new ListMcpServicesResponseBodyMcpServices();
            return TeaModel.build(map, self);
        }

        public ListMcpServicesResponseBodyMcpServices setMcpServiceList(java.util.List<ListMcpServicesResponseBodyMcpServicesMcpServiceList> mcpServiceList) {
            this.mcpServiceList = mcpServiceList;
            return this;
        }
        public java.util.List<ListMcpServicesResponseBodyMcpServicesMcpServiceList> getMcpServiceList() {
            return this.mcpServiceList;
        }

    }

}
