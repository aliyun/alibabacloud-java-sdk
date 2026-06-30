// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class CancelTranslationTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CancelTranslationTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Status")
        public String status;

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
