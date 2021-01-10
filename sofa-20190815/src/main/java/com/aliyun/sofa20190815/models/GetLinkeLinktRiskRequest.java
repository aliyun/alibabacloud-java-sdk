// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktRiskRequest extends TeaModel {
    @NameInMap("RiskId")
    public String riskId;

    public static GetLinkeLinktRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktRiskRequest self = new GetLinkeLinktRiskRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktRiskRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

}
