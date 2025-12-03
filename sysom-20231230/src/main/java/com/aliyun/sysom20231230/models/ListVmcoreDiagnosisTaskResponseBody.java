// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListVmcoreDiagnosisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListVmcoreDiagnosisTaskResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListVmcoreDiagnosisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVmcoreDiagnosisTaskResponseBody self = new ListVmcoreDiagnosisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVmcoreDiagnosisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVmcoreDiagnosisTaskResponseBody setData(java.util.List<ListVmcoreDiagnosisTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVmcoreDiagnosisTaskResponseBodyData> getData() {
        return this.data;
    }

    public ListVmcoreDiagnosisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVmcoreDiagnosisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVmcoreDiagnosisTaskResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVmcoreDiagnosisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-02T17:36:12</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>error message</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>bbe94a98-4192-4172-b856-95777e0a55d7</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>vmcore</p>
         */
        @NameInMap("taskType")
        public String taskType;

        public static ListVmcoreDiagnosisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVmcoreDiagnosisTaskResponseBodyData self = new ListVmcoreDiagnosisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVmcoreDiagnosisTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListVmcoreDiagnosisTaskResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListVmcoreDiagnosisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVmcoreDiagnosisTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListVmcoreDiagnosisTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
