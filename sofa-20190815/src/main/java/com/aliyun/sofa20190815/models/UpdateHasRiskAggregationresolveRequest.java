// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasRiskAggregationresolveRequest extends TeaModel {
    @NameInMap("AggregationRiskItemId")
    public String aggregationRiskItemId;

    public static UpdateHasRiskAggregationresolveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasRiskAggregationresolveRequest self = new UpdateHasRiskAggregationresolveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasRiskAggregationresolveRequest setAggregationRiskItemId(String aggregationRiskItemId) {
        this.aggregationRiskItemId = aggregationRiskItemId;
        return this;
    }
    public String getAggregationRiskItemId() {
        return this.aggregationRiskItemId;
    }

}
