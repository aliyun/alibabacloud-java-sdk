// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateStreamingOutResponseBody extends TeaModel {
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

    public static UpdateStreamingOutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStreamingOutResponseBody self = new UpdateStreamingOutResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStreamingOutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStreamingOutResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
