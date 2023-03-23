// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetChangeOrderMetricRequest extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("RegionId")
    public String regionId;

    public static GetChangeOrderMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderMetricRequest self = new GetChangeOrderMetricRequest();
        return TeaModel.build(map, self);
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
