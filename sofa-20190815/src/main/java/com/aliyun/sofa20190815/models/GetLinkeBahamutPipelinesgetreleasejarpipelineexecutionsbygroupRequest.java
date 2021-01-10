// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupRequest extends TeaModel {
    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupRequest self = new GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
