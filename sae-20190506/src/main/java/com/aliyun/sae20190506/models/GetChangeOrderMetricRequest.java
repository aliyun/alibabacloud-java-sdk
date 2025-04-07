// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetChangeOrderMetricRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The SAE application type. Valid values:</p>
     * <ul>
     * <li><strong>micro_service</strong></li>
     * <li><strong>web</strong></li>
     * <li><strong>job</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>micro_service</p>
     */
    @NameInMap("AppSource")
    public String appSource;

    @NameInMap("CoType")
    public String coType;

    /**
     * <p>The CPU allocation policy. Valid values:</p>
     * <ul>
     * <li><strong>request</strong>: CPU cores are allocated only when a request is initiated.</li>
     * <li><strong>always</strong>: Fixed CPU cores are always allocated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("CpuStrategy")
    public String cpuStrategy;

    /**
     * <p>The start time when the change order was created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1661152748883</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The number of entries to return. Valid values: 0 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The field based on which you want to sort the returned entries.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>errorPercent</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetChangeOrderMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderMetricRequest self = new GetChangeOrderMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderMetricRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetChangeOrderMetricRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public GetChangeOrderMetricRequest setCoType(String coType) {
        this.coType = coType;
        return this;
    }
    public String getCoType() {
        return this.coType;
    }

    public GetChangeOrderMetricRequest setCpuStrategy(String cpuStrategy) {
        this.cpuStrategy = cpuStrategy;
        return this;
    }
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    public GetChangeOrderMetricRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetChangeOrderMetricRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetChangeOrderMetricRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetChangeOrderMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
