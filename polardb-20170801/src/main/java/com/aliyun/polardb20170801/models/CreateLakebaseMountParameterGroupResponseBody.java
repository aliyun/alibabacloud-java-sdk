// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateLakebaseMountParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the created parameter template.</p>
     * 
     * <strong>example:</strong>
     * <p>pcpg-lakebase-xxx</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The asynchronous task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static CreateLakebaseMountParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLakebaseMountParameterGroupResponseBody self = new CreateLakebaseMountParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLakebaseMountParameterGroupResponseBody setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public CreateLakebaseMountParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLakebaseMountParameterGroupResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
