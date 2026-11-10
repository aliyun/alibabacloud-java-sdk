// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeRequest extends TeaModel {
    /**
     * <p>The IP version. Valid values: <strong>ipv4</strong> and <strong>dualStack</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

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
     * <li><p><strong>true</strong>: Enables connection draining.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables connection draining.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConnectionDrainEnabled")
    public Boolean connectionDrainEnabled;

    /**
     * <p>The timeout period for connection draining. Unit: seconds. Valid values: <strong>0</strong> to <strong>900</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without updating the server group. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The health check configuration.</p>
     */
    @NameInMap("HealthCheckConfig")
    public UpdateServerGroupAttributeRequestHealthCheckConfig healthCheckConfig;

    /**
     * <p>The traffic scheduling policy in dual-stack mode. Valid values:</p>
     * <ul>
     * <li><strong>NonAffinity</strong>: non-affinity mode. Requests are forwarded to healthy backend servers based on the scheduling algorithm regardless of the IP version of the source address. This is the default value.</li>
     * <li><strong>Affinity</strong>: affinity mode. Requests are forwarded to backend servers based on the IP version of the source address. IPv4 requests are forwarded only to IPv4 backend servers, and IPv6 requests are forwarded only to IPv6 backend servers.<blockquote>
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
     * <p>Specifies whether to enable client IP preservation. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables client IP preservation.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables client IP preservation.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If <strong>PreserveClientIpEnabled</strong> is set to <strong>false</strong> and the server group is associated with a <strong>TCPSSL</strong> listener, you cannot change the value of this parameter to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PreserveClientIpEnabled")
    public Boolean preserveClientIpEnabled;

    /**
     * <p>The region ID of the network load balancing instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>Wrr</strong>: weighted round-robin. Backend servers with higher weights receive more requests.</p>
     * </li>
     * <li><p><strong>Wlc</strong>: weighted least connections. Requests are distributed based on the weights and actual loads (number of connections) of backend servers. If weights are the same, backend servers with fewer connections receive more requests.</p>
     * </li>
     * <li><p><strong>rr</strong>: round-robin. Requests are distributed to backend servers in sequence.</p>
     * </li>
     * <li><p><strong>sch</strong>: source IP hash. Requests from the same source IP address are distributed to the same backend server.</p>
     * </li>
     * <li><p><strong>tch</strong>: 4-tuple hash. Consistent hashing based on the 4-tuple (source IP address, destination IP address, source port, and destination port). Requests from the same flow are distributed to the same backend server.</p>
     * </li>
     * <li><p><strong>qch</strong>: QUIC ID hash. Requests with the same QUIC ID are distributed to the same backend server.</p>
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
     * <p>The ID of the server group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-atstuj3rtoptyui****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The new name of the server group.</p>
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>NLB_ServerGroup1</p>
     */
    @NameInMap("ServerGroupName")
    public String serverGroupName;

    public static UpdateServerGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupAttributeRequest self = new UpdateServerGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupAttributeRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public UpdateServerGroupAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServerGroupAttributeRequest setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
        this.connectionDrainEnabled = connectionDrainEnabled;
        return this;
    }
    public Boolean getConnectionDrainEnabled() {
        return this.connectionDrainEnabled;
    }

    public UpdateServerGroupAttributeRequest setConnectionDrainTimeout(Integer connectionDrainTimeout) {
        this.connectionDrainTimeout = connectionDrainTimeout;
        return this;
    }
    public Integer getConnectionDrainTimeout() {
        return this.connectionDrainTimeout;
    }

    public UpdateServerGroupAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateServerGroupAttributeRequest setHealthCheckConfig(UpdateServerGroupAttributeRequestHealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public UpdateServerGroupAttributeRequestHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public UpdateServerGroupAttributeRequest setIpVersionAffinityMode(String ipVersionAffinityMode) {
        this.ipVersionAffinityMode = ipVersionAffinityMode;
        return this;
    }
    public String getIpVersionAffinityMode() {
        return this.ipVersionAffinityMode;
    }

    public UpdateServerGroupAttributeRequest setPreserveClientIpEnabled(Boolean preserveClientIpEnabled) {
        this.preserveClientIpEnabled = preserveClientIpEnabled;
        return this;
    }
    public Boolean getPreserveClientIpEnabled() {
        return this.preserveClientIpEnabled;
    }

    public UpdateServerGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServerGroupAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public UpdateServerGroupAttributeRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public UpdateServerGroupAttributeRequest setServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
        return this;
    }
    public String getServerGroupName() {
        return this.serverGroupName;
    }

    public static class UpdateServerGroupAttributeRequestHealthCheckConfig extends TeaModel {
        /**
         * <p>The port used for health checks on backend servers. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of <strong>0</strong> indicates that the port of the backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The maximum timeout period for a health check response. Unit: seconds. Valid values: <strong>1</strong> to <strong>300</strong>. Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The domain name used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>$SERVER_IP</strong>: the internal IP address of the backend server.</li>
         * <li><strong>domain</strong>: a custom domain name. The domain name must be 1 to 80 characters in length, and can contain only lowercase letters, digits, hyphens (-), and periods (.).</li>
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
         * <li><p><strong>true</strong>: Enables health checks.</p>
         * </li>
         * <li><p><strong>false</strong>: Disables health checks.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The response string used for UDP health checks. The string can contain only letters and digits, and can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthCheckExp")
        public String healthCheckExp;

        /**
         * <p>The HTTP status codes that indicate a successful health check. Separate multiple HTTP status codes with commas (,). Valid values: <strong>http_2xx</strong> (default), <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
         * </blockquote>
         */
        @NameInMap("HealthCheckHttpCode")
        public java.util.List<String> healthCheckHttpCode;

        /**
         * <p>The HTTP version used for health checks. Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
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
         * <li><p>If <strong>HealthCheckType</strong> is set to <strong>TCP</strong> or <strong>HTTP</strong>, valid values are <strong>1</strong> to <strong>50</strong>.</p>
         * </li>
         * <li><p>If <strong>HealthCheckType</strong> is set to <strong>UDP</strong>, valid values are <strong>1</strong> to <strong>300</strong>. You must set the interval to a value greater than or equal to the response timeout period to ensure that UDP probe responses are not mistakenly identified as timeouts.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The request string used for UDP health checks. The string can contain only letters and digits, and can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("HealthCheckReq")
        public String healthCheckReq;

        /**
         * <p>The health check protocol. Valid values:</p>
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
         * <p>The path must be 1 to 80 characters in length. It can contain only letters, digits, the characters <code>-/.%?#&amp;=</code>, and extension characters <code>_;~!()*[]@$^:\\&quot;,+</code>. It must start with a forward slash (/).</p>
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
         * <p>The number of consecutive successful health checks required to change the health status of a backend server from <strong>Failed</strong> to <strong>Success</strong>. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The HTTP method used for health checks. Valid values: <strong>GET</strong> and <strong>HEAD</strong>.</p>
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
         * <p>The number of consecutive failed health checks required to change the health status of a backend server from <strong>Success</strong> to <strong>Failed</strong>. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static UpdateServerGroupAttributeRequestHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupAttributeRequestHealthCheckConfig self = new UpdateServerGroupAttributeRequestHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckExp(String healthCheckExp) {
            this.healthCheckExp = healthCheckExp;
            return this;
        }
        public String getHealthCheckExp() {
            return this.healthCheckExp;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public java.util.List<String> getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckReq(String healthCheckReq) {
            this.healthCheckReq = healthCheckReq;
            return this;
        }
        public String getHealthCheckReq() {
            return this.healthCheckReq;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHttpCheckMethod(String httpCheckMethod) {
            this.httpCheckMethod = httpCheckMethod;
            return this;
        }
        public String getHttpCheckMethod() {
            return this.httpCheckMethod;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

}
