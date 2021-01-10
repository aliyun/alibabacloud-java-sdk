// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetpipelinestatusbystageRequest extends TeaModel {
    @NameInMap("CurrentStageId")
    public String currentStageId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static GetLinkeBahamutGetpipelinestatusbystageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetpipelinestatusbystageRequest self = new GetLinkeBahamutGetpipelinestatusbystageRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetpipelinestatusbystageRequest setCurrentStageId(String currentStageId) {
        this.currentStageId = currentStageId;
        return this;
    }
    public String getCurrentStageId() {
        return this.currentStageId;
    }

    public GetLinkeBahamutGetpipelinestatusbystageRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
