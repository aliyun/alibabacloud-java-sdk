// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutIterationunitcodechangecheckRequest extends TeaModel {
    @NameInMap("CurrentStageId")
    public String currentStageId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static CheckLinkeBahamutIterationunitcodechangecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutIterationunitcodechangecheckRequest self = new CheckLinkeBahamutIterationunitcodechangecheckRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutIterationunitcodechangecheckRequest setCurrentStageId(String currentStageId) {
        this.currentStageId = currentStageId;
        return this;
    }
    public String getCurrentStageId() {
        return this.currentStageId;
    }

    public CheckLinkeBahamutIterationunitcodechangecheckRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
