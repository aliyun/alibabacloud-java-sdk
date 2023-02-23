// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class CreatePipelineRunResponseBody extends TeaModel {
    @NameInMap("PipelineRunId")
    public String pipelineRunId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRunResponseBody self = new CreatePipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRunResponseBody setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public CreatePipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
