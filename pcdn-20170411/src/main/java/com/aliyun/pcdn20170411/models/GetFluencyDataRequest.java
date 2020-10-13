// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFluencyDataRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("Domain")
    public String domain;

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

    @NameInMap("StartDate")
    @Validation(required = true)
    public String startDate;

    @NameInMap("EndDate")
    @Validation(required = true)
    public String endDate;

    public static GetFluencyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFluencyDataRequest self = new GetFluencyDataRequest();
        return TeaModel.build(map, self);
    }

    public GetFluencyDataRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetFluencyDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetFluencyDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetFluencyDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetFluencyDataRequest setIspName(String ispName) {
        this.ispName = ispName;
        return this;
    }
    public String getIspName() {
        return this.ispName;
    }

    public GetFluencyDataRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public GetFluencyDataRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetFluencyDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetFluencyDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
