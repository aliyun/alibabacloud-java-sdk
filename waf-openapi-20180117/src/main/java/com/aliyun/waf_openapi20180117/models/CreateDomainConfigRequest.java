// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateDomainConfigRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("SourceIps")
    public String sourceIps;

    @NameInMap("HttpPort")
    public String httpPort;

    @NameInMap("HttpsPort")
    public String httpsPort;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("IsAccessProduct")
    public Integer isAccessProduct;

    @NameInMap("Protocols")
    public String protocols;

    @NameInMap("LoadBalancing")
    public Integer loadBalancing;

    @NameInMap("HttpToUserIp")
    public Integer httpToUserIp;

    @NameInMap("HttpsRedirect")
    public Integer httpsRedirect;

    @NameInMap("RsType")
    public Integer rsType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainConfigRequest self = new CreateDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateDomainConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDomainConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainConfigRequest setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }
    public String getSourceIps() {
        return this.sourceIps;
    }

    public CreateDomainConfigRequest setHttpPort(String httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public String getHttpPort() {
        return this.httpPort;
    }

    public CreateDomainConfigRequest setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public String getHttpsPort() {
        return this.httpsPort;
    }

    public CreateDomainConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDomainConfigRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateDomainConfigRequest setIsAccessProduct(Integer isAccessProduct) {
        this.isAccessProduct = isAccessProduct;
        return this;
    }
    public Integer getIsAccessProduct() {
        return this.isAccessProduct;
    }

    public CreateDomainConfigRequest setProtocols(String protocols) {
        this.protocols = protocols;
        return this;
    }
    public String getProtocols() {
        return this.protocols;
    }

    public CreateDomainConfigRequest setLoadBalancing(Integer loadBalancing) {
        this.loadBalancing = loadBalancing;
        return this;
    }
    public Integer getLoadBalancing() {
        return this.loadBalancing;
    }

    public CreateDomainConfigRequest setHttpToUserIp(Integer httpToUserIp) {
        this.httpToUserIp = httpToUserIp;
        return this;
    }
    public Integer getHttpToUserIp() {
        return this.httpToUserIp;
    }

    public CreateDomainConfigRequest setHttpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }
    public Integer getHttpsRedirect() {
        return this.httpsRedirect;
    }

    public CreateDomainConfigRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public CreateDomainConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
