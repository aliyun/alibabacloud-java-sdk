// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class AssociatePocTaskRequest extends TeaModel {
    /**
     * <p>Project ID</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Retrospective task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static AssociatePocTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociatePocTaskRequest self = new AssociatePocTaskRequest();
        return TeaModel.build(map, self);
    }

    public AssociatePocTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AssociatePocTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
