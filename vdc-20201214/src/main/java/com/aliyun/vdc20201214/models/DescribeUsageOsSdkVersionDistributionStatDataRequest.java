// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageOsSdkVersionDistributionStatDataRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    // 结束时间，秒级时间戳：1609344000
    @NameInMap("EndDate")
    public Long endDate;

    // 开始时间，秒级时间戳：1609344000
    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeUsageOsSdkVersionDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOsSdkVersionDistributionStatDataRequest self = new DescribeUsageOsSdkVersionDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOsSdkVersionDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeUsageOsSdkVersionDistributionStatDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeUsageOsSdkVersionDistributionStatDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
