// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FinishGuidTaskRequest extends TeaModel {
    /**
     * <p>The name of the task type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>guide_sub_task_config_add_collection</p>
     */
    @NameInMap("TaskTypeName")
    public String taskTypeName;

    public static FinishGuidTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishGuidTaskRequest self = new FinishGuidTaskRequest();
        return TeaModel.build(map, self);
    }

    public FinishGuidTaskRequest setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName;
        return this;
    }
    public String getTaskTypeName() {
        return this.taskTypeName;
    }

}
