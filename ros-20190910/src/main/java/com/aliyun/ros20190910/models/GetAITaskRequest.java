// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetAITaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("OutputOption")
    public String outputOption;

    /**
     * <strong>example:</strong>
     * <p>t-asasas*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetAITaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAITaskRequest self = new GetAITaskRequest();
        return TeaModel.build(map, self);
    }

    public GetAITaskRequest setOutputOption(String outputOption) {
        this.outputOption = outputOption;
        return this;
    }
    public String getOutputOption() {
        return this.outputOption;
    }

    public GetAITaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
