// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Listeners")
    public java.util.List<DescribeLoadBalancerListenersResponseBodyListeners> listeners;

    public static DescribeLoadBalancerListenersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenersResponseBody self = new DescribeLoadBalancerListenersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLoadBalancerListenersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerListenersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLoadBalancerListenersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLoadBalancerListenersResponseBody setListeners(java.util.List<DescribeLoadBalancerListenersResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeLoadBalancerListenersResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig extends TeaModel {
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        @NameInMap("XForwardedFor_ClientSrcPort")
        public String XForwardedFor_ClientSrcPort;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("Gzip")
        public String gzip;

        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        @NameInMap("HealthCheckType")
        public String healthCheckType;

        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        @NameInMap("XForwardedFor_SLBID")
        public String XForwardedFor_SLBID;

        @NameInMap("ForwardPort")
        public Integer forwardPort;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("ListenerForward")
        public String listenerForward;

        @NameInMap("XForwardedFor")
        public String XForwardedFor;

        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        @NameInMap("XForwardedFor_SLBPORT")
        public String XForwardedFor_SLBPORT;

        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        @NameInMap("StickySessionType")
        public String stickySessionType;

        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        @NameInMap("XForwardedFor_proto")
        public String XForwardedFor_proto;

        @NameInMap("XForwardedFor_SLBIP")
        public String XForwardedFor_SLBIP;

        @NameInMap("StickySession")
        public String stickySession;

        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        @NameInMap("HealthCheck")
        public String healthCheck;

        public static DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig self = new DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
            this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
            return this;
        }
        public String getXForwardedFor_ClientSrcPort() {
            return this.XForwardedFor_ClientSrcPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
            this.XForwardedFor_SLBID = XForwardedFor_SLBID;
            return this;
        }
        public String getXForwardedFor_SLBID() {
            return this.XForwardedFor_SLBID;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setForwardPort(Integer forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public Integer getForwardPort() {
            return this.forwardPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setListenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
            return this;
        }
        public String getListenerForward() {
            return this.listenerForward;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor(String XForwardedFor) {
            this.XForwardedFor = XForwardedFor;
            return this;
        }
        public String getXForwardedFor() {
            return this.XForwardedFor;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
            this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
            return this;
        }
        public String getXForwardedFor_SLBPORT() {
            return this.XForwardedFor_SLBPORT;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_proto(String XForwardedFor_proto) {
            this.XForwardedFor_proto = XForwardedFor_proto;
            return this;
        }
        public String getXForwardedFor_proto() {
            return this.XForwardedFor_proto;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
            this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
            return this;
        }
        public String getXForwardedFor_SLBIP() {
            return this.XForwardedFor_SLBIP;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setStickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public String getStickySession() {
            return this.stickySession;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig extends TeaModel {
        @NameInMap("XForwardedFor_ClientCertClientVerify")
        public String XForwardedFor_ClientCertClientVerify;

        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        @NameInMap("XForwardedFor_ClientSrcPort")
        public String XForwardedFor_ClientSrcPort;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("Gzip")
        public String gzip;

        @NameInMap("EnableHttp2")
        public String enableHttp2;

        @NameInMap("CACertificateId")
        public String CACertificateId;

        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        @NameInMap("HealthCheckType")
        public String healthCheckType;

        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        @NameInMap("XForwardedFor_SLBID")
        public String XForwardedFor_SLBID;

        @NameInMap("XForwardedFor_ClientCertSubjectDN")
        public String XForwardedFor_ClientCertSubjectDN;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("XForwardedFor_ClientCertFingerprint")
        public String XForwardedFor_ClientCertFingerprint;

        @NameInMap("XForwardedFor")
        public String XForwardedFor;

        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        @NameInMap("XForwardedFor_SLBPORT")
        public String XForwardedFor_SLBPORT;

        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        @NameInMap("StickySessionType")
        public String stickySessionType;

        @NameInMap("XForwardedFor_ClientCertIssuerDN")
        public String XForwardedFor_ClientCertIssuerDN;

        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        @NameInMap("XForwardedFor_proto")
        public String XForwardedFor_proto;

        @NameInMap("XForwardedFor_SLBIP")
        public String XForwardedFor_SLBIP;

        @NameInMap("StickySession")
        public String stickySession;

        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        @NameInMap("TLSCipherPolicy")
        public String TLSCipherPolicy;

        @NameInMap("HealthCheck")
        public String healthCheck;

        public static DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig self = new DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientCertClientVerify(String XForwardedFor_ClientCertClientVerify) {
            this.XForwardedFor_ClientCertClientVerify = XForwardedFor_ClientCertClientVerify;
            return this;
        }
        public String getXForwardedFor_ClientCertClientVerify() {
            return this.XForwardedFor_ClientCertClientVerify;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
            this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
            return this;
        }
        public String getXForwardedFor_ClientSrcPort() {
            return this.XForwardedFor_ClientSrcPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setEnableHttp2(String enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }
        public String getEnableHttp2() {
            return this.enableHttp2;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setCACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }
        public String getCACertificateId() {
            return this.CACertificateId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
            this.XForwardedFor_SLBID = XForwardedFor_SLBID;
            return this;
        }
        public String getXForwardedFor_SLBID() {
            return this.XForwardedFor_SLBID;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientCertSubjectDN(String XForwardedFor_ClientCertSubjectDN) {
            this.XForwardedFor_ClientCertSubjectDN = XForwardedFor_ClientCertSubjectDN;
            return this;
        }
        public String getXForwardedFor_ClientCertSubjectDN() {
            return this.XForwardedFor_ClientCertSubjectDN;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientCertFingerprint(String XForwardedFor_ClientCertFingerprint) {
            this.XForwardedFor_ClientCertFingerprint = XForwardedFor_ClientCertFingerprint;
            return this;
        }
        public String getXForwardedFor_ClientCertFingerprint() {
            return this.XForwardedFor_ClientCertFingerprint;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor(String XForwardedFor) {
            this.XForwardedFor = XForwardedFor;
            return this;
        }
        public String getXForwardedFor() {
            return this.XForwardedFor;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
            this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
            return this;
        }
        public String getXForwardedFor_SLBPORT() {
            return this.XForwardedFor_SLBPORT;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientCertIssuerDN(String XForwardedFor_ClientCertIssuerDN) {
            this.XForwardedFor_ClientCertIssuerDN = XForwardedFor_ClientCertIssuerDN;
            return this;
        }
        public String getXForwardedFor_ClientCertIssuerDN() {
            return this.XForwardedFor_ClientCertIssuerDN;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_proto(String XForwardedFor_proto) {
            this.XForwardedFor_proto = XForwardedFor_proto;
            return this;
        }
        public String getXForwardedFor_proto() {
            return this.XForwardedFor_proto;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
            this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
            return this;
        }
        public String getXForwardedFor_SLBIP() {
            return this.XForwardedFor_SLBIP;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setStickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public String getStickySession() {
            return this.stickySession;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setTLSCipherPolicy(String TLSCipherPolicy) {
            this.TLSCipherPolicy = TLSCipherPolicy;
            return this;
        }
        public String getTLSCipherPolicy() {
            return this.TLSCipherPolicy;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig extends TeaModel {
        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        @NameInMap("PersistenceTimeout")
        public Integer persistenceTimeout;

        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        @NameInMap("EstablishedTimeout")
        public Integer establishedTimeout;

        @NameInMap("HealthCheckType")
        public String healthCheckType;

        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        @NameInMap("ConnectionDrain")
        public String connectionDrain;

        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        @NameInMap("HealthCheck")
        public String healthCheck;

        public static DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig self = new DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setPersistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Integer getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setEstablishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Integer getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setConnectionDrain(String connectionDrain) {
            this.connectionDrain = connectionDrain;
            return this;
        }
        public String getConnectionDrain() {
            return this.connectionDrain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig extends TeaModel {
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        @NameInMap("HealthCheckExp")
        public String healthCheckExp;

        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        @NameInMap("ConnectionDrain")
        public String connectionDrain;

        @NameInMap("HealthCheckReq")
        public String healthCheckReq;

        @NameInMap("HealthCheck")
        public String healthCheck;

        public static DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig self = new DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckExp(String healthCheckExp) {
            this.healthCheckExp = healthCheckExp;
            return this;
        }
        public String getHealthCheckExp() {
            return this.healthCheckExp;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setConnectionDrain(String connectionDrain) {
            this.connectionDrain = connectionDrain;
            return this;
        }
        public String getConnectionDrain() {
            return this.connectionDrain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckReq(String healthCheckReq) {
            this.healthCheckReq = healthCheckReq;
            return this;
        }
        public String getHealthCheckReq() {
            return this.healthCheckReq;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListeners extends TeaModel {
        @NameInMap("AclType")
        public String aclType;

        @NameInMap("Status")
        public String status;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("AclId")
        public String aclId;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("AclStatus")
        public String aclStatus;

        @NameInMap("BackendServerPort")
        public Integer backendServerPort;

        @NameInMap("HTTPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig HTTPListenerConfig;

        @NameInMap("HTTPSListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig HTTPSListenerConfig;

        @NameInMap("TCPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig TCPListenerConfig;

        @NameInMap("UDPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig UDPListenerConfig;

        public static DescribeLoadBalancerListenersResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListeners self = new DescribeLoadBalancerListenersResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setBackendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Integer getBackendServerPort() {
            return this.backendServerPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setHTTPListenerConfig(DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig HTTPListenerConfig) {
            this.HTTPListenerConfig = HTTPListenerConfig;
            return this;
        }
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig getHTTPListenerConfig() {
            return this.HTTPListenerConfig;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setHTTPSListenerConfig(DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig HTTPSListenerConfig) {
            this.HTTPSListenerConfig = HTTPSListenerConfig;
            return this;
        }
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig getHTTPSListenerConfig() {
            return this.HTTPSListenerConfig;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setTCPListenerConfig(DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig TCPListenerConfig) {
            this.TCPListenerConfig = TCPListenerConfig;
            return this;
        }
        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig getTCPListenerConfig() {
            return this.TCPListenerConfig;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setUDPListenerConfig(DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig UDPListenerConfig) {
            this.UDPListenerConfig = UDPListenerConfig;
            return this;
        }
        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig getUDPListenerConfig() {
            return this.UDPListenerConfig;
        }

    }

}
