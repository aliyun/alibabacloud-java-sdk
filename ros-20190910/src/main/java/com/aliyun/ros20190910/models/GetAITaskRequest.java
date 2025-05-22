// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetAITaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the TaskOutput parameter. The TaskOutput parameter specifies the outputs of the AI task. Valid values:</p>
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled (default)</li>
     * </ul>
     * <blockquote>
     * <p> The value of TaskOutput may be excessively long. If you do not require the outputs of the task, we recommend that you set OutputOption to Disabled to improve the response speed of the API operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("OutputOption")
    public String outputOption;

    /**
     * <p>The ID of the AI task.</p>
     * 
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
