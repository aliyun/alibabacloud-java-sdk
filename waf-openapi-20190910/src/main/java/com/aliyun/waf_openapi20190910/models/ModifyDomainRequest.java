// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyDomainRequest extends TeaModel {
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

    @NameInMap("LoadBalancing")
    public Integer loadBalancing;

    @NameInMap("HttpPort")
    public String httpPort;

    @NameInMap("HttpsPort")
    public String httpsPort;

    @NameInMap("Http2Port")
    public String http2Port;

    @NameInMap("HttpsRedirect")
    public Integer httpsRedirect;

    @NameInMap("HttpToUserIp")
    public Integer httpToUserIp;

    @NameInMap("IsAccessProduct")
    public Integer isAccessProduct;

    @NameInMap("XffHeaderMode")
    public Integer xffHeaderMode;

    @NameInMap("XffHeaders")
    public String xffHeaders;

    @NameInMap("LogHeaders")
    public String logHeaders;

    @NameInMap("BindingIpv6")
    public Integer bindingIpv6;

    @NameInMap("ClusterType")
    public Integer clusterType;

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

    public static ModifyDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainRequest self = new ModifyDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainRequest setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }
    public String getSourceIps() {
        return this.sourceIps;
    }

    public ModifyDomainRequest setLoadBalancing(Integer loadBalancing) {
        this.loadBalancing = loadBalancing;
        return this;
    }
    public Integer getLoadBalancing() {
        return this.loadBalancing;
    }

    public ModifyDomainRequest setHttpPort(String httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public String getHttpPort() {
        return this.httpPort;
    }

    public ModifyDomainRequest setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public String getHttpsPort() {
        return this.httpsPort;
    }

    public ModifyDomainRequest setHttp2Port(String http2Port) {
        this.http2Port = http2Port;
        return this;
    }
    public String getHttp2Port() {
        return this.http2Port;
    }

    public ModifyDomainRequest setHttpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }
    public Integer getHttpsRedirect() {
        return this.httpsRedirect;
    }

    public ModifyDomainRequest setHttpToUserIp(Integer httpToUserIp) {
        this.httpToUserIp = httpToUserIp;
        return this;
    }
    public Integer getHttpToUserIp() {
        return this.httpToUserIp;
    }

    public ModifyDomainRequest setIsAccessProduct(Integer isAccessProduct) {
        this.isAccessProduct = isAccessProduct;
        return this;
    }
    public Integer getIsAccessProduct() {
        return this.isAccessProduct;
    }

    public ModifyDomainRequest setXffHeaderMode(Integer xffHeaderMode) {
        this.xffHeaderMode = xffHeaderMode;
        return this;
    }
    public Integer getXffHeaderMode() {
        return this.xffHeaderMode;
    }

    public ModifyDomainRequest setXffHeaders(String xffHeaders) {
        this.xffHeaders = xffHeaders;
        return this;
    }
    public String getXffHeaders() {
        return this.xffHeaders;
    }

    public ModifyDomainRequest setLogHeaders(String logHeaders) {
        this.logHeaders = logHeaders;
        return this;
    }
    public String getLogHeaders() {
        return this.logHeaders;
    }

    public ModifyDomainRequest setBindingIpv6(Integer bindingIpv6) {
        this.bindingIpv6 = bindingIpv6;
        return this;
    }
    public Integer getBindingIpv6() {
        return this.bindingIpv6;
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

    public ModifyDomainRequest setReadTime(Integer readTime) {
        this.readTime = readTime;
        return this;
    }
    public Integer getReadTime() {
        return this.readTime;
    }

    public ModifyDomainRequest setWriteTime(Integer writeTime) {
        this.writeTime = writeTime;
        return this;
    }
    public Integer getWriteTime() {
        return this.writeTime;
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

    public ModifyDomainRequest setIpFollowStatus(Integer ipFollowStatus) {
        this.ipFollowStatus = ipFollowStatus;
        return this;
    }
    public Integer getIpFollowStatus() {
        return this.ipFollowStatus;
    }

}
