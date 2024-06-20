// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityAreaDistributionStatDataRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("ParentArea")
    public String parentArea;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615824000</p>
     */
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
