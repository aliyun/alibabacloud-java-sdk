// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribePipelineRequest extends TeaModel {
    @NameInMap("PipelineId")
    public String pipelineId;

    public static DescribePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineRequest self = new DescribePipelineRequest();
        return TeaModel.build(map, self);
    }

    public DescribePipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
