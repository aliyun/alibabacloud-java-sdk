// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageOverallDataRequest extends TeaModel {
    /**
     * <p>APP ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2hz****</p>
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ONLINE_USER_PEAK</p>
     */
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
