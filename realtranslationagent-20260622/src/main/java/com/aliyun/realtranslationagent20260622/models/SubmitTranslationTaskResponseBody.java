// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class SubmitTranslationTaskResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public SubmitTranslationTaskResponseBodyData data;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6E6D23C-D6FC-5AD4-B90B-1E32850393AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitTranslationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranslationTaskResponseBody self = new SubmitTranslationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTranslationTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTranslationTaskResponseBody setData(SubmitTranslationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTranslationTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitTranslationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTranslationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTranslationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitTranslationTaskResponseBodyData extends TeaModel {
        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The translation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f9c35b0453b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitTranslationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranslationTaskResponseBodyData self = new SubmitTranslationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTranslationTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitTranslationTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
