// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class CancelTranslationTaskResponseBody extends TeaModel {
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
    public CancelTranslationTaskResponseBodyData data;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F22CA868-601F-50D1-99B2-520491F25EB7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CancelTranslationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelTranslationTaskResponseBody self = new CancelTranslationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelTranslationTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelTranslationTaskResponseBody setData(CancelTranslationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelTranslationTaskResponseBodyData getData() {
        return this.data;
    }

    public CancelTranslationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelTranslationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelTranslationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelTranslationTaskResponseBodyData extends TeaModel {
        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>CANCEL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f9c35b0453b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CancelTranslationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelTranslationTaskResponseBodyData self = new CancelTranslationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelTranslationTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CancelTranslationTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
