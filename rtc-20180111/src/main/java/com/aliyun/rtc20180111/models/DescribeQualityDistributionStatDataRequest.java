// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityDistributionStatDataRequest extends TeaModel {
    /**
     * <p>APP ID</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>This parameter is required.</p>
     */
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
