// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SubmitSqlFlashbackTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitSqlFlashbackTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitSqlFlashbackTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSqlFlashbackTaskResponseBody self = new SubmitSqlFlashbackTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSqlFlashbackTaskResponseBody setData(SubmitSqlFlashbackTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitSqlFlashbackTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitSqlFlashbackTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitSqlFlashbackTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSqlFlashbackTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitSqlFlashbackTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitSqlFlashbackTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitSqlFlashbackTaskResponseBodyData self = new SubmitSqlFlashbackTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitSqlFlashbackTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
