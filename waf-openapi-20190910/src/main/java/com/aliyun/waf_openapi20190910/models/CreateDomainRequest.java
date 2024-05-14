// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    @NameInMap("AccessHeaderMode")
    public Integer accessHeaderMode;

    @NameInMap("AccessHeaders")
    public String accessHeaders;

    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("CloudNativeInstances")
    public String cloudNativeInstances;

    @NameInMap("ClusterType")
    public Integer clusterType;

    @NameInMap("ConnectionTime")
    public Integer connectionTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Http2Port")
    public String http2Port;

    @NameInMap("HttpPort")
    public String httpPort;

    @NameInMap("HttpToUserIp")
    public Integer httpToUserIp;

    @NameInMap("HttpsPort")
    public String httpsPort;

    @NameInMap("HttpsRedirect")
    public Integer httpsRedirect;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpFollowStatus")
    public Integer ipFollowStatus;

    /**
     * <p>This parameter is required.</p>
     */
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
    public String logHeaders;

    @NameInMap("ReadTime")
    public Integer readTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Retry")
    public Boolean retry;

    @NameInMap("SniHost")
    public String sniHost;

    @NameInMap("SniStatus")
    public Integer sniStatus;

    @NameInMap("SourceIps")
    public String sourceIps;

    @NameInMap("WriteTime")
    public Integer writeTime;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setAccessHeaderMode(Integer accessHeaderMode) {
        this.accessHeaderMode = accessHeaderMode;
        return this;
    }
    public Integer getAccessHeaderMode() {
        return this.accessHeaderMode;
    }

    public CreateDomainRequest setAccessHeaders(String accessHeaders) {
        this.accessHeaders = accessHeaders;
        return this;
    }
    public String getAccessHeaders() {
        return this.accessHeaders;
    }

    public CreateDomainRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public CreateDomainRequest setCloudNativeInstances(String cloudNativeInstances) {
        this.cloudNativeInstances = cloudNativeInstances;
        return this;
    }
    public String getCloudNativeInstances() {
        return this.cloudNativeInstances;
    }

    public CreateDomainRequest setClusterType(Integer clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public Integer getClusterType() {
        return this.clusterType;
    }

    public CreateDomainRequest setConnectionTime(Integer connectionTime) {
        this.connectionTime = connectionTime;
        return this;
    }
    public Integer getConnectionTime() {
        return this.connectionTime;
    }

    public CreateDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainRequest setHttp2Port(String http2Port) {
        this.http2Port = http2Port;
        return this;
    }
    public String getHttp2Port() {
        return this.http2Port;
    }

    public CreateDomainRequest setHttpPort(String httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public String getHttpPort() {
        return this.httpPort;
    }

    public CreateDomainRequest setHttpToUserIp(Integer httpToUserIp) {
        this.httpToUserIp = httpToUserIp;
        return this;
    }
    public Integer getHttpToUserIp() {
        return this.httpToUserIp;
    }

    public CreateDomainRequest setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public String getHttpsPort() {
        return this.httpsPort;
    }

    public CreateDomainRequest setHttpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }
    public Integer getHttpsRedirect() {
        return this.httpsRedirect;
    }

    public CreateDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDomainRequest setIpFollowStatus(Integer ipFollowStatus) {
        this.ipFollowStatus = ipFollowStatus;
        return this;
    }
    public Integer getIpFollowStatus() {
        return this.ipFollowStatus;
    }

    public CreateDomainRequest setIsAccessProduct(Integer isAccessProduct) {
        this.isAccessProduct = isAccessProduct;
        return this;
    }
    public Integer getIsAccessProduct() {
        return this.isAccessProduct;
    }

    public CreateDomainRequest setKeepalive(Boolean keepalive) {
        this.keepalive = keepalive;
        return this;
    }
    public Boolean getKeepalive() {
        return this.keepalive;
    }

    public CreateDomainRequest setKeepaliveRequests(Integer keepaliveRequests) {
        this.keepaliveRequests = keepaliveRequests;
        return this;
    }
    public Integer getKeepaliveRequests() {
        return this.keepaliveRequests;
    }

    public CreateDomainRequest setKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }
    public Integer getKeepaliveTimeout() {
        return this.keepaliveTimeout;
    }

    public CreateDomainRequest setLoadBalancing(Integer loadBalancing) {
        this.loadBalancing = loadBalancing;
        return this;
    }
    public Integer getLoadBalancing() {
        return this.loadBalancing;
    }

    public CreateDomainRequest setLogHeaders(String logHeaders) {
        this.logHeaders = logHeaders;
        return this;
    }
    public String getLogHeaders() {
        return this.logHeaders;
    }

    public CreateDomainRequest setReadTime(Integer readTime) {
        this.readTime = readTime;
        return this;
    }
    public Integer getReadTime() {
        return this.readTime;
    }

    public CreateDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDomainRequest setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public CreateDomainRequest setSniHost(String sniHost) {
        this.sniHost = sniHost;
        return this;
    }
    public String getSniHost() {
        return this.sniHost;
    }

    public CreateDomainRequest setSniStatus(Integer sniStatus) {
        this.sniStatus = sniStatus;
        return this;
    }
    public Integer getSniStatus() {
        return this.sniStatus;
    }

    public CreateDomainRequest setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }
    public String getSourceIps() {
        return this.sourceIps;
    }

    public CreateDomainRequest setWriteTime(Integer writeTime) {
        this.writeTime = writeTime;
        return this;
    }
    public Integer getWriteTime() {
        return this.writeTime;
    }

}
