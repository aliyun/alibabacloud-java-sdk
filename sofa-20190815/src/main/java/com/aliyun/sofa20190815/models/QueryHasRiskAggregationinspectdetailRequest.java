// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskAggregationinspectdetailRequest extends TeaModel {
    @NameInMap("RiskId")
    public String riskId;

    public static QueryHasRiskAggregationinspectdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskAggregationinspectdetailRequest self = new QueryHasRiskAggregationinspectdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskAggregationinspectdetailRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

}
