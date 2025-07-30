// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetMiningTaskResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetMiningTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiningTaskResultRequest self = new GetMiningTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetMiningTaskResultRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetMiningTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
