// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainResponseBody extends TeaModel {
    @NameInMap("Domain")
    public DescribeDomainResponseBodyDomain domain;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResponseBody self = new DescribeDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResponseBody setDomain(DescribeDomainResponseBodyDomain domain) {
        this.domain = domain;
        return this;
    }
    public DescribeDomainResponseBodyDomain getDomain() {
        return this.domain;
    }

    public DescribeDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs extends TeaModel {
        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs self = new DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs setPorts(java.util.List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeDomainResponseBodyDomainCloudNativeInstances extends TeaModel {
        @NameInMap("CloudNativeProductName")
        public String cloudNativeProductName;

        @NameInMap("IPAddressList")
        public java.util.List<String> IPAddressList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProtocolPortConfigs")
        public java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs> protocolPortConfigs;

        @NameInMap("RedirectionTypeName")
        public String redirectionTypeName;

        public static DescribeDomainResponseBodyDomainCloudNativeInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResponseBodyDomainCloudNativeInstances self = new DescribeDomainResponseBodyDomainCloudNativeInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstances setCloudNativeProductName(String cloudNativeProductName) {
            this.cloudNativeProductName = cloudNativeProductName;
            return this;
        }
        public String getCloudNativeProductName() {
            return this.cloudNativeProductName;
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstances setIPAddressList(java.util.List<String> IPAddressList) {
            this.IPAddressList = IPAddressList;
            return this;
        }
        public java.util.List<String> getIPAddressList() {
            return this.IPAddressList;
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstances setProtocolPortConfigs(java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs> protocolPortConfigs) {
            this.protocolPortConfigs = protocolPortConfigs;
            return this;
        }
        public java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs> getProtocolPortConfigs() {
            return this.protocolPortConfigs;
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstances setRedirectionTypeName(String redirectionTypeName) {
            this.redirectionTypeName = redirectionTypeName;
            return this;
        }
        public String getRedirectionTypeName() {
            return this.redirectionTypeName;
        }

    }

    public static class DescribeDomainResponseBodyDomainLogHeaders extends TeaModel {
        @NameInMap("k")
        public String k;

        @NameInMap("v")
        public String v;

        public static DescribeDomainResponseBodyDomainLogHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResponseBodyDomainLogHeaders self = new DescribeDomainResponseBodyDomainLogHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResponseBodyDomainLogHeaders setK(String k) {
            this.k = k;
            return this;
        }
        public String getK() {
            return this.k;
        }

        public DescribeDomainResponseBodyDomainLogHeaders setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class DescribeDomainResponseBodyDomain extends TeaModel {
        @NameInMap("AccessHeaderMode")
        public Integer accessHeaderMode;

        @NameInMap("AccessHeaders")
        public java.util.List<String> accessHeaders;

        @NameInMap("AccessType")
        public String accessType;

        @NameInMap("CloudNativeInstances")
        public java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstances> cloudNativeInstances;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("ConnectionTime")
        public Integer connectionTime;

        @NameInMap("Http2Port")
        public java.util.List<Integer> http2Port;

        @NameInMap("HttpPort")
        public java.util.List<Integer> httpPort;

        @NameInMap("HttpToUserIp")
        public Integer httpToUserIp;

        @NameInMap("HttpsPort")
        public java.util.List<Integer> httpsPort;

        @NameInMap("HttpsRedirect")
        public Integer httpsRedirect;

        @NameInMap("IpFollowStatus")
        public Integer ipFollowStatus;

        @NameInMap("IsAccessProduct")
        public Integer isAccessProduct;

        @NameInMap("Keepalive")
        public Boolean keepalive;

        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        @NameInMap("LoadBalancing")
        public Integer loadBalancing;

        @NameInMap("LogHeaders")
        public java.util.List<DescribeDomainResponseBodyDomainLogHeaders> logHeaders;

        @NameInMap("ReadTime")
        public Integer readTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Retry")
        public Boolean retry;

        @NameInMap("SniHost")
        public String sniHost;

        @NameInMap("SniStatus")
        public Integer sniStatus;

        @NameInMap("SourceIps")
        public java.util.List<String> sourceIps;

        @NameInMap("Version")
        public Long version;

        @NameInMap("WriteTime")
        public Integer writeTime;

        public static DescribeDomainResponseBodyDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResponseBodyDomain self = new DescribeDomainResponseBodyDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResponseBodyDomain setAccessHeaderMode(Integer accessHeaderMode) {
            this.accessHeaderMode = accessHeaderMode;
            return this;
        }
        public Integer getAccessHeaderMode() {
            return this.accessHeaderMode;
        }

        public DescribeDomainResponseBodyDomain setAccessHeaders(java.util.List<String> accessHeaders) {
            this.accessHeaders = accessHeaders;
            return this;
        }
        public java.util.List<String> getAccessHeaders() {
            return this.accessHeaders;
        }

        public DescribeDomainResponseBodyDomain setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeDomainResponseBodyDomain setCloudNativeInstances(java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstances> cloudNativeInstances) {
            this.cloudNativeInstances = cloudNativeInstances;
            return this;
        }
        public java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstances> getCloudNativeInstances() {
            return this.cloudNativeInstances;
        }

        public DescribeDomainResponseBodyDomain setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public DescribeDomainResponseBodyDomain setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainResponseBodyDomain setConnectionTime(Integer connectionTime) {
            this.connectionTime = connectionTime;
            return this;
        }
        public Integer getConnectionTime() {
            return this.connectionTime;
        }

        public DescribeDomainResponseBodyDomain setHttp2Port(java.util.List<Integer> http2Port) {
            this.http2Port = http2Port;
            return this;
        }
        public java.util.List<Integer> getHttp2Port() {
            return this.http2Port;
        }

        public DescribeDomainResponseBodyDomain setHttpPort(java.util.List<Integer> httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public java.util.List<Integer> getHttpPort() {
            return this.httpPort;
        }

        public DescribeDomainResponseBodyDomain setHttpToUserIp(Integer httpToUserIp) {
            this.httpToUserIp = httpToUserIp;
            return this;
        }
        public Integer getHttpToUserIp() {
            return this.httpToUserIp;
        }

        public DescribeDomainResponseBodyDomain setHttpsPort(java.util.List<Integer> httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public java.util.List<Integer> getHttpsPort() {
            return this.httpsPort;
        }

        public DescribeDomainResponseBodyDomain setHttpsRedirect(Integer httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }
        public Integer getHttpsRedirect() {
            return this.httpsRedirect;
        }

        public DescribeDomainResponseBodyDomain setIpFollowStatus(Integer ipFollowStatus) {
            this.ipFollowStatus = ipFollowStatus;
            return this;
        }
        public Integer getIpFollowStatus() {
            return this.ipFollowStatus;
        }

        public DescribeDomainResponseBodyDomain setIsAccessProduct(Integer isAccessProduct) {
            this.isAccessProduct = isAccessProduct;
            return this;
        }
        public Integer getIsAccessProduct() {
            return this.isAccessProduct;
        }

        public DescribeDomainResponseBodyDomain setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public DescribeDomainResponseBodyDomain setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public DescribeDomainResponseBodyDomain setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public DescribeDomainResponseBodyDomain setLoadBalancing(Integer loadBalancing) {
            this.loadBalancing = loadBalancing;
            return this;
        }
        public Integer getLoadBalancing() {
            return this.loadBalancing;
        }

        public DescribeDomainResponseBodyDomain setLogHeaders(java.util.List<DescribeDomainResponseBodyDomainLogHeaders> logHeaders) {
            this.logHeaders = logHeaders;
            return this;
        }
        public java.util.List<DescribeDomainResponseBodyDomainLogHeaders> getLogHeaders() {
            return this.logHeaders;
        }

        public DescribeDomainResponseBodyDomain setReadTime(Integer readTime) {
            this.readTime = readTime;
            return this;
        }
        public Integer getReadTime() {
            return this.readTime;
        }

        public DescribeDomainResponseBodyDomain setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDomainResponseBodyDomain setRetry(Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Boolean getRetry() {
            return this.retry;
        }

        public DescribeDomainResponseBodyDomain setSniHost(String sniHost) {
            this.sniHost = sniHost;
            return this;
        }
        public String getSniHost() {
            return this.sniHost;
        }

        public DescribeDomainResponseBodyDomain setSniStatus(Integer sniStatus) {
            this.sniStatus = sniStatus;
            return this;
        }
        public Integer getSniStatus() {
            return this.sniStatus;
        }

        public DescribeDomainResponseBodyDomain setSourceIps(java.util.List<String> sourceIps) {
            this.sourceIps = sourceIps;
            return this;
        }
        public java.util.List<String> getSourceIps() {
            return this.sourceIps;
        }

        public DescribeDomainResponseBodyDomain setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDomainResponseBodyDomain setWriteTime(Integer writeTime) {
            this.writeTime = writeTime;
            return this;
        }
        public Integer getWriteTime() {
            return this.writeTime;
        }

    }

}
