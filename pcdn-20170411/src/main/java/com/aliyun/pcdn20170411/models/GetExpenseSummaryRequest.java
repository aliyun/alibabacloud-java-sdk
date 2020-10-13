// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetExpenseSummaryRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

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

    public static GetExpenseSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExpenseSummaryRequest self = new GetExpenseSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetExpenseSummaryRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetExpenseSummaryRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetExpenseSummaryRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetExpenseSummaryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetExpenseSummaryRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetExpenseSummaryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetExpenseSummaryRequest setIspName(String ispName) {
        this.ispName = ispName;
        return this;
    }
    public String getIspName() {
        return this.ispName;
    }

    public GetExpenseSummaryRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public GetExpenseSummaryRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
