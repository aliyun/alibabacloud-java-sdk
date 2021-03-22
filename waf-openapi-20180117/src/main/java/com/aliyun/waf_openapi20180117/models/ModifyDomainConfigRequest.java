// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyDomainConfigRequest extends TeaModel {
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

    public static ModifyDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainConfigRequest self = new ModifyDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyDomainConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDomainConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainConfigRequest setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }
    public String getSourceIps() {
        return this.sourceIps;
    }

    public ModifyDomainConfigRequest setHttpPort(String httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public String getHttpPort() {
        return this.httpPort;
    }

    public ModifyDomainConfigRequest setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public String getHttpsPort() {
        return this.httpsPort;
    }

    public ModifyDomainConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDomainConfigRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyDomainConfigRequest setIsAccessProduct(Integer isAccessProduct) {
        this.isAccessProduct = isAccessProduct;
        return this;
    }
    public Integer getIsAccessProduct() {
        return this.isAccessProduct;
    }

    public ModifyDomainConfigRequest setProtocols(String protocols) {
        this.protocols = protocols;
        return this;
    }
    public String getProtocols() {
        return this.protocols;
    }

    public ModifyDomainConfigRequest setLoadBalancing(Integer loadBalancing) {
        this.loadBalancing = loadBalancing;
        return this;
    }
    public Integer getLoadBalancing() {
        return this.loadBalancing;
    }

    public ModifyDomainConfigRequest setHttpToUserIp(Integer httpToUserIp) {
        this.httpToUserIp = httpToUserIp;
        return this;
    }
    public Integer getHttpToUserIp() {
        return this.httpToUserIp;
    }

    public ModifyDomainConfigRequest setHttpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }
    public Integer getHttpsRedirect() {
        return this.httpsRedirect;
    }

}
