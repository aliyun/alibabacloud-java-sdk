// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineRequest extends TeaModel {
    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineRequest self = new GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
