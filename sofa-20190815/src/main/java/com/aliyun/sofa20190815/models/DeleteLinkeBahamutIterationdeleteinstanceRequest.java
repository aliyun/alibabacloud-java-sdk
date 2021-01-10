// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutIterationdeleteinstanceRequest extends TeaModel {
    @NameInMap("CustomPipelineFormJsonStr")
    public String customPipelineFormJsonStr;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("StageId")
    public String stageId;

    public static DeleteLinkeBahamutIterationdeleteinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutIterationdeleteinstanceRequest self = new DeleteLinkeBahamutIterationdeleteinstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutIterationdeleteinstanceRequest setCustomPipelineFormJsonStr(String customPipelineFormJsonStr) {
        this.customPipelineFormJsonStr = customPipelineFormJsonStr;
        return this;
    }
    public String getCustomPipelineFormJsonStr() {
        return this.customPipelineFormJsonStr;
    }

    public DeleteLinkeBahamutIterationdeleteinstanceRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public DeleteLinkeBahamutIterationdeleteinstanceRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
