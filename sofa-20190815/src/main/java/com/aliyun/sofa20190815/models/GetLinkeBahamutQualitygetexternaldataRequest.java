// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutQualitygetexternaldataRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutQualitygetexternaldataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutQualitygetexternaldataRequest self = new GetLinkeBahamutQualitygetexternaldataRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutQualitygetexternaldataRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public GetLinkeBahamutQualitygetexternaldataRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
