// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationStatusResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   If the request is successful, this parameter is not returned.****</p>
     * <p>*   This parameter is returned only if the request failed.**** For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Valid values:</p>
     * <br>
     * <p>*   **success** is returned when the request succeeds.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether information of the application is successfully obtained. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatusResponseBody self = new DescribeApplicationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationStatusResponseBody setData(DescribeApplicationStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationStatusResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationStatusResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether Application Real-Time Monitoring Service (ARMS) advanced monitoring is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ArmsAdvancedEnabled")
        public String armsAdvancedEnabled;

        /**
         * <p>The metadata of the application in ARMS.</p>
         */
        @NameInMap("ArmsApmInfo")
        public String armsApmInfo;

        /**
         * <p>The time when the application was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The current state of the application. Valid values:</p>
         * <br>
         * <p>*   **RUNNING**</p>
         * <p>*   **STOPPED**</p>
         * <p>*   **UNKNOWN**</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>Indicates whether SAE agent is enabled.</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableAgent")
        public Boolean enableAgent;

        /**
         * <p>The file size limit. Unit: KB. Valid values: 0 to 10240.</p>
         */
        @NameInMap("FileSizeLimit")
        public Long fileSizeLimit;

        /**
         * <p>The ID of the latest change order that is executed. If no change orders have been executed or if change orders have expired, an empty parameter is returned.</p>
         */
        @NameInMap("LastChangeOrderId")
        public String lastChangeOrderId;

        /**
         * <p>Indicates whether the latest change order is being executed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("LastChangeOrderRunning")
        public Boolean lastChangeOrderRunning;

        /**
         * <p>The state of the latest change order. Valid values:</p>
         * <br>
         * <p>*   **READY**: The change order is ready.</p>
         * <p>*   **RUNNING**: The change order is being executed.</p>
         * <p>*   **SUCCESS**: The change order was executed successfully.</p>
         * <p>*   **FAIL**: The change order failed to be executed.</p>
         * <p>*   **ABORT**: The change order is stopped.</p>
         * <p>*   **WAIT_BATCH_CONFIRM**: The change order is pending execution. You must manually confirm the release batch.</p>
         * <p>*   **AUTO_BATCH_WAIT**: The change order is pending execution. SAE will automatically confirm the release batch.</p>
         * <p>*   **SYSTEM_FAIL**: A system exception occurred.</p>
         * <p>*   **WAIT_APPROVAL**: The change order is pending approval.</p>
         * <p>*   **APPROVED**: The change order is approved and is pending execution.</p>
         */
        @NameInMap("LastChangeOrderStatus")
        public String lastChangeOrderStatus;

        /**
         * <p>The number of running instances of the application.</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>Indicates whether an error occurred while the change order was being executed. Valid values:</p>
         * <br>
         * <p>*   **NORMAL**</p>
         * <p>*   **RUNNING_BUT_HAS_ERROR** If an error occurs during a batch release, you must manually perform a rollback. In this case, the change order is still running because the task is not completed, but the state of the change order is RUNNING_BUT_HAS_ERROR.</p>
         */
        @NameInMap("SubStatus")
        public String subStatus;

        public static DescribeApplicationStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationStatusResponseBodyData self = new DescribeApplicationStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationStatusResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationStatusResponseBodyData setArmsAdvancedEnabled(String armsAdvancedEnabled) {
            this.armsAdvancedEnabled = armsAdvancedEnabled;
            return this;
        }
        public String getArmsAdvancedEnabled() {
            return this.armsAdvancedEnabled;
        }

        public DescribeApplicationStatusResponseBodyData setArmsApmInfo(String armsApmInfo) {
            this.armsApmInfo = armsApmInfo;
            return this;
        }
        public String getArmsApmInfo() {
            return this.armsApmInfo;
        }

        public DescribeApplicationStatusResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationStatusResponseBodyData setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public DescribeApplicationStatusResponseBodyData setEnableAgent(Boolean enableAgent) {
            this.enableAgent = enableAgent;
            return this;
        }
        public Boolean getEnableAgent() {
            return this.enableAgent;
        }

        public DescribeApplicationStatusResponseBodyData setFileSizeLimit(Long fileSizeLimit) {
            this.fileSizeLimit = fileSizeLimit;
            return this;
        }
        public Long getFileSizeLimit() {
            return this.fileSizeLimit;
        }

        public DescribeApplicationStatusResponseBodyData setLastChangeOrderId(String lastChangeOrderId) {
            this.lastChangeOrderId = lastChangeOrderId;
            return this;
        }
        public String getLastChangeOrderId() {
            return this.lastChangeOrderId;
        }

        public DescribeApplicationStatusResponseBodyData setLastChangeOrderRunning(Boolean lastChangeOrderRunning) {
            this.lastChangeOrderRunning = lastChangeOrderRunning;
            return this;
        }
        public Boolean getLastChangeOrderRunning() {
            return this.lastChangeOrderRunning;
        }

        public DescribeApplicationStatusResponseBodyData setLastChangeOrderStatus(String lastChangeOrderStatus) {
            this.lastChangeOrderStatus = lastChangeOrderStatus;
            return this;
        }
        public String getLastChangeOrderStatus() {
            return this.lastChangeOrderStatus;
        }

        public DescribeApplicationStatusResponseBodyData setRunningInstances(Integer runningInstances) {
            this.runningInstances = runningInstances;
            return this;
        }
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        public DescribeApplicationStatusResponseBodyData setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

    }

}
