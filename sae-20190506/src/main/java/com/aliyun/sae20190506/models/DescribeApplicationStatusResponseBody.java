// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationStatusResponseBodyData data;

    /**
     * <p>The error code. </p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidApplication.NotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. </p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If an exception occurs, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application status information was successfully retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The information was successfully retrieved.</li>
     * <li><strong>false</strong>: The information failed to be retrieved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query invocation information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
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
         * <p>The ID of the current application.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Specifies whether Application Real-Time Monitoring Service (ARMS) Pro is activated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: ARMS Pro is activated.</li>
         * <li><strong>false</strong>: ARMS Pro is not activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ArmsAdvancedEnabled")
        public String armsAdvancedEnabled;

        /**
         * <p>The metadata information of the application in ARMS.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appId&quot;:&quot;0099b7be-5f5b-4512-a7fc-56049ef1****&quot;,&quot;licenseKey&quot;:&quot;d5cgdt5pu0@7303f55292a****&quot;}</p>
         */
        @NameInMap("ArmsApmInfo")
        public String armsApmInfo;

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1563373372746</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The current status of the application. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The application is running.</li>
         * <li><strong>STOPPED</strong>: The application is stopped.</li>
         * <li><strong>UNKNOWN</strong>: The application status is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>Specifies whether the Serverless App Engine (SAE) agent is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The agent is enabled.</li>
         * <li><strong>false</strong>: The agent is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAgent")
        public Boolean enableAgent;

        /**
         * <p>The file size limit. Valid values: 0 to 10240. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("FileSizeLimit")
        public Long fileSizeLimit;

        /**
         * <p>The ID of the most recently executed change order. If no change order has been executed or the change order information has expired, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1ccc2339-fc19-49aa-bda0-1e7b8497****</p>
         */
        @NameInMap("LastChangeOrderId")
        public String lastChangeOrderId;

        /**
         * <p>Specifies whether the most recent change order is being executed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The most recent change order is being executed.</li>
         * <li><strong>false</strong>: The most recent change order is not being executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LastChangeOrderRunning")
        public Boolean lastChangeOrderRunning;

        /**
         * <p>The status of the most recent change order. Valid values:</p>
         * <ul>
         * <li><strong>READY</strong>: The most recent change order is ready.</li>
         * <li><strong>RUNNING</strong>: The most recent change order is being executed.</li>
         * <li><strong>SUCCESS</strong>: The most recent change order is successful.</li>
         * <li><strong>FAIL</strong>: The most recent change order failed.</li>
         * <li><strong>ABORT</strong>: The most recent change order is aborted.</li>
         * <li><strong>WAIT_BATCH_CONFIRM</strong>: The most recent change order is waiting for manual batch confirmation.</li>
         * <li><strong>AUTO_BATCH_WAIT</strong>: The most recent change order is in the automatic batch waiting state.</li>
         * <li><strong>SYSTEM_FAIL</strong>: A system fault occurred.</li>
         * <li><strong>WAIT_APPROVAL</strong>: The most recent change order is waiting for approval.</li>
         * <li><strong>APPROVED</strong>: The most recent change order is approved and waiting to be executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastChangeOrderStatus")
        public String lastChangeOrderStatus;

        /**
         * <p>The number of running instances of the current application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>The sub-status of the change order, which is used to determine whether an exception occurred during the release process. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The release is normal.</li>
         * <li><strong>RUNNING_BUT_HAS_ERROR</strong>: An exception occurred during the release. For example, an error occurs during a batch release and requires a manual rollback. In this case, the change order is still being executed because it cannot be completed despite the error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
