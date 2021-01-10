// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasRiskSceneRequest extends TeaModel {
    @NameInMap("RiskSceneId")
    public String riskSceneId;

    public static GetHasRiskSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasRiskSceneRequest self = new GetHasRiskSceneRequest();
        return TeaModel.build(map, self);
    }

    public GetHasRiskSceneRequest setRiskSceneId(String riskSceneId) {
        this.riskSceneId = riskSceneId;
        return this;
    }
    public String getRiskSceneId() {
        return this.riskSceneId;
    }

}
