// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasRiskInspectdetailRequest extends TeaModel {
    @NameInMap("RiskId")
    public String riskId;

    public static GetHasRiskInspectdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasRiskInspectdetailRequest self = new GetHasRiskInspectdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasRiskInspectdetailRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

}
