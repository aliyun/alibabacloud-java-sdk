// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyDomainRequest extends TeaModel {
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

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpFollowStatus")
    public Integer ipFollowStatus;

    @NameInMap("IsAccessProduct")
    public Integer isAccessProduct;

    @NameInMap("LoadBalancing")
    public Integer loadBalancing;

    @NameInMap("LogHeaders")
    public String logHeaders;

    @NameInMap("ReadTime")
    public Integer readTime;

    @NameInMap("SniHost")
    public String sniHost;

    @NameInMap("SniStatus")
    public Integer sniStatus;

    @NameInMap("SourceIps")
    public String sourceIps;

    @NameInMap("WriteTime")
    public Integer writeTime;

    public static ModifyDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainRequest self = new ModifyDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainRequest setAccessHeaderMode(Integer accessHeaderMode) {
        this.accessHeaderMode = accessHeaderMode;
        return this;
    }
    public Integer getAccessHeaderMode() {
        return this.accessHeaderMode;
    }

    public ModifyDomainRequest setAccessHeaders(String accessHeaders) {
        this.accessHeaders = accessHeaders;
        return this;
    }
    public String getAccessHeaders() {
        return this.accessHeaders;
    }

    public ModifyDomainRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public ModifyDomainRequest setCloudNativeInstances(String cloudNativeInstances) {
        this.cloudNativeInstances = cloudNativeInstances;
        return this;
    }
    public String getCloudNativeInstances() {
        return this.cloudNativeInstances;
    }

    public ModifyDomainRequest setClusterType(Integer clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public Integer getClusterType() {
        return this.clusterType;
    }

    public ModifyDomainRequest setConnectionTime(Integer connectionTime) {
        this.connectionTime = connectionTime;
        return this;
    }
    public Integer getConnectionTime() {
        return this.connectionTime;
    }

    public ModifyDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainRequest setHttp2Port(String http2Port) {
        this.http2Port = http2Port;
        return this;
    }
    public String getHttp2Port() {
        return this.http2Port;
    }

    public ModifyDomainRequest setHttpPort(String httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public String getHttpPort() {
        return this.httpPort;
    }

    public ModifyDomainRequest setHttpToUserIp(Integer httpToUserIp) {
        this.httpToUserIp = httpToUserIp;
        return this;
    }
    public Integer getHttpToUserIp() {
        return this.httpToUserIp;
    }

    public ModifyDomainRequest setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public String getHttpsPort() {
        return this.httpsPort;
    }

    public ModifyDomainRequest setHttpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }
    public Integer getHttpsRedirect() {
        return this.httpsRedirect;
    }

    public ModifyDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDomainRequest setIpFollowStatus(Integer ipFollowStatus) {
        this.ipFollowStatus = ipFollowStatus;
        return this;
    }
    public Integer getIpFollowStatus() {
        return this.ipFollowStatus;
    }

    public ModifyDomainRequest setIsAccessProduct(Integer isAccessProduct) {
        this.isAccessProduct = isAccessProduct;
        return this;
    }
    public Integer getIsAccessProduct() {
        return this.isAccessProduct;
    }

    public ModifyDomainRequest setLoadBalancing(Integer loadBalancing) {
        this.loadBalancing = loadBalancing;
        return this;
    }
    public Integer getLoadBalancing() {
        return this.loadBalancing;
    }

    public ModifyDomainRequest setLogHeaders(String logHeaders) {
        this.logHeaders = logHeaders;
        return this;
    }
    public String getLogHeaders() {
        return this.logHeaders;
    }

    public ModifyDomainRequest setReadTime(Integer readTime) {
        this.readTime = readTime;
        return this;
    }
    public Integer getReadTime() {
        return this.readTime;
    }

    public ModifyDomainRequest setSniHost(String sniHost) {
        this.sniHost = sniHost;
        return this;
    }
    public String getSniHost() {
        return this.sniHost;
    }

    public ModifyDomainRequest setSniStatus(Integer sniStatus) {
        this.sniStatus = sniStatus;
        return this;
    }
    public Integer getSniStatus() {
        return this.sniStatus;
    }

    public ModifyDomainRequest setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }
    public String getSourceIps() {
        return this.sourceIps;
    }

    public ModifyDomainRequest setWriteTime(Integer writeTime) {
        this.writeTime = writeTime;
        return this;
    }
    public Integer getWriteTime() {
        return this.writeTime;
    }

}
