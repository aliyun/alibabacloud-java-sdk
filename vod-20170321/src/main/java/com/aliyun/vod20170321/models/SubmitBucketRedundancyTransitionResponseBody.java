// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitBucketRedundancyTransitionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static SubmitBucketRedundancyTransitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBucketRedundancyTransitionResponseBody self = new SubmitBucketRedundancyTransitionResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBucketRedundancyTransitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitBucketRedundancyTransitionResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
