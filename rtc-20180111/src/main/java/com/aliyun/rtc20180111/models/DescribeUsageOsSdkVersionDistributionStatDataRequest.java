// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageOsSdkVersionDistributionStatDataRequest extends TeaModel {
    /**
     * <p>APP ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0rbd****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615910399</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615824000</p>
     */
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
