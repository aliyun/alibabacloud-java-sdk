// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasRiskAggregationassociatesceneRequest extends TeaModel {
    @NameInMap("AggregationRiskItemId")
    public String aggregationRiskItemId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasRiskAggregationassociatesceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasRiskAggregationassociatesceneRequest self = new ExecHasRiskAggregationassociatesceneRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasRiskAggregationassociatesceneRequest setAggregationRiskItemId(String aggregationRiskItemId) {
        this.aggregationRiskItemId = aggregationRiskItemId;
        return this;
    }
    public String getAggregationRiskItemId() {
        return this.aggregationRiskItemId;
    }

    public ExecHasRiskAggregationassociatesceneRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
