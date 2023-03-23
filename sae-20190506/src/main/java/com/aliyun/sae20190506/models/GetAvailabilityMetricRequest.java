// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetAvailabilityMetricRequest extends TeaModel {
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("RegionId")
    public String regionId;

    public static GetAvailabilityMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAvailabilityMetricRequest self = new GetAvailabilityMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetAvailabilityMetricRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetAvailabilityMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
