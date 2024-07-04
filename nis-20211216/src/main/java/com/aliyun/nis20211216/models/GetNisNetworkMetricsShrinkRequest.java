// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkMetricsShrinkRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <strong>example:</strong>
     * <p>1638239092000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dimensions")
    public String dimensionsShrink;

    /**
     * <strong>example:</strong>
     * <p>1684373700099</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessInternetIPV4</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>TimestampAscending</p>
     */
    @NameInMap("ScanBy")
    public String scanBy;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCrossAccount")
    public Boolean useCrossAccount;

    public static GetNisNetworkMetricsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkMetricsShrinkRequest self = new GetNisNetworkMetricsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkMetricsShrinkRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public GetNisNetworkMetricsShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetNisNetworkMetricsShrinkRequest setDimensionsShrink(String dimensionsShrink) {
        this.dimensionsShrink = dimensionsShrink;
        return this;
    }
    public String getDimensionsShrink() {
        return this.dimensionsShrink;
    }

    public GetNisNetworkMetricsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetNisNetworkMetricsShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetNisNetworkMetricsShrinkRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public GetNisNetworkMetricsShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetNisNetworkMetricsShrinkRequest setScanBy(String scanBy) {
        this.scanBy = scanBy;
        return this;
    }
    public String getScanBy() {
        return this.scanBy;
    }

    public GetNisNetworkMetricsShrinkRequest setUseCrossAccount(Boolean useCrossAccount) {
        this.useCrossAccount = useCrossAccount;
        return this;
    }
    public Boolean getUseCrossAccount() {
        return this.useCrossAccount;
    }

}
