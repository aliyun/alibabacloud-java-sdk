// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class WriteFeatureViewTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0C89F5E1-7F24-5EEC-9F05-508A39278CC8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static WriteFeatureViewTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WriteFeatureViewTableResponseBody self = new WriteFeatureViewTableResponseBody();
        return TeaModel.build(map, self);
    }

    public WriteFeatureViewTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WriteFeatureViewTableResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
