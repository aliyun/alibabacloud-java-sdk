// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartViewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FA2F9DE9-8EAD-580E-87DF-A3D25EE87C37</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StartViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartViewResponseBody self = new StartViewResponseBody();
        return TeaModel.build(map, self);
    }

    public StartViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartViewResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
