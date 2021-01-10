// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStagequalityRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutStagequalityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStagequalityRequest self = new GetLinkeBahamutStagequalityRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStagequalityRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public GetLinkeBahamutStagequalityRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
