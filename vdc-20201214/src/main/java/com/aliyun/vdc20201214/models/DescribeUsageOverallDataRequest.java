// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageOverallDataRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("Types")
    public String types;

    public static DescribeUsageOverallDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOverallDataRequest self = new DescribeUsageOverallDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOverallDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeUsageOverallDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeUsageOverallDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeUsageOverallDataRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
