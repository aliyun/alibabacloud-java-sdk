// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateMiningTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <strong>example:</strong>
     * <p>123.22.com/11.csv</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <strong>example:</strong>
     * <p>{&quot;startDate&quot;:&quot;20250505&quot;}</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <strong>example:</strong>
     * <p>demandMining</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateMiningTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMiningTaskRequest self = new CreateMiningTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMiningTaskRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateMiningTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateMiningTaskRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateMiningTaskRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CreateMiningTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
