// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskItemdetailRequest extends TeaModel {
    @NameInMap("RiskId")
    public String riskId;

    public static QueryHasRiskItemdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskItemdetailRequest self = new QueryHasRiskItemdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskItemdetailRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

}
