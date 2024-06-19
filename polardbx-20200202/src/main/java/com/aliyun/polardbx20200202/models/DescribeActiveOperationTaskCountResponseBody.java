// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NeedPop")
    public Long needPop;

    /**
     * <strong>example:</strong>
     * <p>EC7E27FC-58F8-4722-89BB-D1B6D0971956</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
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
