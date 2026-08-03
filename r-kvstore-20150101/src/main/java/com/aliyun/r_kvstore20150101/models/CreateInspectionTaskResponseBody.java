// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateInspectionTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>9A931CE5-C926-5E09-B0EC-6299C4A6****</p>
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
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>tit-dca42f85c73644e0ab5c80ef641xxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateInspectionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateInspectionTaskResponseBodyData self = new CreateInspectionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateInspectionTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
