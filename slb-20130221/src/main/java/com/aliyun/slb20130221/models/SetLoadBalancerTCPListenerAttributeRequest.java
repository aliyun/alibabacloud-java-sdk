// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20130221.models;

import com.aliyun.tea.*;

public class SetLoadBalancerTCPListenerAttributeRequest extends TeaModel {
    @NameInMap("ConnectPort")
    public Integer connectPort;

    @NameInMap("ConnectTimeout")
    public Integer connectTimeout;

    @NameInMap("HealthCheck")
    public String healthCheck;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static SetLoadBalancerTCPListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerTCPListenerAttributeRequest self = new SetLoadBalancerTCPListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerTCPListenerAttributeRequest setConnectPort(Integer connectPort) {
        this.connectPort = connectPort;
        return this;
    }
    public Integer getConnectPort() {
        return this.connectPort;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }
    public Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
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

    public SetLoadBalancerTCPListenerAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
