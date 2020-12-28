// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerTCPListenerRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    @NameInMap("healthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    @NameInMap("HealthCheckType")
    public String healthCheckType;

    @NameInMap("MaxConnection")
    public Integer maxConnection;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("access_key_id")
    public String accessKeyId;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("VpcIds")
    public String vpcIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("ConnectionDrain")
    public String connectionDrain;

    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    @NameInMap("PortRange")
    public java.util.List<CreateLoadBalancerTCPListenerRequestPortRange> portRange;

    public static CreateLoadBalancerTCPListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerTCPListenerRequest self = new CreateLoadBalancerTCPListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerTCPListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLoadBalancerTCPListenerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public CreateLoadBalancerTCPListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerTCPListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
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

    public CreateLoadBalancerTCPListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerTCPListenerRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerTCPListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public CreateLoadBalancerTCPListenerRequest setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }
    public Integer getMaxConnection() {
        return this.maxConnection;
    }

    public CreateLoadBalancerTCPListenerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLoadBalancerTCPListenerRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public CreateLoadBalancerTCPListenerRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public CreateLoadBalancerTCPListenerRequest setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public CreateLoadBalancerTCPListenerRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateLoadBalancerTCPListenerRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateLoadBalancerTCPListenerRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public CreateLoadBalancerTCPListenerRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public CreateLoadBalancerTCPListenerRequest setVpcIds(String vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public String getVpcIds() {
        return this.vpcIds;
    }

    public CreateLoadBalancerTCPListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public CreateLoadBalancerTCPListenerRequest setPortRange(java.util.List<CreateLoadBalancerTCPListenerRequestPortRange> portRange) {
        this.portRange = portRange;
        return this;
    }
    public java.util.List<CreateLoadBalancerTCPListenerRequestPortRange> getPortRange() {
        return this.portRange;
    }

    public static class CreateLoadBalancerTCPListenerRequestPortRange extends TeaModel {
        public static CreateLoadBalancerTCPListenerRequestPortRange build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerTCPListenerRequestPortRange self = new CreateLoadBalancerTCPListenerRequestPortRange();
            return TeaModel.build(map, self);
        }

    }

}
