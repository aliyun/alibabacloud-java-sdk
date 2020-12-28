// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPSListenerAttributeRequest extends TeaModel {
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

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("BackendProtocol")
    public String backendProtocol;

    @NameInMap("XForwardedFor")
    public String XForwardedFor;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("StickySession")
    public String stickySession;

    @NameInMap("StickySessionType")
    public String stickySessionType;

    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    @NameInMap("Cookie")
    public String cookie;

    @NameInMap("HealthCheck")
    public String healthCheck;

    @NameInMap("HealthCheckType")
    public String healthCheckType;

    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    @NameInMap("MaxConnection")
    public Integer maxConnection;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("access_key_id")
    public String accessKeyId;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("CACertificateId")
    public String CACertificateId;

    @NameInMap("VServerGroup")
    public String VServerGroup;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("XForwardedFor_SLBIP")
    public String XForwardedFor_SLBIP;

    @NameInMap("XForwardedFor_SLBID")
    public String XForwardedFor_SLBID;

    @NameInMap("XForwardedFor_proto")
    public String XForwardedFor_proto;

    @NameInMap("Gzip")
    public String gzip;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("VpcIds")
    public String vpcIds;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    @NameInMap("EnableHttp2")
    public String enableHttp2;

    @NameInMap("TLSCipherPolicy")
    public String TLSCipherPolicy;

    @NameInMap("Description")
    public String description;

    @NameInMap("XForwardedFor_SLBPORT")
    public String XForwardedFor_SLBPORT;

    @NameInMap("XForwardedFor_ClientSrcPort")
    public String XForwardedFor_ClientSrcPort;

    @NameInMap("XForwardedFor_ClientCertSubjectDN")
    public String XForwardedFor_ClientCertSubjectDN;

    @NameInMap("XForwardedFor_ClientCertIssuerDN")
    public String XForwardedFor_ClientCertIssuerDN;

    @NameInMap("XForwardedFor_ClientCertFingerprint")
    public String XForwardedFor_ClientCertFingerprint;

    @NameInMap("XForwardedFor_ClientCertClientVerify")
    public String XForwardedFor_ClientCertClientVerify;

    @NameInMap("XForwardedFor_ClientCertSubjectDNAlias")
    public String XForwardedFor_ClientCertSubjectDNAlias;

    @NameInMap("XForwardedFor_ClientCertIssuerDNAlias")
    public String XForwardedFor_ClientCertIssuerDNAlias;

    @NameInMap("XForwardedFor_ClientCertFingerprintAlias")
    public String XForwardedFor_ClientCertFingerprintAlias;

    @NameInMap("XForwardedFor_ClientCertClientVerifyAlias")
    public String XForwardedFor_ClientCertClientVerifyAlias;

    @NameInMap("ServerCertificate")
    public java.util.List<SetLoadBalancerHTTPSListenerAttributeRequestServerCertificate> serverCertificate;

    public static SetLoadBalancerHTTPSListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerHTTPSListenerAttributeRequest self = new SetLoadBalancerHTTPSListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setBackendProtocol(String backendProtocol) {
        this.backendProtocol = backendProtocol;
        return this;
    }
    public String getBackendProtocol() {
        return this.backendProtocol;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }
    public Integer getMaxConnection() {
        return this.maxConnection;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setVServerGroup(String VServerGroup) {
        this.VServerGroup = VServerGroup;
        return this;
    }
    public String getVServerGroup() {
        return this.VServerGroup;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
        this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
        return this;
    }
    public String getXForwardedFor_SLBIP() {
        return this.XForwardedFor_SLBIP;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
        this.XForwardedFor_SLBID = XForwardedFor_SLBID;
        return this;
    }
    public String getXForwardedFor_SLBID() {
        return this.XForwardedFor_SLBID;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_proto(String XForwardedFor_proto) {
        this.XForwardedFor_proto = XForwardedFor_proto;
        return this;
    }
    public String getXForwardedFor_proto() {
        return this.XForwardedFor_proto;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setGzip(String gzip) {
        this.gzip = gzip;
        return this;
    }
    public String getGzip() {
        return this.gzip;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setVpcIds(String vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public String getVpcIds() {
        return this.vpcIds;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setEnableHttp2(String enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }
    public String getEnableHttp2() {
        return this.enableHttp2;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setTLSCipherPolicy(String TLSCipherPolicy) {
        this.TLSCipherPolicy = TLSCipherPolicy;
        return this;
    }
    public String getTLSCipherPolicy() {
        return this.TLSCipherPolicy;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
        this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
        return this;
    }
    public String getXForwardedFor_SLBPORT() {
        return this.XForwardedFor_SLBPORT;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
        this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
        return this;
    }
    public String getXForwardedFor_ClientSrcPort() {
        return this.XForwardedFor_ClientSrcPort;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientCertSubjectDN(String XForwardedFor_ClientCertSubjectDN) {
        this.XForwardedFor_ClientCertSubjectDN = XForwardedFor_ClientCertSubjectDN;
        return this;
    }
    public String getXForwardedFor_ClientCertSubjectDN() {
        return this.XForwardedFor_ClientCertSubjectDN;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientCertIssuerDN(String XForwardedFor_ClientCertIssuerDN) {
        this.XForwardedFor_ClientCertIssuerDN = XForwardedFor_ClientCertIssuerDN;
        return this;
    }
    public String getXForwardedFor_ClientCertIssuerDN() {
        return this.XForwardedFor_ClientCertIssuerDN;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientCertFingerprint(String XForwardedFor_ClientCertFingerprint) {
        this.XForwardedFor_ClientCertFingerprint = XForwardedFor_ClientCertFingerprint;
        return this;
    }
    public String getXForwardedFor_ClientCertFingerprint() {
        return this.XForwardedFor_ClientCertFingerprint;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientCertClientVerify(String XForwardedFor_ClientCertClientVerify) {
        this.XForwardedFor_ClientCertClientVerify = XForwardedFor_ClientCertClientVerify;
        return this;
    }
    public String getXForwardedFor_ClientCertClientVerify() {
        return this.XForwardedFor_ClientCertClientVerify;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientCertSubjectDNAlias(String XForwardedFor_ClientCertSubjectDNAlias) {
        this.XForwardedFor_ClientCertSubjectDNAlias = XForwardedFor_ClientCertSubjectDNAlias;
        return this;
    }
    public String getXForwardedFor_ClientCertSubjectDNAlias() {
        return this.XForwardedFor_ClientCertSubjectDNAlias;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientCertIssuerDNAlias(String XForwardedFor_ClientCertIssuerDNAlias) {
        this.XForwardedFor_ClientCertIssuerDNAlias = XForwardedFor_ClientCertIssuerDNAlias;
        return this;
    }
    public String getXForwardedFor_ClientCertIssuerDNAlias() {
        return this.XForwardedFor_ClientCertIssuerDNAlias;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientCertFingerprintAlias(String XForwardedFor_ClientCertFingerprintAlias) {
        this.XForwardedFor_ClientCertFingerprintAlias = XForwardedFor_ClientCertFingerprintAlias;
        return this;
    }
    public String getXForwardedFor_ClientCertFingerprintAlias() {
        return this.XForwardedFor_ClientCertFingerprintAlias;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientCertClientVerifyAlias(String XForwardedFor_ClientCertClientVerifyAlias) {
        this.XForwardedFor_ClientCertClientVerifyAlias = XForwardedFor_ClientCertClientVerifyAlias;
        return this;
    }
    public String getXForwardedFor_ClientCertClientVerifyAlias() {
        return this.XForwardedFor_ClientCertClientVerifyAlias;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setServerCertificate(java.util.List<SetLoadBalancerHTTPSListenerAttributeRequestServerCertificate> serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public java.util.List<SetLoadBalancerHTTPSListenerAttributeRequestServerCertificate> getServerCertificate() {
        return this.serverCertificate;
    }

    public static class SetLoadBalancerHTTPSListenerAttributeRequestServerCertificate extends TeaModel {
        public static SetLoadBalancerHTTPSListenerAttributeRequestServerCertificate build(java.util.Map<String, ?> map) throws Exception {
            SetLoadBalancerHTTPSListenerAttributeRequestServerCertificate self = new SetLoadBalancerHTTPSListenerAttributeRequestServerCertificate();
            return TeaModel.build(map, self);
        }

    }

}
