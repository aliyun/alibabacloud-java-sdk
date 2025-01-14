// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitVideoAnalysisTaskResponseBodyData data;

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
     * <strong>example:</strong>
     * <p>085BE2D2-BB7E-59A6-B688-F2CB32124E7F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitVideoAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAnalysisTaskResponseBody self = new SubmitVideoAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitVideoAnalysisTaskResponseBody setData(SubmitVideoAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitVideoAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitVideoAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitVideoAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitVideoAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitVideoAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitVideoAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3feb69ed02d9b1a17d0f1a942675d300</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitVideoAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAnalysisTaskResponseBodyData self = new SubmitVideoAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
