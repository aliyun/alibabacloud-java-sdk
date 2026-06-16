// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetCreateLogoTaskResponseBody extends TeaModel {
    /**
     * <p>The error code. If the request is successful, this field is not returned. If the request fails, this field is returned. For more information, see the error code list in this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>aliuid:1998006665794443 assumeRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("Task")
    public GetCreateLogoTaskResponseBodyTask task;

    public static GetCreateLogoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreateLogoTaskResponseBody self = new GetCreateLogoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreateLogoTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCreateLogoTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetCreateLogoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCreateLogoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCreateLogoTaskResponseBody setTask(GetCreateLogoTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetCreateLogoTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetCreateLogoTaskResponseBodyTask extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>604860995</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The current status of the task. Valid values:</p>
         * <ul>
         * <li>pending: pending execution</li>
         * <li>configuring: being configured</li>
         * <li>success: succeeded</li>
         * <li>failed: failed</li>
         * <li>partialFailed: partially failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The URL of the prefetched resource.</p>
         */
        @NameInMap("Urls")
        public java.util.List<String> urls;

        public static GetCreateLogoTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetCreateLogoTaskResponseBodyTask self = new GetCreateLogoTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetCreateLogoTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetCreateLogoTaskResponseBodyTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetCreateLogoTaskResponseBodyTask setUrls(java.util.List<String> urls) {
            this.urls = urls;
            return this;
        }
        public java.util.List<String> getUrls() {
            return this.urls;
        }

    }

}
