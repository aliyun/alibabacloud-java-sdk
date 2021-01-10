// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidRequest extends TeaModel {
    @NameInMap("ReleaseJarId")
    public String releaseJarId;

    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidRequest self = new GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidRequest setReleaseJarId(String releaseJarId) {
        this.releaseJarId = releaseJarId;
        return this;
    }
    public String getReleaseJarId() {
        return this.releaseJarId;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
