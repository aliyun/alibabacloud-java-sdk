// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoDetectShotTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateVideoDetectShotTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>575D5893-01DB-5C81-A899-74F67616762A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateVideoDetectShotTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoDetectShotTaskResponseBody self = new UpdateVideoDetectShotTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVideoDetectShotTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateVideoDetectShotTaskResponseBody setData(UpdateVideoDetectShotTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateVideoDetectShotTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateVideoDetectShotTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateVideoDetectShotTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateVideoDetectShotTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVideoDetectShotTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateVideoDetectShotTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
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
         * <p>SUCCESSED</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static UpdateVideoDetectShotTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateVideoDetectShotTaskResponseBodyData self = new UpdateVideoDetectShotTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateVideoDetectShotTaskResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public UpdateVideoDetectShotTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateVideoDetectShotTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
