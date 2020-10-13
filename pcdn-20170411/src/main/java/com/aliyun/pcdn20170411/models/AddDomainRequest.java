// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class AddDomainRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("LiveFormat")
    public String liveFormat;

    @NameInMap("SliceDomain")
    public String sliceDomain;

    @NameInMap("Region")
    public String region;

    @NameInMap("DemoUrls")
    public String demoUrls;

    public static AddDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRequest self = new AddDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddDomainRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AddDomainRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public AddDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddDomainRequest setLiveFormat(String liveFormat) {
        this.liveFormat = liveFormat;
        return this;
    }
    public String getLiveFormat() {
        return this.liveFormat;
    }

    public AddDomainRequest setSliceDomain(String sliceDomain) {
        this.sliceDomain = sliceDomain;
        return this;
    }
    public String getSliceDomain() {
        return this.sliceDomain;
    }

    public AddDomainRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddDomainRequest setDemoUrls(String demoUrls) {
        this.demoUrls = demoUrls;
        return this;
    }
    public String getDemoUrls() {
        return this.demoUrls;
    }

}
