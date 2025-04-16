// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseVocAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitEnterpriseVocAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

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
     * <p>false</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitEnterpriseVocAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseVocAnalysisTaskResponseBody self = new SubmitEnterpriseVocAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setData(SubmitEnterpriseVocAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitEnterpriseVocAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitEnterpriseVocAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a0cc71ec-fe07-47e5-bf12-6e1c46081c98</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitEnterpriseVocAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitEnterpriseVocAnalysisTaskResponseBodyData self = new SubmitEnterpriseVocAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitEnterpriseVocAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
