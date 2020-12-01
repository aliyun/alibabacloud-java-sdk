// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchQuery extends TeaModel {
    @NameInMap("PipelineId")
    @Validation(required = true)
    public String pipelineId;

    @NameInMap("Confirm")
    @Validation(required = true)
    public Boolean confirm;

    public static ConfirmPipelineBatchQuery build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPipelineBatchQuery self = new ConfirmPipelineBatchQuery();
        return TeaModel.build(map, self);
    }

    public ConfirmPipelineBatchQuery setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ConfirmPipelineBatchQuery setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }
    public Boolean getConfirm() {
        return this.confirm;
    }

}
