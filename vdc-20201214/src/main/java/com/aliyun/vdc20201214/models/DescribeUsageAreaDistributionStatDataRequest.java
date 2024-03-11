// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageAreaDistributionStatDataRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ParentArea")
    public String parentArea;

    @NameInMap("StartDate")
    public String startDate;

    public static DescribeUsageAreaDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageAreaDistributionStatDataRequest self = new DescribeUsageAreaDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageAreaDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeUsageAreaDistributionStatDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeUsageAreaDistributionStatDataRequest setParentArea(String parentArea) {
        this.parentArea = parentArea;
        return this;
    }
    public String getParentArea() {
        return this.parentArea;
    }

    public DescribeUsageAreaDistributionStatDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
