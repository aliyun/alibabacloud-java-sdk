// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("SourceIps")
    public String sourceIps;

    @NameInMap("IsAccessProduct")
    public Integer isAccessProduct;

    @NameInMap("LoadBalancing")
    public Integer loadBalancing;

    @NameInMap("LogHeaders")
    public String logHeaders;

    @NameInMap("HttpPort")
    public String httpPort;

    @NameInMap("HttpsPort")
    public String httpsPort;

    @NameInMap("Http2Port")
    public String http2Port;

    @NameInMap("HttpToUserIp")
    public Integer httpToUserIp;

    @NameInMap("HttpsRedirect")
    public Integer httpsRedirect;

    @NameInMap("ClusterType")
    public Integer clusterType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ConnectionTime")
    public Integer connectionTime;

    @NameInMap("ReadTime")
    public Integer readTime;

    @NameInMap("WriteTime")
    public Integer writeTime;

    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("CloudNativeInstances")
    public String cloudNativeInstances;

    @NameInMap("IpFollowStatus")
    public Integer ipFollowStatus;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainRequest setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }
    public String getSourceIps() {
        return this.sourceIps;
    }

    public CreateDomainRequest setIsAccessProduct(Integer isAccessProduct) {
        this.isAccessProduct = isAccessProduct;
        return this;
    }
    public Integer getIsAccessProduct() {
        return this.isAccessProduct;
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

    public CreateDomainRequest setHttpPort(String httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public String getHttpPort() {
        return this.httpPort;
    }

    public CreateDomainRequest setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public String getHttpsPort() {
        return this.httpsPort;
    }

    public CreateDomainRequest setHttp2Port(String http2Port) {
        this.http2Port = http2Port;
        return this;
    }
    public String getHttp2Port() {
        return this.http2Port;
    }

    public CreateDomainRequest setHttpToUserIp(Integer httpToUserIp) {
        this.httpToUserIp = httpToUserIp;
        return this;
    }
    public Integer getHttpToUserIp() {
        return this.httpToUserIp;
    }

    public CreateDomainRequest setHttpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }
    public Integer getHttpsRedirect() {
        return this.httpsRedirect;
    }

    public CreateDomainRequest setClusterType(Integer clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public Integer getClusterType() {
        return this.clusterType;
    }

    public CreateDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDomainRequest setConnectionTime(Integer connectionTime) {
        this.connectionTime = connectionTime;
        return this;
    }
    public Integer getConnectionTime() {
        return this.connectionTime;
    }

    public CreateDomainRequest setReadTime(Integer readTime) {
        this.readTime = readTime;
        return this;
    }
    public Integer getReadTime() {
        return this.readTime;
    }

    public CreateDomainRequest setWriteTime(Integer writeTime) {
        this.writeTime = writeTime;
        return this;
    }
    public Integer getWriteTime() {
        return this.writeTime;
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

    public CreateDomainRequest setIpFollowStatus(Integer ipFollowStatus) {
        this.ipFollowStatus = ipFollowStatus;
        return this;
    }
    public Integer getIpFollowStatus() {
        return this.ipFollowStatus;
    }

}
