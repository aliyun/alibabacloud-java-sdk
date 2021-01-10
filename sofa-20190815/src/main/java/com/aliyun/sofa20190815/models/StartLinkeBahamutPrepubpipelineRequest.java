// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLinkeBahamutPrepubpipelineRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("PipelineInstanceId")
    public String pipelineInstanceId;

    public static StartLinkeBahamutPrepubpipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLinkeBahamutPrepubpipelineRequest self = new StartLinkeBahamutPrepubpipelineRequest();
        return TeaModel.build(map, self);
    }

    public StartLinkeBahamutPrepubpipelineRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public StartLinkeBahamutPrepubpipelineRequest setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

}
