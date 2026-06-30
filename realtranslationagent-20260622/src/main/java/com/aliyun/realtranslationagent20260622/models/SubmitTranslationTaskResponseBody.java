// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class SubmitTranslationTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitTranslationTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Status")
        public String status;

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
