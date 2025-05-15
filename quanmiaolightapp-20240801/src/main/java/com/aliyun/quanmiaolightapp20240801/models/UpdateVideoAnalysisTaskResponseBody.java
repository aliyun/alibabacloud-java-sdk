// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateVideoAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateVideoAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoAnalysisTaskResponseBody self = new UpdateVideoAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVideoAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateVideoAnalysisTaskResponseBody setData(UpdateVideoAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateVideoAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateVideoAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateVideoAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateVideoAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVideoAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateVideoAnalysisTaskResponseBodyData extends TeaModel {
        @NameInMap("taskErrorMessage")
        public String taskErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>3feb69ed02d9b1a17d0f1a942675d300</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>CANCELED</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static UpdateVideoAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateVideoAnalysisTaskResponseBodyData self = new UpdateVideoAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateVideoAnalysisTaskResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public UpdateVideoAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateVideoAnalysisTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
