// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutCodechangeRequest extends TeaModel {
    @NameInMap("CurrentStageId")
    public String currentStageId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static CheckLinkeBahamutCodechangeRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutCodechangeRequest self = new CheckLinkeBahamutCodechangeRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutCodechangeRequest setCurrentStageId(String currentStageId) {
        this.currentStageId = currentStageId;
        return this;
    }
    public String getCurrentStageId() {
        return this.currentStageId;
    }

    public CheckLinkeBahamutCodechangeRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
