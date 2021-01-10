// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasRisksceneRequest extends TeaModel {
    @NameInMap("RiskSceneId")
    public String riskSceneId;

    public static DeleteHasRisksceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasRisksceneRequest self = new DeleteHasRisksceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasRisksceneRequest setRiskSceneId(String riskSceneId) {
        this.riskSceneId = riskSceneId;
        return this;
    }
    public String getRiskSceneId() {
        return this.riskSceneId;
    }

}
