// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B28E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of backend server groups.</p>
     */
    @NameInMap("ServerGroups")
    public java.util.List<ListServerGroupsResponseBodyServerGroups> serverGroups;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsResponseBody self = new ListServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerGroupsResponseBody setServerGroups(java.util.List<ListServerGroupsResponseBodyServerGroups> serverGroups) {
        this.serverGroups = serverGroups;
        return this;
    }
    public java.util.List<ListServerGroupsResponseBodyServerGroups> getServerGroups() {
        return this.serverGroups;
    }

    public ListServerGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServerGroupsResponseBodyServerGroupsHealthCheck extends TeaModel {
        /**
         * <p>The port of the backend server used for health checks.</p>
         * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>A value of <strong>0</strong> indicates that the port of the backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The maximum timeout period for a health check response. Unit: seconds. Default value: <strong>5</strong>.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The domain name used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>$SERVER_IP</strong>: the private IP address of the backend server.</p>
         * </li>
         * <li><p><strong>domain</strong>: a specific domain name. The domain name can be 1 to 80 characters in length and can contain only lowercase letters, digits, hyphens (-), and periods (.).</p>
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
         * <p>Indicates whether health check is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The response string for UDP listener health checks. The string can contain only letters and digits and can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthCheckExp")
        public String healthCheckExp;

        /**
         * <p>The HTTP status codes for a healthy response. Multiple status codes are separated by commas (,).
         * Valid values: <strong>http_2xx</strong>, <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
         * </blockquote>
         */
        @NameInMap("HealthCheckHttpCode")
        public java.util.List<String> healthCheckHttpCode;

        /**
         * <p>The HTTP version for health checks. Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
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
         * <li>If <strong>HealthCheckType</strong> is set to <strong>UDP</strong>, valid values are <strong>1</strong> to <strong>300</strong>. Set the interval to a value greater than or equal to the response timeout period to prevent UDP probe responses from being incorrectly identified as non-responses due to timeout.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The request string for UDP listener health checks. The string can contain only letters and digits and can be up to 512 characters in length.</p>
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
         * <p>The number of consecutive successful health checks required before a backend server is declared healthy (status changes from <strong>fail</strong> to <strong>success</strong>).</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The health check method. Valid values: <strong>GET</strong> and <strong>HEAD</strong>.</p>
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
         * <p>The number of consecutive failed health checks required before a backend server is declared unhealthy (status changes from <strong>success</strong> to <strong>fail</strong>).</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static ListServerGroupsResponseBodyServerGroupsHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsHealthCheck self = new ListServerGroupsResponseBodyServerGroupsHealthCheck();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckExp(String healthCheckExp) {
            this.healthCheckExp = healthCheckExp;
            return this;
        }
        public String getHealthCheckExp() {
            return this.healthCheckExp;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public java.util.List<String> getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckReq(String healthCheckReq) {
            this.healthCheckReq = healthCheckReq;
            return this;
        }
        public String getHealthCheckReq() {
            return this.healthCheckReq;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setHttpCheckMethod(String httpCheckMethod) {
            this.httpCheckMethod = httpCheckMethod;
            return this;
        }
        public String getHttpCheckMethod() {
            return this.httpCheckMethod;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupsTags extends TeaModel {
        /**
         * <p>The tag key. You can specify up to 10 tag keys.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 10 tag values.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListServerGroupsResponseBodyServerGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsTags self = new ListServerGroupsResponseBodyServerGroupsTags();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServerGroupsResponseBodyServerGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroups extends TeaModel {
        /**
         * <p>The protocol version. Valid values:</p>
         * <ul>
         * <li><strong>Ipv4</strong>: IPv4 type.</li>
         * <li><strong>DualStack</strong>: dual-stack type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        /**
         * <p>The user UID.</p>
         * 
         * <strong>example:</strong>
         * <p>165820696622****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>Indicates whether all-port forwarding is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AnyPortEnabled")
        public Boolean anyPortEnabled;

        /**
         * <p>Indicates whether connection draining is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConnectionDrainEnabled")
        public Boolean connectionDrainEnabled;

        /**
         * <p>The connection draining timeout period. Unit: seconds.
         * Valid values: <strong>10</strong> to <strong>900</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        /**
         * <p>The health check configuration.</p>
         */
        @NameInMap("HealthCheck")
        public ListServerGroupsResponseBodyServerGroupsHealthCheck healthCheck;

        /**
         * <p>The traffic scheduling policy in dual-stack mode:</p>
         * <ul>
         * <li>NonAffinity (default): non-affinity mode. Traffic is forwarded to healthy backends based on the scheduling algorithm regardless of the IP protocol version of the source.</li>
         * <li>Affinity: affinity mode. Traffic is forwarded based on the IP protocol version of the request source. IPv4 requests are forwarded only to IPv4 backends, and IPv6 requests are forwarded only to IPv6 backends.<blockquote>
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
         * <p>Indicates whether client IP preservation is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * <blockquote>
         * <p>When <strong>AddressIPVersion</strong> is set to <strong>ipv4</strong>, the default value is <strong>true</strong>. When <strong>AddressIPVersion</strong> is set to <strong>ipv6</strong>, the value can only be <strong>false</strong>. This will be changed to <strong>true</strong> after the underlying infrastructure supports it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PreserveClientIpEnabled")
        public Boolean preserveClientIpEnabled;

        /**
         * <p>The backend forwarding protocol. Valid values: <strong>TCP</strong> and <strong>UDP</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The region ID of the Network Load Balancer (NLB) load balancing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of Network Load Balancer (NLB) load balancing instances.</p>
         */
        @NameInMap("RelatedLoadBalancerIds")
        public java.util.List<String> relatedLoadBalancerIds;

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
         * <li><strong>Wrr</strong>: weighted round-robin. Backend servers with higher weights are polled more frequently.</li>
         * <li><strong>Wlc</strong>: weighted least connections. In addition to polling based on the weight configured for each backend server, the actual load (number of connections) of the backend server is also considered. When the weights are the same, backend servers with fewer current connections are polled more frequently.</li>
         * <li><strong>rr</strong>: round-robin. Requests are distributed to backend servers in access sequence.</li>
         * <li><strong>sch</strong>: source IP hashing. Requests from the same source address are scheduled to the same backend server.</li>
         * <li><strong>tch</strong>: four-element hashing. Consistent hashing based on four elements (source IP, destination IP address, source port, and destination port). Requests from the same flow are scheduled to the same backend server.</li>
         * <li><strong>qch</strong>: QUIC ID hashing. Requests with the same QUIC ID are hashed to the same backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Wrr</p>
         */
        @NameInMap("Scheduler")
        public String scheduler;

        /**
         * <p>The number of backend servers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ServerCount")
        public Integer serverCount;

        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtoptyui****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The server group name.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB_ServerGroup</p>
         */
        @NameInMap("ServerGroupName")
        public String serverGroupName;

        /**
         * <p>The server group status. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The server group is being created.</li>
         * <li><strong>Available</strong>: The server group is available.</li>
         * <li><strong>Configuring</strong>: The server group is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("ServerGroupStatus")
        public String serverGroupStatus;

        /**
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong>: server type. This type of server group supports adding <strong>Ecs</strong>, <strong>Ens</strong>, and <strong>Eci</strong> instances.</li>
         * <li><strong>Ip</strong>: IP address type. This type of server group supports adding IP addresses directly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("ServerGroupType")
        public String serverGroupType;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListServerGroupsResponseBodyServerGroupsTags> tags;

        /**
         * <p>The ID of the VPC to which the server group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72zv****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListServerGroupsResponseBodyServerGroups build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroups self = new ListServerGroupsResponseBodyServerGroups();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroups setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public ListServerGroupsResponseBodyServerGroups setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListServerGroupsResponseBodyServerGroups setAnyPortEnabled(Boolean anyPortEnabled) {
            this.anyPortEnabled = anyPortEnabled;
            return this;
        }
        public Boolean getAnyPortEnabled() {
            return this.anyPortEnabled;
        }

        public ListServerGroupsResponseBodyServerGroups setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
            this.connectionDrainEnabled = connectionDrainEnabled;
            return this;
        }
        public Boolean getConnectionDrainEnabled() {
            return this.connectionDrainEnabled;
        }

        public ListServerGroupsResponseBodyServerGroups setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        public ListServerGroupsResponseBodyServerGroups setHealthCheck(ListServerGroupsResponseBodyServerGroupsHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public ListServerGroupsResponseBodyServerGroups setIpVersionAffinityMode(String ipVersionAffinityMode) {
            this.ipVersionAffinityMode = ipVersionAffinityMode;
            return this;
        }
        public String getIpVersionAffinityMode() {
            return this.ipVersionAffinityMode;
        }

        public ListServerGroupsResponseBodyServerGroups setPreserveClientIpEnabled(Boolean preserveClientIpEnabled) {
            this.preserveClientIpEnabled = preserveClientIpEnabled;
            return this;
        }
        public Boolean getPreserveClientIpEnabled() {
            return this.preserveClientIpEnabled;
        }

        public ListServerGroupsResponseBodyServerGroups setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListServerGroupsResponseBodyServerGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListServerGroupsResponseBodyServerGroups setRelatedLoadBalancerIds(java.util.List<String> relatedLoadBalancerIds) {
            this.relatedLoadBalancerIds = relatedLoadBalancerIds;
            return this;
        }
        public java.util.List<String> getRelatedLoadBalancerIds() {
            return this.relatedLoadBalancerIds;
        }

        public ListServerGroupsResponseBodyServerGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListServerGroupsResponseBodyServerGroups setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public ListServerGroupsResponseBodyServerGroups setServerCount(Integer serverCount) {
            this.serverCount = serverCount;
            return this;
        }
        public Integer getServerCount() {
            return this.serverCount;
        }

        public ListServerGroupsResponseBodyServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public ListServerGroupsResponseBodyServerGroups setServerGroupName(String serverGroupName) {
            this.serverGroupName = serverGroupName;
            return this;
        }
        public String getServerGroupName() {
            return this.serverGroupName;
        }

        public ListServerGroupsResponseBodyServerGroups setServerGroupStatus(String serverGroupStatus) {
            this.serverGroupStatus = serverGroupStatus;
            return this;
        }
        public String getServerGroupStatus() {
            return this.serverGroupStatus;
        }

        public ListServerGroupsResponseBodyServerGroups setServerGroupType(String serverGroupType) {
            this.serverGroupType = serverGroupType;
            return this;
        }
        public String getServerGroupType() {
            return this.serverGroupType;
        }

        public ListServerGroupsResponseBodyServerGroups setTags(java.util.List<ListServerGroupsResponseBodyServerGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListServerGroupsResponseBodyServerGroupsTags> getTags() {
            return this.tags;
        }

        public ListServerGroupsResponseBodyServerGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
