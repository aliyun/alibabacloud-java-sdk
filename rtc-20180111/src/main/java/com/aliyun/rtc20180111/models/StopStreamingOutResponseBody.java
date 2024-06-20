// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopStreamingOutResponseBody extends TeaModel {
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

    public static StopStreamingOutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopStreamingOutResponseBody self = new StopStreamingOutResponseBody();
        return TeaModel.build(map, self);
    }

    public StopStreamingOutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopStreamingOutResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
