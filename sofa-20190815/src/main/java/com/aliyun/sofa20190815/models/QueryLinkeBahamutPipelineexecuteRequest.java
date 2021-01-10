// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPipelineexecuteRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("PipelineInstance")
    public String pipelineInstance;

    @NameInMap("StageId")
    public String stageId;

    public static QueryLinkeBahamutPipelineexecuteRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPipelineexecuteRequest self = new QueryLinkeBahamutPipelineexecuteRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPipelineexecuteRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkeBahamutPipelineexecuteRequest setPipelineInstance(String pipelineInstance) {
        this.pipelineInstance = pipelineInstance;
        return this;
    }
    public String getPipelineInstance() {
        return this.pipelineInstance;
    }

    public QueryLinkeBahamutPipelineexecuteRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
