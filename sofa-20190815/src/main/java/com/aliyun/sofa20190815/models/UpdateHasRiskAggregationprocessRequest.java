// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasRiskAggregationprocessRequest extends TeaModel {
    @NameInMap("AggregationRiskItemId")
    public String aggregationRiskItemId;

    public static UpdateHasRiskAggregationprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasRiskAggregationprocessRequest self = new UpdateHasRiskAggregationprocessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasRiskAggregationprocessRequest setAggregationRiskItemId(String aggregationRiskItemId) {
        this.aggregationRiskItemId = aggregationRiskItemId;
        return this;
    }
    public String getAggregationRiskItemId() {
        return this.aggregationRiskItemId;
    }

}
