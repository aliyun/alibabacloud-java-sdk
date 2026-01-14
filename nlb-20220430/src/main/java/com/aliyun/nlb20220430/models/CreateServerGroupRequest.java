// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateServerGroupRequest extends TeaModel {
    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>ipv4</strong> (default): IPv4</li>
     * <li><strong>DualStack</strong>: dual-stack</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>Specifies whether to enable multi-port forwarding. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AnyPortEnabled")
    public Boolean anyPortEnabled;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable connection draining. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConnectionDrainEnabled")
    public Boolean connectionDrainEnabled;

    /**
     * <p>Specifies a timeout period for connection draining. Unit: seconds. Valid values: <strong>0</strong> to <strong>900</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The configurations of health checks.</p>
     */
    @NameInMap("HealthCheckConfig")
    public CreateServerGroupRequestHealthCheckConfig healthCheckConfig;

    @NameInMap("IpVersionAffinityMode")
    public String ipVersionAffinityMode;

    /**
     * <p>Specifies whether to enable client IP preservation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to <strong>true</strong> and <strong>Protocol</strong> to <strong>TCP</strong>, the server group cannot be associated with <strong>TCPSSL</strong> listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("PreserveClientIpEnabled")
    public Boolean preserveClientIpEnabled;

    /**
     * <p>The protocol between the NLB instance and backend servers. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong> (default)</li>
     * <li><strong>UDP</strong></li>
     * <li><strong>TCP_UDP</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set this parameter to <strong>UDP</strong>, you can associate the server group only with <strong>UDP</strong> listeners.</li>
     * <li>If you set this parameter to <strong>TCP</strong> and <strong>PreserveClientIpEnabled</strong> to <strong>true</strong>, you can associate the server group only with <strong>TCP</strong> listeners.</li>
     * <li>If you set this parameter to <strong>TCP</strong> and <strong>PreserveClientIpEnabled</strong> to <strong>false</strong>, you can associate the server group with <strong>TCPSSL</strong> and <strong>TCP</strong> listeners.</li>
     * <li>If you set this parameter to <strong>TCP_UDP</strong>, you can associate the server group with <strong>TCP</strong> and <strong>UDP</strong> listeners.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the server group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><strong>Wrr</strong> (default): weighted round-robin. Backend servers with higher weights receive more requests.</li>
     * <li><strong>Wlc</strong>: weighted least connections. Requests are distributed based on the weights and the number of connections to backend servers. If multiple backend servers have the same weight, requests are forwarded to the backend server with the least connections.</li>
     * <li><strong>rr</strong>: Requests are forwarded to backend servers in sequence.</li>
     * <li><strong>sch</strong>: source IP hash. Requests from the same source IP address are forwarded to the same backend server.</li>
     * <li><strong>tch</strong>: consistent hashing based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same four factors are forwarded to the same backend server.</li>
     * <li><strong>qch</strong>: QUIC ID hash. Requests that contain the same QUIC ID are forwarded to the same backend server.</li>
     * </ul>
     * <blockquote>
     * <p> QUIC ID hash is supported only when the backend protocol is set to UDP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The server group name.</p>
     * <p>The name must be 2 to 128 characters in length, can contain digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NLB_ServerGroup</p>
     */
    @NameInMap("ServerGroupName")
    public String serverGroupName;

    /**
     * <p>The type of the server group. Valid values:</p>
     * <ul>
     * <li><strong>Instance</strong> (default): allows you to specify servers of the <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> type.</li>
     * <li><strong>Ip</strong>: allows you to specify IP addresses.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ServerGroupType")
    public String serverGroupType;

    /**
     * <p>The tags.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServerGroupRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) where the server group is deployed.</p>
     * <blockquote>
     * <p> If <strong>ServerGroupType</strong> is set to <strong>Instance</strong>, only servers in the specified VPC can be added to the server group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72zv****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerGroupRequest self = new CreateServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerGroupRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public CreateServerGroupRequest setAnyPortEnabled(Boolean anyPortEnabled) {
        this.anyPortEnabled = anyPortEnabled;
        return this;
    }
    public Boolean getAnyPortEnabled() {
        return this.anyPortEnabled;
    }

    public CreateServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServerGroupRequest setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
        this.connectionDrainEnabled = connectionDrainEnabled;
        return this;
    }
    public Boolean getConnectionDrainEnabled() {
        return this.connectionDrainEnabled;
    }

    public CreateServerGroupRequest setConnectionDrainTimeout(Integer connectionDrainTimeout) {
        this.connectionDrainTimeout = connectionDrainTimeout;
        return this;
    }
    public Integer getConnectionDrainTimeout() {
        return this.connectionDrainTimeout;
    }

    public CreateServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateServerGroupRequest setHealthCheckConfig(CreateServerGroupRequestHealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public CreateServerGroupRequestHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public CreateServerGroupRequest setIpVersionAffinityMode(String ipVersionAffinityMode) {
        this.ipVersionAffinityMode = ipVersionAffinityMode;
        return this;
    }
    public String getIpVersionAffinityMode() {
        return this.ipVersionAffinityMode;
    }

    public CreateServerGroupRequest setPreserveClientIpEnabled(Boolean preserveClientIpEnabled) {
        this.preserveClientIpEnabled = preserveClientIpEnabled;
        return this;
    }
    public Boolean getPreserveClientIpEnabled() {
        return this.preserveClientIpEnabled;
    }

    public CreateServerGroupRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateServerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServerGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServerGroupRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateServerGroupRequest setServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
        return this;
    }
    public String getServerGroupName() {
        return this.serverGroupName;
    }

    public CreateServerGroupRequest setServerGroupType(String serverGroupType) {
        this.serverGroupType = serverGroupType;
        return this;
    }
    public String getServerGroupType() {
        return this.serverGroupType;
    }

    public CreateServerGroupRequest setTag(java.util.List<CreateServerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateServerGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateServerGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateServerGroupRequestHealthCheckConfig extends TeaModel {
        /**
         * <p>The port that you want to use for health checks on backend servers.</p>
         * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>Default value: <strong>0</strong>. If you set this parameter to 0, the port that the backend server uses to provide services is also used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The timeout period for a health check response. Unit: seconds. Valid values: <strong>1</strong> to <strong>300</strong>. Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The domain name that is used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>$SERVER_IP</strong>: the internal IP address of a backend server.</li>
         * <li><strong>domain</strong>: a domain name. The domain name must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), and periods (.).</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$SERVER_IP</p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>Specifies whether to enable health checks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The response string that backend servers return to UDP listeners for health checks. The string must be 1 to 512 characters in length and can contain only letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthCheckExp")
        public String healthCheckExp;

        /**
         * <p>The HTTP status codes to return for health checks. Separate multiple HTTP status codes with commas (,). Valid values: <strong>http_2xx</strong> (default), <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
         * </blockquote>
         */
        @NameInMap("HealthCheckHttpCode")
        public java.util.List<String> healthCheckHttpCode;

        /**
         * <p>The HTTP version used for health checks. Valid values: <strong>HTTP1.0</strong> (default) and <strong>HTTP1.1</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.0</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds. Default value: <strong>5</strong>.</p>
         * <ul>
         * <li>If you set <strong>HealthCheckType</strong> to <strong>TCP</strong> or <strong>HTTP</strong>, valid values are <strong>1</strong> to <strong>50</strong>.</li>
         * <li>If you set <strong>HealthCheckType</strong> to <strong>UDP</strong>, valid values are <strong>1</strong> to <strong>300</strong>. Set the health check interval equal to or larger than the response timeout period to ensure that UDP response timeouts are not determined as no responses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The request string that UDP listeners send to backend servers for health checks. The string must be 1 to 512 characters in length and can contain only letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("HealthCheckReq")
        public String healthCheckReq;

        /**
         * <p>The protocol that you want to use for health checks. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The URL path to which health check probes are sent.</p>
         * <p>The URL path must be 1 to 80 characters in length, and can contain letters, digits, and the following special characters: <code>- / . % ? # &amp; </code>. It must start with a forward slash (/).</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <p>Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The HTTP method that is used for health checks. Valid values: <strong>GET</strong> (default) and <strong>HEAD</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>HealthCheckType</strong> to <strong>HTTP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("HttpCheckMethod")
        public String httpCheckMethod;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <p>Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static CreateServerGroupRequestHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServerGroupRequestHealthCheckConfig self = new CreateServerGroupRequestHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckExp(String healthCheckExp) {
            this.healthCheckExp = healthCheckExp;
            return this;
        }
        public String getHealthCheckExp() {
            return this.healthCheckExp;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public java.util.List<String> getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckReq(String healthCheckReq) {
            this.healthCheckReq = healthCheckReq;
            return this;
        }
        public String getHealthCheckReq() {
            return this.healthCheckReq;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public CreateServerGroupRequestHealthCheckConfig setHttpCheckMethod(String httpCheckMethod) {
            this.httpCheckMethod = httpCheckMethod;
            return this;
        }
        public String getHttpCheckMethod() {
            return this.httpCheckMethod;
        }

        public CreateServerGroupRequestHealthCheckConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class CreateServerGroupRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. The tag key can be up to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag key can contain letters, digits, and the following special characters: _ . : / = + - @</p>
         * <p>You can specify up to 20 tags in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be up to 128 characters in length, cannot start with <code>acs:</code> or <code>aliyun</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag value can contain letters, digits, and the following special characters: _ . : / = + - @</p>
         * <p>You can specify up to 20 tags in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateServerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateServerGroupRequestTag self = new CreateServerGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateServerGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServerGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
