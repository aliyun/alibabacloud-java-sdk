// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class PublishFeatureViewTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>627B5776-4D06-5A49-8A04-508AA39653F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static PublishFeatureViewTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishFeatureViewTableResponseBody self = new PublishFeatureViewTableResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishFeatureViewTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishFeatureViewTableResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
