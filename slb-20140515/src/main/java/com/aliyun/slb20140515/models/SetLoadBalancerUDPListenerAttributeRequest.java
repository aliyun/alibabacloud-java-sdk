// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerUDPListenerAttributeRequest extends TeaModel {
    /**
     * <p>The name of the listener.</p>
     * <br>
     * <p>The name must be 1 to 256 characters in length and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the vServer group.</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:</p>
     * <br>
     * <p>*   **-1**: For a pay-by-data-transfer Internet-facing CLB instance, you can set this parameter to **-1**. This way, the bandwidth of the listener is unlimited.</p>
     * <p>*   **1** to **5120**: For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of bandwidth limits that you set for all listeners cannot exceed the maximum bandwidth of the CLB instance.</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The frontend port used by the CLB instance.</p>
     * <br>
     * <p>Valid values: **1** to **65535**.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable access control. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr**: Backend servers with higher weights receive more requests than those with lower weights.</p>
     * <br>
     * <p>    If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.</p>
     * <br>
     * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
     * <br>
     * <p>*   **sch**: specifies consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</p>
     * <br>
     * <p>*   **tch**: specifies consistent hashing that is based on the following parameters: source IP address, destination IP address, source port, and destination port. Requests that contain the same preceding information are distributed to the same backend server.</p>
     * <br>
     * <p>*   **qch**: specifies consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Only high-performance CLB instances support **sch**, **tch**, and **qch**.</p>
     * <p>*   You cannot switch the algorithm used by a CLB instance from **wrr** or **rr** to consistent hashing or from consistent hashing to weighted round robin or round robin.</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>The request string for UDP listener health checks. The string must be 1 to 64 characters in length and can contain only letters and digits.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("HealthCheckSwitch")
    public String healthCheckSwitch;

    /**
     * <p>The type of the network ACL. Valid values:</p>
     * <br>
     * <p>*   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. After a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</p>
     * <br>
     * <p>    If you enable a whitelist but do not add an IP address to the ACL, the listener forwards all requests.</p>
     * <br>
     * <p>*   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are denied. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.</p>
     * <br>
     * <p>    If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
     * <br>
     * <p>>  If **AclStatus** is set to **on**, this parameter is required.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>Specifies whether to use a vServer group. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     * <br>
     * <p>>  You cannot set both **VserverGroup** and **MasterSlaveServerGroup** to **on**.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The ID of the network access control list (ACL) that is associated with the listener.</p>
     * <br>
     * <p>>  If **AclStatus** is set to **on**, this parameter is required.</p>
     */
    @NameInMap("MasterSlaveServerGroup")
    public String masterSlaveServerGroup;

    /**
     * <p>Specifies whether to use a primary/secondary server group. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     * <br>
     * <p>>  You cannot set **VserverGroup** and **MasterSlaveServerGroup** both to **on**.</p>
     */
    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProxyProtocolV2Enabled")
    public Boolean proxyProtocolV2Enabled;

    /**
     * <p>The timeout period of a health check. If a backend server, such as an Elastic Compute Service (ECS) instance, does not return a health check response within the specified timeout period, the server fails the health check. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1** to **300**.</p>
     * <br>
     * <p>>  If the value of the **HealthCheckConnectTimeout** parameter is smaller than that of the **HealthCheckInterval** parameter, the timeout period specified by the **HealthCheckConnectTimeout** parameter is ignored and the period of time specified by the **HealthCheckInterval** parameter is used as the timeout period.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
     * <br>
     * <p>Valid values: **1** to **10**.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The region ID of the CLB instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>The port that is used for health checks.</p>
     * <br>
     * <p>Valid values: **1** to **65535**.</p>
     */
    @NameInMap("VServerGroup")
    public String VServerGroup;

    /**
     * <p>The operation that you want to perform. Set the value to</p>
     * <br>
     * <p>**SetLoadBalancerUDPListenerAttribute**.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it can be declared healthy (from **fail** to **success**).</p>
     * <br>
     * <p>Valid values: **1** to **10**.</p>
     */
    @NameInMap("healthCheckExp")
    public String healthCheckExp;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   **on** (default): yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("healthCheckReq")
    public String healthCheckReq;

    public static SetLoadBalancerUDPListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerUDPListenerAttributeRequest self = new SetLoadBalancerUDPListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerUDPListenerAttributeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckSwitch(String healthCheckSwitch) {
        this.healthCheckSwitch = healthCheckSwitch;
        return this;
    }
    public String getHealthCheckSwitch() {
        return this.healthCheckSwitch;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setMasterSlaveServerGroup(String masterSlaveServerGroup) {
        this.masterSlaveServerGroup = masterSlaveServerGroup;
        return this;
    }
    public String getMasterSlaveServerGroup() {
        return this.masterSlaveServerGroup;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setProxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
        this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
        return this;
    }
    public Boolean getProxyProtocolV2Enabled() {
        return this.proxyProtocolV2Enabled;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setVServerGroup(String VServerGroup) {
        this.VServerGroup = VServerGroup;
        return this;
    }
    public String getVServerGroup() {
        return this.VServerGroup;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckExp(String healthCheckExp) {
        this.healthCheckExp = healthCheckExp;
        return this;
    }
    public String getHealthCheckExp() {
        return this.healthCheckExp;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckReq(String healthCheckReq) {
        this.healthCheckReq = healthCheckReq;
        return this;
    }
    public String getHealthCheckReq() {
        return this.healthCheckReq;
    }

}
