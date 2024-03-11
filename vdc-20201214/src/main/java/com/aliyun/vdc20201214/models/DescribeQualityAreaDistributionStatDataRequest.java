// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityAreaDistributionStatDataRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("ParentArea")
    public String parentArea;

    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeQualityAreaDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityAreaDistributionStatDataRequest self = new DescribeQualityAreaDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQualityAreaDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeQualityAreaDistributionStatDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeQualityAreaDistributionStatDataRequest setParentArea(String parentArea) {
        this.parentArea = parentArea;
        return this;
    }
    public String getParentArea() {
        return this.parentArea;
    }

    public DescribeQualityAreaDistributionStatDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
