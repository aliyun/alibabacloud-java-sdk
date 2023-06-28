// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerTCPListenerAttributeRequest extends TeaModel {
    /**
     * <p>The type of the health check. Valid values: **tcp** and **http**.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the primary/secondary server group.</p>
     * <br>
     * <p>>  You can set only one of the VServerGroupId and MasterSlaveServerGroupId parameters.</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>Specifies whether to enable the SynProxy feature of CLB for protection. Valid values:</p>
     * <br>
     * <p>*   **enable**: yes</p>
     * <p>*   **disable**: no</p>
     * <br>
     * <p>We recommend that you use the default value of this parameter.</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The ID of the network access control list (ACL) that is associated with the listener.</p>
     * <br>
     * <p>If **AclStatus** is set to **on**, this parameter is required.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The name of the listener.</p>
     * <br>
     * <p>The name must be 1 to 256 characters in length and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
     */
    @NameInMap("ConnectionDrain")
    public String connectionDrain;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    /**
     * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values: **-1** and **1** to **5120**.</p>
     * <br>
     * <p>*   **-1**: For a pay-by-data-transfer Internet-facing CLB instance, you can set this parameter to **-1**, which specifies unlimited bandwidth.</p>
     * <p>*   **1** to **5120**: For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of the maximum bandwidth values of all listeners cannot exceed the maximum bandwidth of the CLB instance.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The timeout period of connection draining. This parameter is required if **ConnectionDrain** is set to **on**. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **10** to **900**.</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1** to **50**.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The URI that is used for health checks. The URI must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&). The URI must start with a forward slash (/) but cannot be a single forward slash (/).</p>
     * <br>
     * <p>You can set this parameter when the TCP listener requires HTTP health checks.</p>
     * <br>
     * <p>If you do not set this parameter, TCP health checks are performed.</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>Specifies whether to enable access control. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("HealthCheckSwitch")
    public String healthCheckSwitch;

    /**
     * <p>The frontend port used by the CLB instance.</p>
     * <br>
     * <p>Valid values: **1** to **65535**.</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The domain name that is used for health checks. You can set this parameter when the TCP listener requires HTTP health checks. If you do not set this parameter, TCP health checks are performed.</p>
     * <br>
     * <p>*   **$\_ip**: the private IP addresses of the backend servers.</p>
     * <br>
     * <p>    If you do not set the HealthCheckHost parameter or set the parameter to $SERVER_IP, the CLB instance uses the private IP addresses of backend servers for health checks.</p>
     * <br>
     * <p>*   **domain**: The domain name is 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The ID of the vServer group.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr**: Backend servers that have higher weights receive more requests than backend servers that have lower weights.</p>
     * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
     * <p>*   **sch**: specifies consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</p>
     * <p>*   **tch**: specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are distributed to the same backend server.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Only high-performance CLB instances support the **sch** and **tch** algorithms.</p>
     * <p>*   CLB does not support converting the **wrr** and **rr** algorithms to sch or tch. You cannot switch the hash algorithm from one to another.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     */
    @NameInMap("MasterSlaveServerGroup")
    public String masterSlaveServerGroup;

    /**
     * <p>The port that is used for health checks. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>If you do not set this parameter, the port specified by the **BackendServerPort** parameter is used.</p>
     */
    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operation that you want to perform. Set the value to **SetLoadBalancerTCPListenerAttribute**.</p>
     */
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    @NameInMap("ProxyProtocolV2Enabled")
    public Boolean proxyProtocolV2Enabled;

    /**
     * <p>Specifies whether to use a primary/secondary server group. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     * <br>
     * <p>You cannot set both **VserverGroup** and **MasterSlaveServerGroup** to **on**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The timeout period of session persistence. Valid values: **0** to **3600**. Unit: seconds.</p>
     * <br>
     * <p>Default value: **0**. If the default value is used, the system disables session persistence.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The timeout period of a connection. Unit: seconds. Valid values: **10** to **900**.</p>
     */
    @NameInMap("SynProxy")
    public String synProxy;

    /**
     * <p>The type of the network ACL. Valid values:</p>
     * <br>
     * <p>*   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the allowlist is not properly configured. After a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</p>
     * <br>
     * <p>    If you enable a whitelist but do not add an IP address to the ACL, the listener forwards all requests.</p>
     * <br>
     * <p>*   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are rejected. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.</p>
     * <br>
     * <p>    If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
     * <br>
     * <p>>  If **AclStatus** is set to **on**, this parameter is required.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>Specifies whether to use a vServer group. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     * <br>
     * <p>>  You cannot set both **VserverGroup** and **MasterSlaveServerGroup** to **on**.</p>
     */
    @NameInMap("VServerGroup")
    public String VServerGroup;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
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
