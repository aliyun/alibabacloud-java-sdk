// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class BatchContentAsyncDetectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchContentAsyncDetectResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9736C44E-F718-566B-821F-710216aAAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****F68692</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchContentAsyncDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchContentAsyncDetectResponseBody self = new BatchContentAsyncDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchContentAsyncDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchContentAsyncDetectResponseBody setData(BatchContentAsyncDetectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchContentAsyncDetectResponseBodyData getData() {
        return this.data;
    }

    public BatchContentAsyncDetectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchContentAsyncDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchContentAsyncDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchContentAsyncDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchContentAsyncDetectResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>19657954336</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static BatchContentAsyncDetectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchContentAsyncDetectResponseBodyData self = new BatchContentAsyncDetectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchContentAsyncDetectResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
