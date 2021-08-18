// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityOsSdkVersionDistributionStatDataRequest extends TeaModel {
    // 开始时间，秒级时间戳，如1609344000
    @NameInMap("StartDate")
    public Long startDate;

    // 结束时间，秒级时间戳，如1609344000
    @NameInMap("EndDate")
    public Long endDate;

    // APP ID
    @NameInMap("AppId")
    public String appId;

    public static DescribeQualityOsSdkVersionDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityOsSdkVersionDistributionStatDataRequest self = new DescribeQualityOsSdkVersionDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQualityOsSdkVersionDistributionStatDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeQualityOsSdkVersionDistributionStatDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeQualityOsSdkVersionDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
