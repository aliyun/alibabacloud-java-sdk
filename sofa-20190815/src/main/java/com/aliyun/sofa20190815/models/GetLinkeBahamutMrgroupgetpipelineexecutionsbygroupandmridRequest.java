// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridRequest extends TeaModel {
    @NameInMap("MrId")
    public String mrId;

    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridRequest self = new GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridRequest setMrId(String mrId) {
        this.mrId = mrId;
        return this;
    }
    public String getMrId() {
        return this.mrId;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
