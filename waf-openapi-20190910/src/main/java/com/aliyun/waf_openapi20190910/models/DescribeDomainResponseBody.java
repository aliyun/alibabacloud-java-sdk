// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Domain")
    public DescribeDomainResponseBodyDomain domain;

    public static DescribeDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResponseBody self = new DescribeDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainResponseBody setDomain(DescribeDomainResponseBodyDomain domain) {
        this.domain = domain;
        return this;
    }
    public DescribeDomainResponseBodyDomain getDomain() {
        return this.domain;
    }

    public static class DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Ports")
        public String ports;

        public static DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs self = new DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

    }

    public static class DescribeDomainResponseBodyDomainCloudNativeInstances extends TeaModel {
        @NameInMap("ProtocolPortConfigs")
        public java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstancesProtocolPortConfigs> protocolPortConfigs;

        @NameInMap("RedirectionTypeName")
        public String redirectionTypeName;

        @NameInMap("CloudNativeProductName")
        public String cloudNativeProductName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IPAddressList")
        public String IPAddressList;

        public static DescribeDomainResponseBodyDomainCloudNativeInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResponseBodyDomainCloudNativeInstances self = new DescribeDomainResponseBodyDomainCloudNativeInstances();
            return TeaModel.build(map, self);
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

        public DescribeDomainResponseBodyDomainCloudNativeInstances setCloudNativeProductName(String cloudNativeProductName) {
            this.cloudNativeProductName = cloudNativeProductName;
            return this;
        }
        public String getCloudNativeProductName() {
            return this.cloudNativeProductName;
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainResponseBodyDomainCloudNativeInstances setIPAddressList(String IPAddressList) {
            this.IPAddressList = IPAddressList;
            return this;
        }
        public String getIPAddressList() {
            return this.IPAddressList;
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
        @NameInMap("Http2Port")
        public java.util.List<String> http2Port;

        @NameInMap("CloudNativeInstances")
        public java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstances> cloudNativeInstances;

        @NameInMap("HttpToUserIp")
        public Integer httpToUserIp;

        @NameInMap("HttpPort")
        public java.util.List<String> httpPort;

        @NameInMap("LogHeaders")
        public java.util.List<DescribeDomainResponseBodyDomainLogHeaders> logHeaders;

        @NameInMap("IsAccessProduct")
        public Integer isAccessProduct;

        @NameInMap("HttpsRedirect")
        public Integer httpsRedirect;

        @NameInMap("LoadBalancing")
        public Integer loadBalancing;

        @NameInMap("IpFollowStatus")
        public Integer ipFollowStatus;

        @NameInMap("AccessType")
        public String accessType;

        @NameInMap("Version")
        public Long version;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("WriteTime")
        public Integer writeTime;

        @NameInMap("ReadTime")
        public Integer readTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("SourceIps")
        public java.util.List<String> sourceIps;

        @NameInMap("ConnectionTime")
        public Integer connectionTime;

        @NameInMap("HttpsPort")
        public java.util.List<String> httpsPort;

        public static DescribeDomainResponseBodyDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResponseBodyDomain self = new DescribeDomainResponseBodyDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResponseBodyDomain setHttp2Port(java.util.List<String> http2Port) {
            this.http2Port = http2Port;
            return this;
        }
        public java.util.List<String> getHttp2Port() {
            return this.http2Port;
        }

        public DescribeDomainResponseBodyDomain setCloudNativeInstances(java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstances> cloudNativeInstances) {
            this.cloudNativeInstances = cloudNativeInstances;
            return this;
        }
        public java.util.List<DescribeDomainResponseBodyDomainCloudNativeInstances> getCloudNativeInstances() {
            return this.cloudNativeInstances;
        }

        public DescribeDomainResponseBodyDomain setHttpToUserIp(Integer httpToUserIp) {
            this.httpToUserIp = httpToUserIp;
            return this;
        }
        public Integer getHttpToUserIp() {
            return this.httpToUserIp;
        }

        public DescribeDomainResponseBodyDomain setHttpPort(java.util.List<String> httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public java.util.List<String> getHttpPort() {
            return this.httpPort;
        }

        public DescribeDomainResponseBodyDomain setLogHeaders(java.util.List<DescribeDomainResponseBodyDomainLogHeaders> logHeaders) {
            this.logHeaders = logHeaders;
            return this;
        }
        public java.util.List<DescribeDomainResponseBodyDomainLogHeaders> getLogHeaders() {
            return this.logHeaders;
        }

        public DescribeDomainResponseBodyDomain setIsAccessProduct(Integer isAccessProduct) {
            this.isAccessProduct = isAccessProduct;
            return this;
        }
        public Integer getIsAccessProduct() {
            return this.isAccessProduct;
        }

        public DescribeDomainResponseBodyDomain setHttpsRedirect(Integer httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }
        public Integer getHttpsRedirect() {
            return this.httpsRedirect;
        }

        public DescribeDomainResponseBodyDomain setLoadBalancing(Integer loadBalancing) {
            this.loadBalancing = loadBalancing;
            return this;
        }
        public Integer getLoadBalancing() {
            return this.loadBalancing;
        }

        public DescribeDomainResponseBodyDomain setIpFollowStatus(Integer ipFollowStatus) {
            this.ipFollowStatus = ipFollowStatus;
            return this;
        }
        public Integer getIpFollowStatus() {
            return this.ipFollowStatus;
        }

        public DescribeDomainResponseBodyDomain setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeDomainResponseBodyDomain setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDomainResponseBodyDomain setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public DescribeDomainResponseBodyDomain setWriteTime(Integer writeTime) {
            this.writeTime = writeTime;
            return this;
        }
        public Integer getWriteTime() {
            return this.writeTime;
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

        public DescribeDomainResponseBodyDomain setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainResponseBodyDomain setSourceIps(java.util.List<String> sourceIps) {
            this.sourceIps = sourceIps;
            return this;
        }
        public java.util.List<String> getSourceIps() {
            return this.sourceIps;
        }

        public DescribeDomainResponseBodyDomain setConnectionTime(Integer connectionTime) {
            this.connectionTime = connectionTime;
            return this;
        }
        public Integer getConnectionTime() {
            return this.connectionTime;
        }

        public DescribeDomainResponseBodyDomain setHttpsPort(java.util.List<String> httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public java.util.List<String> getHttpsPort() {
            return this.httpsPort;
        }

    }

}
