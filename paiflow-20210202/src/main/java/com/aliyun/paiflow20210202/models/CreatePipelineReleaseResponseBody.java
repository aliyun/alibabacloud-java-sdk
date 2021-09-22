// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class CreatePipelineReleaseResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PipelineId")
    public String pipelineId;

    public static CreatePipelineReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineReleaseResponseBody self = new CreatePipelineReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelineReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePipelineReleaseResponseBody setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
