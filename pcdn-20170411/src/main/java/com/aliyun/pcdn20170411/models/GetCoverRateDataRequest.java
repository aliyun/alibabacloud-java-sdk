// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetCoverRateDataRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Region")
    public String region;

    @NameInMap("IspName")
    public String ispName;

    @NameInMap("PlatformType")
    public String platformType;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    public static GetCoverRateDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCoverRateDataRequest self = new GetCoverRateDataRequest();
        return TeaModel.build(map, self);
    }

    public GetCoverRateDataRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetCoverRateDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetCoverRateDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetCoverRateDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetCoverRateDataRequest setIspName(String ispName) {
        this.ispName = ispName;
        return this;
    }
    public String getIspName() {
        return this.ispName;
    }

    public GetCoverRateDataRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public GetCoverRateDataRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetCoverRateDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetCoverRateDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
