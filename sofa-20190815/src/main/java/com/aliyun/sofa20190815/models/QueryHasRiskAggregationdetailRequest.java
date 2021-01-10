// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskAggregationdetailRequest extends TeaModel {
    @NameInMap("AggregationRiskItemId")
    public String aggregationRiskItemId;

    public static QueryHasRiskAggregationdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskAggregationdetailRequest self = new QueryHasRiskAggregationdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskAggregationdetailRequest setAggregationRiskItemId(String aggregationRiskItemId) {
        this.aggregationRiskItemId = aggregationRiskItemId;
        return this;
    }
    public String getAggregationRiskItemId() {
        return this.aggregationRiskItemId;
    }

}
