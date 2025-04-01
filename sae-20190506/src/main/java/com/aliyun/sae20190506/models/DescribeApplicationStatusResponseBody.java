// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
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
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
     * <li>An error code: If the call fails, an error code is returned.</li>
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
     * <p>Indicates whether the status of the application was queried. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The status was queried.</li>
     * <li><strong>false</strong>: The status failed to be queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether Application Real-Time Monitoring Service (ARMS) advanced monitoring is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <li><strong>RUNNING</strong></li>
         * <li><strong>STOPPED</strong></li>
         * <li><strong>UNKNOWN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>Indicates whether SAE agent is enabled.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The ID of the latest change order that is executed. If no change orders are executed or if change orders expire, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1ccc2339-fc19-49aa-bda0-1e7b8497****</p>
         */
        @NameInMap("LastChangeOrderId")
        public String lastChangeOrderId;

        /**
         * <p>Indicates whether the latest change order is being executed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LastChangeOrderRunning")
        public Boolean lastChangeOrderRunning;

        /**
         * <p>The status of the latest change order. Valid values:</p>
         * <ul>
         * <li><strong>READY</strong>: The change order is ready.</li>
         * <li><strong>RUNNING</strong>: The change order is being executed.</li>
         * <li><strong>SUCCESS</strong>: The change order was executed.</li>
         * <li><strong>FAIL</strong>: The change order failed to be executed.</li>
         * <li><strong>ABORT</strong>: The change order is stopped.</li>
         * <li><strong>WAIT_BATCH_CONFIRM</strong>: The change order is pending execution. You must manually confirm the release batch.</li>
         * <li><strong>AUTO_BATCH_WAIT</strong>: The change order is pending execution. SAE will automatically confirm the release batch.</li>
         * <li><strong>SYSTEM_FAIL</strong>: A system exception occurred.</li>
         * <li><strong>WAIT_APPROVAL</strong>: The change order is pending approval.</li>
         * <li><strong>APPROVED</strong>: The change order is approved and is pending execution.</li>
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
         * <p>The substatus of the change order. This parameter indicates whether an exception occurred while the change order was being executed. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong></li>
         * <li><strong>RUNNING_BUT_HAS_ERROR</strong>: For example, if an error occurs during a phased release, you must manually roll back the application. In this case, the change order cannot be completed because the change order is still being executed.</li>
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
