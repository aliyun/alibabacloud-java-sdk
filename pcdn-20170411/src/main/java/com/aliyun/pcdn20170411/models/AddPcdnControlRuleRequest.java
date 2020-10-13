// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class AddPcdnControlRuleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("IspName")
    @Validation(required = true)
    public String ispName;

    @NameInMap("PlatformType")
    @Validation(required = true)
    public String platformType;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("Market")
    @Validation(required = true)
    public String market;

    @NameInMap("AppVersion")
    @Validation(required = true)
    public String appVersion;

    public static AddPcdnControlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPcdnControlRuleRequest self = new AddPcdnControlRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddPcdnControlRuleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddPcdnControlRuleRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AddPcdnControlRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddPcdnControlRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddPcdnControlRuleRequest setIspName(String ispName) {
        this.ispName = ispName;
        return this;
    }
    public String getIspName() {
        return this.ispName;
    }

    public AddPcdnControlRuleRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public AddPcdnControlRuleRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public AddPcdnControlRuleRequest setMarket(String market) {
        this.market = market;
        return this;
    }
    public String getMarket() {
        return this.market;
    }

    public AddPcdnControlRuleRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

}
