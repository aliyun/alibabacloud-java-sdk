// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityDistributionStatDataRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    // 结束时间，秒级时间戳，如1609344000
    @NameInMap("EndDate")
    public Long endDate;

    // 开始时间，秒级时间戳，如1609344000
    @NameInMap("StartDate")
    public Long startDate;

    // 统计维度，支持最多填入一个 CHANNEL_ONLINE, NETWORK, OS
    @NameInMap("StatDim")
    public String statDim;

    public static DescribeQualityDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityDistributionStatDataRequest self = new DescribeQualityDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQualityDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeQualityDistributionStatDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeQualityDistributionStatDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeQualityDistributionStatDataRequest setStatDim(String statDim) {
        this.statDim = statDim;
        return this;
    }
    public String getStatDim() {
        return this.statDim;
    }

}
