// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetcloudworkspaceRequest extends TeaModel {
    @NameInMap("CurrentStage")
    public String currentStage;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static GetLinkeBahamutGetcloudworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetcloudworkspaceRequest self = new GetLinkeBahamutGetcloudworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetcloudworkspaceRequest setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }
    public String getCurrentStage() {
        return this.currentStage;
    }

    public GetLinkeBahamutGetcloudworkspaceRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
