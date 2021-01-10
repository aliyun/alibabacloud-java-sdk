// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasRisksceneOrderRequest extends TeaModel {
    @NameInMap("RiskSceneId")
    public String riskSceneId;

    public static CreateHasRisksceneOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHasRisksceneOrderRequest self = new CreateHasRisksceneOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateHasRisksceneOrderRequest setRiskSceneId(String riskSceneId) {
        this.riskSceneId = riskSceneId;
        return this;
    }
    public String getRiskSceneId() {
        return this.riskSceneId;
    }

}
