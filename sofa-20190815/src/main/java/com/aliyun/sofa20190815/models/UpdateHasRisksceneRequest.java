// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasRisksceneRequest extends TeaModel {
    @NameInMap("RiskSceneId")
    public String riskSceneId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasRisksceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasRisksceneRequest self = new UpdateHasRisksceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasRisksceneRequest setRiskSceneId(String riskSceneId) {
        this.riskSceneId = riskSceneId;
        return this;
    }
    public String getRiskSceneId() {
        return this.riskSceneId;
    }

    public UpdateHasRisksceneRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
