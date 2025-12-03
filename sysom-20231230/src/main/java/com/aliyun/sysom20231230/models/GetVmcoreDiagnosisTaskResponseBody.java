// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetVmcoreDiagnosisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetVmcoreDiagnosisTaskResponseBodyData data;

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

    public static GetVmcoreDiagnosisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVmcoreDiagnosisTaskResponseBody self = new GetVmcoreDiagnosisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVmcoreDiagnosisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVmcoreDiagnosisTaskResponseBody setData(GetVmcoreDiagnosisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVmcoreDiagnosisTaskResponseBodyData getData() {
        return this.data;
    }

    public GetVmcoreDiagnosisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVmcoreDiagnosisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVmcoreDiagnosisTaskResponseBodyDataUrls extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo-common/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo-common/file/path</a></p>
         */
        @NameInMap("debuginfoCommonUrl")
        public String debuginfoCommonUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo/file/path</a></p>
         */
        @NameInMap("debuginfoUrl")
        public String debuginfoUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/dmesg/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/dmesg/file/path</a></p>
         */
        @NameInMap("dmesgUrl")
        public String dmesgUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/vmcore/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/vmcore/file/path</a></p>
         */
        @NameInMap("vmcoreUrl")
        public String vmcoreUrl;

        public static GetVmcoreDiagnosisTaskResponseBodyDataUrls build(java.util.Map<String, ?> map) throws Exception {
            GetVmcoreDiagnosisTaskResponseBodyDataUrls self = new GetVmcoreDiagnosisTaskResponseBodyDataUrls();
            return TeaModel.build(map, self);
        }

        public GetVmcoreDiagnosisTaskResponseBodyDataUrls setDebuginfoCommonUrl(String debuginfoCommonUrl) {
            this.debuginfoCommonUrl = debuginfoCommonUrl;
            return this;
        }
        public String getDebuginfoCommonUrl() {
            return this.debuginfoCommonUrl;
        }

        public GetVmcoreDiagnosisTaskResponseBodyDataUrls setDebuginfoUrl(String debuginfoUrl) {
            this.debuginfoUrl = debuginfoUrl;
            return this;
        }
        public String getDebuginfoUrl() {
            return this.debuginfoUrl;
        }

        public GetVmcoreDiagnosisTaskResponseBodyDataUrls setDmesgUrl(String dmesgUrl) {
            this.dmesgUrl = dmesgUrl;
            return this;
        }
        public String getDmesgUrl() {
            return this.dmesgUrl;
        }

        public GetVmcoreDiagnosisTaskResponseBodyDataUrls setVmcoreUrl(String vmcoreUrl) {
            this.vmcoreUrl = vmcoreUrl;
            return this;
        }
        public String getVmcoreUrl() {
            return this.vmcoreUrl;
        }

    }

    public static class GetVmcoreDiagnosisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-02T17:36:12</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>result</p>
         */
        @NameInMap("diagnoseResult")
        public String diagnoseResult;

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

        @NameInMap("urls")
        public GetVmcoreDiagnosisTaskResponseBodyDataUrls urls;

        public static GetVmcoreDiagnosisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVmcoreDiagnosisTaskResponseBodyData self = new GetVmcoreDiagnosisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVmcoreDiagnosisTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetVmcoreDiagnosisTaskResponseBodyData setDiagnoseResult(String diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
            return this;
        }
        public String getDiagnoseResult() {
            return this.diagnoseResult;
        }

        public GetVmcoreDiagnosisTaskResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetVmcoreDiagnosisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVmcoreDiagnosisTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetVmcoreDiagnosisTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetVmcoreDiagnosisTaskResponseBodyData setUrls(GetVmcoreDiagnosisTaskResponseBodyDataUrls urls) {
            this.urls = urls;
            return this;
        }
        public GetVmcoreDiagnosisTaskResponseBodyDataUrls getUrls() {
            return this.urls;
        }

    }

}
