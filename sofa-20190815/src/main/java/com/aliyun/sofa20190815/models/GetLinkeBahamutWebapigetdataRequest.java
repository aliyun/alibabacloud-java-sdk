// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetdataRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutWebapigetdataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetdataRequest self = new GetLinkeBahamutWebapigetdataRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetdataRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public GetLinkeBahamutWebapigetdataRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
