// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskAggregationdiagplansRequest extends TeaModel {
    @NameInMap("AggregationRiskItemId")
    public String aggregationRiskItemId;

    public static QueryHasRiskAggregationdiagplansRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskAggregationdiagplansRequest self = new QueryHasRiskAggregationdiagplansRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskAggregationdiagplansRequest setAggregationRiskItemId(String aggregationRiskItemId) {
        this.aggregationRiskItemId = aggregationRiskItemId;
        return this;
    }
    public String getAggregationRiskItemId() {
        return this.aggregationRiskItemId;
    }

}
