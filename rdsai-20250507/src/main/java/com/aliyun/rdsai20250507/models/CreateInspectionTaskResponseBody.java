// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateInspectionTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionTaskResponseBody self = new CreateInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInspectionTaskResponseBody setData(CreateInspectionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateInspectionTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateInspectionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInspectionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateInspectionTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9adf8567-b619-4d37-8ff2-01d38a76****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateInspectionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateInspectionTaskResponseBodyData self = new CreateInspectionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateInspectionTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
