// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20130221.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPListenerAttributeRequest extends TeaModel {
    @NameInMap("Cookie")
    public String cookie;

    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("HealthCheck")
    public String healthCheck;

    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

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

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("StickySession")
    public String stickySession;

    @NameInMap("StickySessionType")
    public String stickySessionType;

    @NameInMap("URI")
    public String URI;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    @NameInMap("XForwardedFor")
    public String XForwardedFor;

    public static SetLoadBalancerHTTPListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerHTTPListenerAttributeRequest self = new SetLoadBalancerHTTPListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

}
