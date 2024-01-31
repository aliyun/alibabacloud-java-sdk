// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityOsSdkVersionDistributionStatDataRequest extends TeaModel {
    /**
     * <p>APP ID</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeQualityOsSdkVersionDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityOsSdkVersionDistributionStatDataRequest self = new DescribeQualityOsSdkVersionDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQualityOsSdkVersionDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeQualityOsSdkVersionDistributionStatDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeQualityOsSdkVersionDistributionStatDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
