// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetChangeOrderMetricRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The type of the Serverless App Engine (SAE) application.</p>
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

    /**
     * <p>The change order type.</p>
     * 
     * <strong>example:</strong>
     * <p>CoCreateApp</p>
     */
    @NameInMap("CoType")
    public String coType;

    /**
     * <p>The CPU allocation strategy. Valid values:</p>
     * <ul>
     * <li><strong>request</strong>: Allocates CPU resources only when requests are received.</li>
     * <li><strong>always</strong>: Always allocates a fixed amount of CPU resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("CpuStrategy")
    public String cpuStrategy;

    /**
     * <p>The start time of change order creation.</p>
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
     * <p>The field used to sort the query results.</p>
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
