// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitTagMiningAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitTagMiningAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitTagMiningAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTagMiningAnalysisTaskResponseBody self = new SubmitTagMiningAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTagMiningAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTagMiningAnalysisTaskResponseBody setData(SubmitTagMiningAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTagMiningAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitTagMiningAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitTagMiningAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTagMiningAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTagMiningAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitTagMiningAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3feb69ed02d9b1a17d0f1a942675d300</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitTagMiningAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTagMiningAnalysisTaskResponseBodyData self = new SubmitTagMiningAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTagMiningAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
