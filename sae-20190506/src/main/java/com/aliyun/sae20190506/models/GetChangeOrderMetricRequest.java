// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetChangeOrderMetricRequest extends TeaModel {
    @NameInMap("AppSource")
    public String appSource;

    @NameInMap("CpuStrategy")
    public String cpuStrategy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("RegionId")
    public String regionId;

    public static GetChangeOrderMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderMetricRequest self = new GetChangeOrderMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderMetricRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
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
