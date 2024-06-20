// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartStreamingOutResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StartStreamingOutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartStreamingOutResponseBody self = new StartStreamingOutResponseBody();
        return TeaModel.build(map, self);
    }

    public StartStreamingOutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartStreamingOutResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
