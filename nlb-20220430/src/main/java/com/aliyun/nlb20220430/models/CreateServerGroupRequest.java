// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateServerGroupRequest extends TeaModel {
    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><p><strong>ipv4</strong> (default): IPv4.</p>
     * </li>
     * <li><p><strong>DualStack</strong>: dual-stack.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>Specifies whether to enable all-port forwarding. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables all-port forwarding.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables all-port forwarding.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AnyPortEnabled")
    public Boolean anyPortEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
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
     * <li><p><strong>true</strong>: enables connection draining.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables connection draining.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConnectionDrainEnabled")
    public Boolean connectionDrainEnabled;

    /**
     * <p>The timeout period for connection draining. Unit: seconds.
     * Valid values: <strong>0</strong> to <strong>900</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without creating the server group. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The health check configuration.</p>
     */
    @NameInMap("HealthCheckConfig")
    public CreateServerGroupRequestHealthCheckConfig healthCheckConfig;

    /**
     * <p>The traffic scheduling policy in dual-stack mode. Valid values:</p>
     * <ul>
     * <li>NonAffinity (default): non-affinity mode. Traffic is forwarded to healthy backend servers based on the scheduling algorithm regardless of the IP protocol version of the source.</li>
     * <li>Affinity: affinity mode. Traffic is forwarded based on the IP protocol version of the request source. IPv4 requests are forwarded only to IPv4 backend servers, and IPv6 requests are forwarded only to IPv6 backend servers.<blockquote>
     * <p>This parameter takes effect only when <strong>AddressIPVersion</strong> is set to <strong>DualStack</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Affinity</p>
     */
    @NameInMap("IpVersionAffinityMode")
    public String ipVersionAffinityMode;

    /**
     * <p>Specifies whether to enable client IP address preservation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables client IP address preservation.</li>
     * <li><strong>false</strong>: disables client IP address preservation.</li>
     * </ul>
     * <blockquote>
     * <p>If <strong>Protocol</strong> is set to <strong>TCP</strong> and this parameter is set to <strong>true</strong>, the server group cannot be associated with <strong>TCPSSL</strong> listeners.</p>
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
     * <p>The communication protocol used to forward traffic to backend servers. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong> (default)</li>
     * <li><strong>UDP</strong></li>
     * <li><strong>TCP_UDP</strong><blockquote>
     * <ul>
     * <li>If this parameter is set to <strong>UDP</strong>, the server group can be associated only with <strong>UDP</strong> listeners.</li>
     * <li>If this parameter is set to <strong>TCP</strong> and <strong>PreserveClientIpEnabled</strong> is set to <strong>true</strong>, the server group can be associated only with <strong>TCP</strong> listeners.</li>
     * <li>If this parameter is set to <strong>TCP</strong> and <strong>PreserveClientIpEnabled</strong> is set to <strong>false</strong>, the server group can be associated with <strong>TCPSSL</strong> and <strong>TCP</strong> listeners.</li>
     * <li>If this parameter is set to <strong>TCP_UDP</strong>, the server group can be associated with <strong>TCP</strong> and <strong>UDP</strong> listeners.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID of the Network Load Balancer (NLB) instance. </p>
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
     * <li><p><strong>Wrr</strong> (default): weighted round-robin. Backend servers with higher weights are more likely to be polled.</p>
     * </li>
     * <li><p><strong>Wlc</strong>: weighted least connections. In addition to the weight of each backend server, the actual load (number of connections) of the backend server is also considered. If the weights are the same, backend servers with fewer current connections are more likely to be polled.</p>
     * </li>
     * <li><p><strong>rr</strong>: round-robin. External requests are distributed to backend servers in sequence.</p>
     * </li>
     * <li><p><strong>sch</strong>: source IP hash. Requests from the same source IP address are scheduled to the same backend server.</p>
     * </li>
     * <li><p><strong>tch</strong>: 4-tuple hash. Consistent hashing based on the 4-tuple (source IP address, destination IP address, source port, and destination port). Requests from the same flow are scheduled to the same backend server.</p>
     * </li>
     * <li><p><strong>qch</strong>: QUIC ID hash. Requests with the same QUIC ID are scheduled to the same backend server.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>QUIC ID hash is supported only when the backend protocol is UDP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The name of the server group.</p>
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NLB_ServerGroup</p>
     */
    @NameInMap("ServerGroupName")
    public String serverGroupName;

    /**
     * <p>The server group type. Valid values:</p>
     * <ul>
     * <li><p><strong>Instance</strong> (default): server type. This type of server group supports adding <strong>Ecs</strong>, <strong>Eni</strong>, and <strong>Eci</strong> instances.</p>
     * </li>
     * <li><p><strong>Ip</strong>: IP address type. This type of server group supports directly adding backend servers by IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ServerGroupType")
    public String serverGroupType;

    /**
     * <p>The list of tags.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServerGroupRequestTag> tag;

    /**
     * <p>The ID of the VPC where the server group is deployed.</p>
     * <blockquote>
     * <p>If <strong>ServerGroupType</strong> is set to <strong>Instance</strong>, only servers in this VPC can be added to the server group.</p>
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
         * <p>The port of the backend server used for health checks.</p>
         * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>Default value: <strong>0</strong>. This value indicates that the port of the backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The maximum timeout period for a health check response. Unit: seconds.
         * Valid values: <strong>1</strong> to <strong>300</strong>.
         * Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The domain name used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>$SERVER_IP</strong>: the internal IP address of the backend server.</p>
         * </li>
         * <li><p><strong>domain</strong>: a specified domain name. The domain name must be 1 to 80 characters in length, and can contain only letters, digits, hyphens (-), and periods (.).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
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
         * <li><p><strong>true</strong> (default): enables health checks.</p>
         * </li>
         * <li><p><strong>false</strong>: disables health checks.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The query string in the request for UDP listener health checks. The string can contain only letters and digits, and can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthCheckExp")
        public String healthCheckExp;

        /**
         * <p>The HTTP status codes for healthy responses. Separate multiple status codes with commas (,).
         * Valid values: <strong>http_2xx</strong> (default), <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
         * </blockquote>
         */
        @NameInMap("HealthCheckHttpCode")
        public java.util.List<String> healthCheckHttpCode;

        /**
         * <p>The HTTP protocol version for health checks. Valid values: <strong>HTTP1.0</strong> (default) and <strong>HTTP1.1</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.0</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds. Default value: <strong>5</strong>.</p>
         * <ul>
         * <li>If <strong>HealthCheckType</strong> is set to <strong>TCP</strong> or <strong>HTTP</strong>, valid values are <strong>1</strong> to <strong>50</strong>.</li>
         * <li>If <strong>HealthCheckType</strong> is set to <strong>UDP</strong>, valid values are <strong>1</strong> to <strong>300</strong>. You must set the interval to be greater than or equal to the response timeout period to ensure that UDP probe responses are not misjudged as unresponsive due to a timeout.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The query string in the request for UDP listener health checks. The string can contain only letters and digits, and can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("HealthCheckReq")
        public String healthCheckReq;

        /**
         * <p>The protocol used for health checks. Valid values:</p>
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
         * <p>The health check path.</p>
         * <p>The path must be 1 to 80 characters in length, and can contain only letters, digits, and the following special characters: <code>-/.%?#&amp;</code>. It must start with a forward slash (/).</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        /**
         * <p>The number of consecutive successful health checks that must occur before the health check status of a backend server is changed from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <p>Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The HTTP method used for health checks. Valid values: <strong>GET</strong> (default) and <strong>HEAD</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("HttpCheckMethod")
        public String httpCheckMethod;

        /**
         * <p>The number of consecutive failed health checks that must occur before the health check status of a backend server is changed from <strong>success</strong> to <strong>fail</strong>.</p>
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
         * <p>The tag key. The tag key can be up to 64 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. It can contain letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), hyphens (-), and at signs (@).</p>
         * <p>You can add up to 20 tags in a single call.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. It can contain letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), hyphens (-), and at signs (@).</p>
         * <p>You can add up to 20 tags in a single call.</p>
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
