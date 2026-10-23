// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApplyLakebaseMountParameterGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ApplyLakebaseMountParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyLakebaseMountParameterGroupResponseBody self = new ApplyLakebaseMountParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyLakebaseMountParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyLakebaseMountParameterGroupResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
