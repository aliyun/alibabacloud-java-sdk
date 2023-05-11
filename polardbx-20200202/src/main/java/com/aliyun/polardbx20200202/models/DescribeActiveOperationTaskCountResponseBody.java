// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskCountResponseBody extends TeaModel {
    @NameInMap("NeedPop")
    public Long needPop;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskCount")
    public Long taskCount;

    public static DescribeActiveOperationTaskCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskCountResponseBody self = new DescribeActiveOperationTaskCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskCountResponseBody setNeedPop(Long needPop) {
        this.needPop = needPop;
        return this;
    }
    public Long getNeedPop() {
        return this.needPop;
    }

    public DescribeActiveOperationTaskCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveOperationTaskCountResponseBody setTaskCount(Long taskCount) {
        this.taskCount = taskCount;
        return this;
    }
    public Long getTaskCount() {
        return this.taskCount;
    }

}
