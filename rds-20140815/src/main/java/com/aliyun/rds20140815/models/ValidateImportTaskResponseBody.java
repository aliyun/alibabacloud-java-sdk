// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ValidateImportTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ValidateImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateImportTaskResponseBody self = new ValidateImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateImportTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
