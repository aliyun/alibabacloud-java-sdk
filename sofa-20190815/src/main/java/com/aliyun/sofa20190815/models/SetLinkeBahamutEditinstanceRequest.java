// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutEditinstanceRequest extends TeaModel {
    @NameInMap("CustomPipelineFormJsonStr")
    public String customPipelineFormJsonStr;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("StageId")
    public String stageId;

    public static SetLinkeBahamutEditinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutEditinstanceRequest self = new SetLinkeBahamutEditinstanceRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutEditinstanceRequest setCustomPipelineFormJsonStr(String customPipelineFormJsonStr) {
        this.customPipelineFormJsonStr = customPipelineFormJsonStr;
        return this;
    }
    public String getCustomPipelineFormJsonStr() {
        return this.customPipelineFormJsonStr;
    }

    public SetLinkeBahamutEditinstanceRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public SetLinkeBahamutEditinstanceRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
