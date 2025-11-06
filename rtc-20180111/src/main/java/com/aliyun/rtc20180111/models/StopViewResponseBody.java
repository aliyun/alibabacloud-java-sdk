// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopViewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E8236D21-B690-5251-A361-5971FBF552BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2bd80921b81e4d4289f696606885606b</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopViewResponseBody self = new StopViewResponseBody();
        return TeaModel.build(map, self);
    }

    public StopViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopViewResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
