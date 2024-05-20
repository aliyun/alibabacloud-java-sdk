// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribePipelineRequest extends TeaModel {
    /**
     * <p>The ID of the batch. You can call the [DescribeChangeOrder](https://help.aliyun.com/document_detail/126617.html) operation to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
