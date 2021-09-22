// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class CreatePipelineReleaseRequest extends TeaModel {
    @NameInMap("TargetPipelineProvider")
    public String targetPipelineProvider;

    public static CreatePipelineReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineReleaseRequest self = new CreatePipelineReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineReleaseRequest setTargetPipelineProvider(String targetPipelineProvider) {
        this.targetPipelineProvider = targetPipelineProvider;
        return this;
    }
    public String getTargetPipelineProvider() {
        return this.targetPipelineProvider;
    }

}
