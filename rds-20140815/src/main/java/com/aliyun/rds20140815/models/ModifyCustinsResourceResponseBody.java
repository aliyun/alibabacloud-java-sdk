// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCustinsResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6B5A6839-31A7-58D4-9F96-772BFAFD1CB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>507******</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static ModifyCustinsResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustinsResourceResponseBody self = new ModifyCustinsResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustinsResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCustinsResourceResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
