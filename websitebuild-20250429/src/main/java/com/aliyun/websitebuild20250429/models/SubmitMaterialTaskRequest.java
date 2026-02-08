// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SubmitMaterialTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_LOGO</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static SubmitMaterialTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMaterialTaskRequest self = new SubmitMaterialTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMaterialTaskRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public SubmitMaterialTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
