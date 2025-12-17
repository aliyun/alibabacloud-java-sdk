// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateSanityCheckTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEBDF2EE-642E-5992-8907-D2011A7ACEFE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>917479ff-c869-49ea-908e-ae85bd987bc0</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateSanityCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSanityCheckTaskResponseBody self = new CreateSanityCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSanityCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSanityCheckTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
