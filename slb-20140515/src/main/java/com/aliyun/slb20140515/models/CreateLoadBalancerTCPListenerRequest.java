// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerTCPListenerRequest extends TeaModel {
    /**
     * <p>The HTTP status code for a successful health check. Separate multiple HTTP status codes with commas (,). Valid values:</p>
     * <br>
     * <p>*   **http\_2xx**(default)</p>
     * <p>*   **http\_3xx**</p>
     * <p>*   **http\_4xx**</p>
     * <p>*   **http\_5xx**</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the network ACL that is associated with the listener.</p>
     * <br>
     * <p>>  If **AclStatus** is set to **on**, this parameter is required.</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The type of health checks. Valid values:</p>
     * <br>
     * <p>*   **tcp** (default)</p>
     * <p>*   **http**</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>Specifies whether to enable access control. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off** (default): no</p>
     */
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    /**
     * <p>The routing algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr** (default): Backend servers with higher weights receive more requests than backend servers with lower weights.</p>
     * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
     * <p>*   **sch**: specifies consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</p>
     * <p>*   **tch**: specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are distributed to the same backend server.</p>
     * <br>
     * <p>>  Only high-performance CLB instances support the **sch** and **tch** consistent hashing algorithms.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The timeout period of connection draining. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **10** to **900**.</p>
     * <br>
     * <p>>  This parameter is required if **ConnectionDrain** is set to **on**.</p>
     */
    @NameInMap("ConnectionDrain")
    public String connectionDrain;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    /**
     * <p>The backend port used by the CLB instance.</p>
     * <br>
     * <p>Valid values: **1** to **65535**.</p>
     * <br>
     * <p>If the **VServerGroupId** parameter is not set, this parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the listener.</p>
     * <br>
     * <p>The name must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The timeout period of a connection. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **10** to **900**.</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>Specifies whether to enable connection draining. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The timeout period of session persistence. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **0 to 3600**.</p>
     * <br>
     * <p>Default value: **0**. If the default value is used, the system disables session persistence.</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    @NameInMap("HealthCheckSwitch")
    public String healthCheckSwitch;

    /**
     * <p>The ID of the vServer group.</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The frontend port used by the CLB instance.</p>
     * <br>
     * <p>Valid values: **1** to **65535**.</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The domain name that you want to use for health checks. Valid values:</p>
     * <br>
     * <p>*   **$\_ip**: the private IP address of a backend server. If you do not set the HealthCheckDomain parameter or set the parameter to $\_ip, the CLB instance uses the private IP address of each backend server for health checks.</p>
     * <p>*   **domain**: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The ID of the primary/secondary server group.</p>
     * <br>
     * <p>>  You cannot set both VServerGroupId and MasterSlaveServerGroupId.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:</p>
     * <br>
     * <p>*   **-1**: For a pay-by-data-transfer Internet-facing CLB instance, this value can be set to -1, which specifies unlimited bandwidth.</p>
     * <p>*   **1** to **5120**: For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of the maximum bandwidth values that you set for all listeners cannot exceed the maximum bandwidth of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     */
    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   **on** (default): yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    @NameInMap("ProxyProtocolV2Enabled")
    public Boolean proxyProtocolV2Enabled;

    /**
     * <p>The type of the ACL. Valid values:</p>
     * <br>
     * <p>*   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application.</p>
     * <br>
     * <p>    Your service may be adversely affected if the whitelist is not properly configured.</p>
     * <br>
     * <p>    If a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener. If a whitelist is configured but no IP address is added to the whitelist, the listener forwards all requests.</p>
     * <br>
     * <p>*   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are rejected. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.</p>
     * <br>
     * <p>    If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
     * <br>
     * <p>>  If **AclStatus** is set to **on**, this parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The operation that you want to perform. Set the value to **CreateLoadBalancerTCPListener**.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("Tag")
    public java.util.List<CreateLoadBalancerTCPListenerRequestTag> tag;

    /**
     * <p>The port that is used for health checks.</p>
     * <br>
     * <p>Valid values: **1** to **65535**.</p>
     * <br>
     * <p>If this parameter is not set, the backend port specified by **BackendServerPort** is used for health checks.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>The maximum timeout period of a health check response. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1** to **300**.</p>
     * <br>
     * <p>Default value: **5**.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1** to **50**.</p>
     */
    @NameInMap("healthCheckInterval")
    public Integer healthCheckInterval;

    public static CreateLoadBalancerTCPListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerTCPListenerRequest self = new CreateLoadBalancerTCPListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerTCPListenerRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateLoadBalancerTCPListenerRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public CreateLoadBalancerTCPListenerRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public CreateLoadBalancerTCPListenerRequest setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateLoadBalancerTCPListenerRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateLoadBalancerTCPListenerRequest setConnectionDrain(String connectionDrain) {
        this.connectionDrain = connectionDrain;
        return this;
    }
    public String getConnectionDrain() {
        return this.connectionDrain;
    }

    public CreateLoadBalancerTCPListenerRequest setConnectionDrainTimeout(Integer connectionDrainTimeout) {
        this.connectionDrainTimeout = connectionDrainTimeout;
        return this;
    }
    public Integer getConnectionDrainTimeout() {
        return this.connectionDrainTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerTCPListenerRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckSwitch(String healthCheckSwitch) {
        this.healthCheckSwitch = healthCheckSwitch;
        return this;
    }
    public String getHealthCheckSwitch() {
        return this.healthCheckSwitch;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerTCPListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadBalancerTCPListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerTCPListenerRequest setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public CreateLoadBalancerTCPListenerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLoadBalancerTCPListenerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLoadBalancerTCPListenerRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setProxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
        this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
        return this;
    }
    public Boolean getProxyProtocolV2Enabled() {
        return this.proxyProtocolV2Enabled;
    }

    public CreateLoadBalancerTCPListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLoadBalancerTCPListenerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLoadBalancerTCPListenerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLoadBalancerTCPListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerTCPListenerRequest setTag(java.util.List<CreateLoadBalancerTCPListenerRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLoadBalancerTCPListenerRequestTag> getTag() {
        return this.tag;
    }

    public CreateLoadBalancerTCPListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public CreateLoadBalancerTCPListenerRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public static class CreateLoadBalancerTCPListenerRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLoadBalancerTCPListenerRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerTCPListenerRequestTag self = new CreateLoadBalancerTCPListenerRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerTCPListenerRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLoadBalancerTCPListenerRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
