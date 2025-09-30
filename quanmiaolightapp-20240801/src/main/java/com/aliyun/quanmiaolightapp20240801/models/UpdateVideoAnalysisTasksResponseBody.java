// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoAnalysisTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<UpdateVideoAnalysisTasksResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>04DA1A52-4E51-56CB-BA64-FDDA0B53BAE8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateVideoAnalysisTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoAnalysisTasksResponseBody self = new UpdateVideoAnalysisTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVideoAnalysisTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateVideoAnalysisTasksResponseBody setData(java.util.List<UpdateVideoAnalysisTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateVideoAnalysisTasksResponseBodyData> getData() {
        return this.data;
    }

    public UpdateVideoAnalysisTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateVideoAnalysisTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateVideoAnalysisTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVideoAnalysisTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateVideoAnalysisTasksResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("taskErrorCode")
        public String taskErrorCode;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("taskErrorMessage")
        public String taskErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>CANCELED</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static UpdateVideoAnalysisTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateVideoAnalysisTasksResponseBodyData self = new UpdateVideoAnalysisTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateVideoAnalysisTasksResponseBodyData setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
            return this;
        }
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public UpdateVideoAnalysisTasksResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public UpdateVideoAnalysisTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateVideoAnalysisTasksResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
