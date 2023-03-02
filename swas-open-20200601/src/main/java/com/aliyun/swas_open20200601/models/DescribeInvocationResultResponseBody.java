// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultResponseBody extends TeaModel {
    @NameInMap("InvocationResult")
    public DescribeInvocationResultResponseBodyInvocationResult invocationResult;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvocationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultResponseBody self = new DescribeInvocationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultResponseBody setInvocationResult(DescribeInvocationResultResponseBodyInvocationResult invocationResult) {
        this.invocationResult = invocationResult;
        return this;
    }
    public DescribeInvocationResultResponseBodyInvocationResult getInvocationResult() {
        return this.invocationResult;
    }

    public DescribeInvocationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInvocationResultResponseBodyInvocationResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("InvokeId")
        public String invokeId;

        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        @NameInMap("InvokeUser")
        public String invokeUser;

        @NameInMap("Output")
        public String output;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeInvocationResultResponseBodyInvocationResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultResponseBodyInvocationResult self = new DescribeInvocationResultResponseBodyInvocationResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultResponseBodyInvocationResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setInvokeUser(String invokeUser) {
            this.invokeUser = invokeUser;
            return this;
        }
        public String getInvokeUser() {
            return this.invokeUser;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationResultResponseBodyInvocationResult setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
