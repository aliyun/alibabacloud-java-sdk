// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeApplicationStatusResponseBodyData data;

    public static DescribeApplicationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatusResponseBody self = new DescribeApplicationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationStatusResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeApplicationStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationStatusResponseBody setData(DescribeApplicationStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationStatusResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeApplicationStatusResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("LastChangeOrderId")
        @Validation(required = true)
        public String lastChangeOrderId;

        @NameInMap("LastChangeOrderStatus")
        @Validation(required = true)
        public String lastChangeOrderStatus;

        @NameInMap("LastChangeOrderRunning")
        @Validation(required = true)
        public Boolean lastChangeOrderRunning;

        @NameInMap("CurrentStatus")
        @Validation(required = true)
        public String currentStatus;

        @NameInMap("ArmsApmInfo")
        @Validation(required = true)
        public String armsApmInfo;

        @NameInMap("RunningInstances")
        @Validation(required = true)
        public Integer runningInstances;

        @NameInMap("ArmsAdvancedEnabled")
        @Validation(required = true)
        public String armsAdvancedEnabled;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

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

        public DescribeApplicationStatusResponseBodyData setLastChangeOrderId(String lastChangeOrderId) {
            this.lastChangeOrderId = lastChangeOrderId;
            return this;
        }
        public String getLastChangeOrderId() {
            return this.lastChangeOrderId;
        }

        public DescribeApplicationStatusResponseBodyData setLastChangeOrderStatus(String lastChangeOrderStatus) {
            this.lastChangeOrderStatus = lastChangeOrderStatus;
            return this;
        }
        public String getLastChangeOrderStatus() {
            return this.lastChangeOrderStatus;
        }

        public DescribeApplicationStatusResponseBodyData setLastChangeOrderRunning(Boolean lastChangeOrderRunning) {
            this.lastChangeOrderRunning = lastChangeOrderRunning;
            return this;
        }
        public Boolean getLastChangeOrderRunning() {
            return this.lastChangeOrderRunning;
        }

        public DescribeApplicationStatusResponseBodyData setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public DescribeApplicationStatusResponseBodyData setArmsApmInfo(String armsApmInfo) {
            this.armsApmInfo = armsApmInfo;
            return this;
        }
        public String getArmsApmInfo() {
            return this.armsApmInfo;
        }

        public DescribeApplicationStatusResponseBodyData setRunningInstances(Integer runningInstances) {
            this.runningInstances = runningInstances;
            return this;
        }
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        public DescribeApplicationStatusResponseBodyData setArmsAdvancedEnabled(String armsAdvancedEnabled) {
            this.armsAdvancedEnabled = armsAdvancedEnabled;
            return this;
        }
        public String getArmsAdvancedEnabled() {
            return this.armsAdvancedEnabled;
        }

        public DescribeApplicationStatusResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
