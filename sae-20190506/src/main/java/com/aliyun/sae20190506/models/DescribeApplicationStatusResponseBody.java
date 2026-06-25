// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: The request was invalid.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationStatusResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>If the request is successful, this parameter is not returned.</p>
     * </li>
     * <li><p>If the request fails, this parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message.</p>
     * <ul>
     * <li><p>If the call is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the call fails, an error message is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application status was obtained. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of a request.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether ARMS Advanced Edition is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ArmsAdvancedEnabled")
        public String armsAdvancedEnabled;

        /**
         * <p>The metadata of the application in ARMS.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appId&quot;:&quot;0099b7be-5f5b-4512-a7fc-56049ef1****&quot;,&quot;licenseKey&quot;:&quot;d5cgdt5pu0@7303f55292a****&quot;}</p>
         */
        @NameInMap("ArmsApmInfo")
        public String armsApmInfo;

        /**
         * <p>The time when the application was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1563373372746</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The current status of the application. Valid values:</p>
         * <ul>
         * <li><p><strong>RUNNING</strong>: The application is running.</p>
         * </li>
         * <li><p><strong>STOPPED</strong>: The application is stopped.</p>
         * </li>
         * <li><p><strong>UNKNOWN</strong>: The application status is unknown.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>Indicates whether the SAE agent is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAgent")
        public Boolean enableAgent;

        /**
         * <p>The file size limit. Unit: KB. Valid values: 0 to 10240.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("FileSizeLimit")
        public Long fileSizeLimit;

        /**
         * <p>The ID of the most recently executed change order. This parameter is empty if no change order was executed or if the information about the change order has expired.</p>
         * 
         * <strong>example:</strong>
         * <p>1ccc2339-fc19-49aa-bda0-1e7b8497****</p>
         */
        @NameInMap("LastChangeOrderId")
        public String lastChangeOrderId;

        /**
         * <p>Indicates whether the most recent change order is being executed. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
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
         * <li><p><strong>READY</strong>: The change order is ready.</p>
         * </li>
         * <li><p><strong>RUNNING</strong>: The change order is being executed.</p>
         * </li>
         * <li><p><strong>SUCCESS</strong>: The change order was successful.</p>
         * </li>
         * <li><p><strong>FAIL</strong>: The change order failed.</p>
         * </li>
         * <li><p><strong>ABORT</strong>: The change order was aborted.</p>
         * </li>
         * <li><p><strong>WAIT_BATCH_CONFIRM</strong>: The change order is waiting for manual confirmation for the next batch.</p>
         * </li>
         * <li><p><strong>AUTO_BATCH_WAIT</strong>: The change order is in a waiting state for an automatic batch.</p>
         * </li>
         * <li><p><strong>SYSTEM_FAIL</strong>: A system error occurred.</p>
         * </li>
         * <li><p><strong>WAIT_APPROVAL</strong>: The change order is pending approval.</p>
         * </li>
         * <li><p><strong>APPROVED</strong>: The change order is approved and is pending execution.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastChangeOrderStatus")
        public String lastChangeOrderStatus;

        /**
         * <p>The number of running instances of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>The substatus of the change order. This parameter is used to determine whether an exception occurs during the release process. Valid values:</p>
         * <ul>
         * <li><p><strong>NORMAL</strong>: The release is normal.</p>
         * </li>
         * <li><p><strong>RUNNING_BUT_HAS_ERROR</strong>: The release is abnormal. For example, if an error occurs during a phased release, you must manually roll back the release. In this case, the change order cannot be completed and the status of the change order remains <strong>RUNNING</strong>.</p>
         * </li>
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
