// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribePipelineRequest extends TeaModel {
    /**
     * <p>The batch ID. You can retrieve the ID by calling the <a href="https://help.aliyun.com/document_detail/126617.html">DescribeChangeOrder</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>917660ba-5092-44ca-b8e0-80012c96****</p>
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
