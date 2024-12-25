// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerTCPListenerAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the network access control list (ACL) that is associated with the listener.</p>
     * <p>If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12333</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>Specifies whether to enable access control. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The type of the network ACL. Valid values:</p>
     * <ul>
     * <li><p><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the allowlist is not properly configured. After a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</p>
     * <p>If you enable a whitelist but do not add an IP address to the ACL, the listener forwards all requests.</p>
     * </li>
     * <li><p><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are rejected. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.</p>
     * <p>If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>white</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>5120</strong>.</p>
     * <ul>
     * <li><strong>-1</strong>: For a pay-by-data-transfer Internet-facing CLB instance, you can set this parameter to <strong>-1</strong>, which specifies unlimited bandwidth.</li>
     * <li><strong>1</strong> to <strong>5120</strong>: For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of the maximum bandwidth values of all listeners cannot exceed the maximum bandwidth of the CLB instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>Specifies whether to enable connection draining. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ConnectionDrain")
    public String connectionDrain;

    /**
     * <p>The timeout period of connection draining. This parameter is required if <strong>ConnectionDrain</strong> is set to <strong>on</strong>. Unit: seconds.</p>
     * <p>Valid values: <strong>10</strong> to <strong>900</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    /**
     * <p>The name of the listener.</p>
     * <p>The name must be 1 to 256 characters in length and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>tcp_80</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The timeout period of a connection. Unit: seconds. Valid values: <strong>10</strong> to <strong>900</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    /**
     * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>If you do not set this parameter, the port specified by the <strong>BackendServerPort</strong> parameter is used.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The timeout period of a health check.</p>
     * <p>If a backend ECS instance does not return a health check response within the specified timeout period, the server fails the health check.</p>
     * <p>Valid values: <strong>1</strong> to <strong>300</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p> If the value of the <strong>HealthCheckConnectTimeout</strong> parameter is smaller than that of the <strong>HealthCheckInterval</strong> parameter, the timeout period specified by the <strong>HCTimeout</strong> parameter is ignored and the period of time specified by the <strong>HealthCheckInterval</strong> parameter is used as the timeout period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>The domain name that is used for health checks. You can set this parameter when the TCP listener requires HTTP health checks. If you do not set this parameter, TCP health checks are performed.</p>
     * <ul>
     * <li><p><strong>$_ip</strong>: the private IP addresses of the backend servers.</p>
     * <p>If you do not set the HealthCheckHost parameter or set the parameter to $SERVER_IP, the CLB instance uses the private IP addresses of backend servers for health checks.</p>
     * </li>
     * <li><p><strong>domain</strong>: The domain name is 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code for a successful health check. Separate multiple HTTP status codes with commas (,).</p>
     * <p>Valid values: <strong>http_2xx</strong>, <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>http_2xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds.</p>
     * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HealthCheckSwitch")
    public String healthCheckSwitch;

    /**
     * <p>The type of the health check. Valid values: <strong>tcp</strong> and <strong>http</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The URI that is used for health checks. The URI must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&amp;). The URI must start with a forward slash (/) but cannot be a single forward slash (/).</p>
     * <p>You can set this parameter when the TCP listener requires HTTP health checks.</p>
     * <p>If you do not set this parameter, TCP health checks are performed.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/index.html</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The frontend port used by the CLB instance.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the CLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1ygod3yctvg1y****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>Specifies whether to use a primary/secondary server group. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * <p>You cannot set both <strong>VserverGroup</strong> and <strong>MasterSlaveServerGroup</strong> to <strong>on</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("MasterSlaveServerGroup")
    public String masterSlaveServerGroup;

    /**
     * <p>The ID of the primary/secondary server group.</p>
     * <blockquote>
     * <p> You can set only one of the VServerGroupId and MasterSlaveServerGroupId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige****</p>
     */
    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The timeout period of session persistence. Valid values: <strong>0</strong> to <strong>3600</strong>. Unit: seconds.</p>
     * <p>Default value: <strong>0</strong>. If the default value is used, the system disables session persistence.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    /**
     * <p>Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProxyProtocolV2Enabled")
    public Boolean proxyProtocolV2Enabled;

    /**
     * <p>The region ID of the CLB instance.</p>
     * <p>You can query the region ID from the <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a> list or by calling the <a href="~~DescribeRegions~~">DescribeRegions</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><strong>wrr</strong>: Backend servers that have higher weights receive more requests than backend servers that have lower weights.</li>
     * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
     * <li><strong>sch</strong>: specifies consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
     * <li><strong>tch</strong>: specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are distributed to the same backend server.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Only high-performance CLB instances support the <strong>sch</strong> and <strong>tch</strong> algorithms.</li>
     * <li>CLB does not support converting the <strong>wrr</strong> and <strong>rr</strong> algorithms to sch or tch. You cannot switch the hash algorithm from one to another.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>Specifies whether to enable the SynProxy feature of CLB for protection. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: yes</li>
     * <li><strong>disable</strong>: no</li>
     * </ul>
     * <p>We recommend that you use the default value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("SynProxy")
    public String synProxy;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>Specifies whether to use a vServer group. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * <blockquote>
     * <p> You cannot set both <strong>VserverGroup</strong> and <strong>MasterSlaveServerGroup</strong> to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("VServerGroup")
    public String VServerGroup;

    /**
     * <p>The ID of the vServer group.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6j5****</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static SetLoadBalancerTCPListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerTCPListenerAttributeRequest self = new SetLoadBalancerTCPListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerTCPListenerAttributeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setConnectionDrain(String connectionDrain) {
        this.connectionDrain = connectionDrain;
        return this;
    }
    public String getConnectionDrain() {
        return this.connectionDrain;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setConnectionDrainTimeout(Integer connectionDrainTimeout) {
        this.connectionDrainTimeout = connectionDrainTimeout;
        return this;
    }
    public Integer getConnectionDrainTimeout() {
        return this.connectionDrainTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckSwitch(String healthCheckSwitch) {
        this.healthCheckSwitch = healthCheckSwitch;
        return this;
    }
    public String getHealthCheckSwitch() {
        return this.healthCheckSwitch;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setMasterSlaveServerGroup(String masterSlaveServerGroup) {
        this.masterSlaveServerGroup = masterSlaveServerGroup;
        return this;
    }
    public String getMasterSlaveServerGroup() {
        return this.masterSlaveServerGroup;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setProxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
        this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
        return this;
    }
    public Boolean getProxyProtocolV2Enabled() {
        return this.proxyProtocolV2Enabled;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setSynProxy(String synProxy) {
        this.synProxy = synProxy;
        return this;
    }
    public String getSynProxy() {
        return this.synProxy;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setVServerGroup(String VServerGroup) {
        this.VServerGroup = VServerGroup;
        return this;
    }
    public String getVServerGroup() {
        return this.VServerGroup;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

}
