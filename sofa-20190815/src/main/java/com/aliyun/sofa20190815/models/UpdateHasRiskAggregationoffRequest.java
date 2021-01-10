// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasRiskAggregationoffRequest extends TeaModel {
    @NameInMap("AggregationRiskItemId")
    public String aggregationRiskItemId;

    public static UpdateHasRiskAggregationoffRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasRiskAggregationoffRequest self = new UpdateHasRiskAggregationoffRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasRiskAggregationoffRequest setAggregationRiskItemId(String aggregationRiskItemId) {
        this.aggregationRiskItemId = aggregationRiskItemId;
        return this;
    }
    public String getAggregationRiskItemId() {
        return this.aggregationRiskItemId;
    }

}
