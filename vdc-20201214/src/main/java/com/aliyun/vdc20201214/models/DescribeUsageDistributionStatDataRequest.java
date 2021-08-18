// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageDistributionStatDataRequest extends TeaModel {
    // 开始时间，秒级时间戳：如1609344000
    @NameInMap("StartDate")
    public Long startDate;

    // 结束时间，秒级时间戳：如1609344000
    @NameInMap("EndDate")
    public Long endDate;

    // 统计维度，支持最多填入一个 CHANNEL_ONLINE, NETWORK, OS
    @NameInMap("StatDim")
    public String statDim;

    // APP ID
    @NameInMap("AppId")
    public String appId;

    public static DescribeUsageDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageDistributionStatDataRequest self = new DescribeUsageDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageDistributionStatDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeUsageDistributionStatDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeUsageDistributionStatDataRequest setStatDim(String statDim) {
        this.statDim = statDim;
        return this;
    }
    public String getStatDim() {
        return this.statDim;
    }

    public DescribeUsageDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
