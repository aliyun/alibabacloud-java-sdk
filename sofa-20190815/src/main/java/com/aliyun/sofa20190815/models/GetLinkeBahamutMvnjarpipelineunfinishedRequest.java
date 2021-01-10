// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMvnjarpipelineunfinishedRequest extends TeaModel {
    @NameInMap("CurrentStageId")
    public String currentStageId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static GetLinkeBahamutMvnjarpipelineunfinishedRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMvnjarpipelineunfinishedRequest self = new GetLinkeBahamutMvnjarpipelineunfinishedRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMvnjarpipelineunfinishedRequest setCurrentStageId(String currentStageId) {
        this.currentStageId = currentStageId;
        return this;
    }
    public String getCurrentStageId() {
        return this.currentStageId;
    }

    public GetLinkeBahamutMvnjarpipelineunfinishedRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
