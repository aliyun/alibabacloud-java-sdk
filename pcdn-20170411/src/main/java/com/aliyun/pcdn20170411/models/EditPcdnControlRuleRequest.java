// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class EditPcdnControlRuleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

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

    public static EditPcdnControlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EditPcdnControlRuleRequest self = new EditPcdnControlRuleRequest();
        return TeaModel.build(map, self);
    }

    public EditPcdnControlRuleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public EditPcdnControlRuleRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public EditPcdnControlRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EditPcdnControlRuleRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public EditPcdnControlRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public EditPcdnControlRuleRequest setIspName(String ispName) {
        this.ispName = ispName;
        return this;
    }
    public String getIspName() {
        return this.ispName;
    }

    public EditPcdnControlRuleRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public EditPcdnControlRuleRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public EditPcdnControlRuleRequest setMarket(String market) {
        this.market = market;
        return this;
    }
    public String getMarket() {
        return this.market;
    }

    public EditPcdnControlRuleRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

}
