// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchRequest extends TeaModel {
    @NameInMap("Confirm")
    public Boolean confirm;

    @NameInMap("PipelineId")
    public String pipelineId;

    public static ConfirmPipelineBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPipelineBatchRequest self = new ConfirmPipelineBatchRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmPipelineBatchRequest setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }
    public Boolean getConfirm() {
        return this.confirm;
    }

    public ConfirmPipelineBatchRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
