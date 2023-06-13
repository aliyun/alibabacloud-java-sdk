// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultResponseBody extends TeaModel {
    /**
     * <p>The information about the command running result.</p>
     */
    @NameInMap("InvocationResult")
    public DescribeInvocationResultResponseBodyInvocationResult invocationResult;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The error code returned when the command cannot be sent or run. Valid values:</p>
         * <br>
         * <p>*   If this parameter is empty, the command is run normally.</p>
         * <p>*   InstanceNotExists: The instance does not exist or is released.</p>
         * <p>*   InstanceReleased: The instance was released while the command was being run on the instance.</p>
         * <p>*   InstanceNotRunning: The instance is not in the Running state while the command is being run.</p>
         * <p>*   CommandNotApplicable: The command is not applicable to the specified instance.</p>
         * <p>*   AccountNotExists: The specified account does not exist.</p>
         * <p>*   DirectoryNotExists: The specified directory does not exist.</p>
         * <p>*   BadCronExpression: The specified cron expression for the running schedule is invalid.</p>
         * <p>*   ClientNotRunning: The Cloud Assistant client is not running.</p>
         * <p>*   ClientNotResponse: The Cloud Assistant client does not respond.</p>
         * <p>*   ClientIsUpgrading: The Cloud Assistant client is being upgraded.</p>
         * <p>*   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</p>
         * <p>*   DeliveryTimeout: The request for sending the command times out.</p>
         * <p>*   ExecutionTimeout: The running of the command times out.</p>
         * <p>*   ExecutionException: An exception has occurred while the command is being run.</p>
         * <p>*   ExecutionInterrupted: The running of the command is interrupted.</p>
         * <p>*   ExitCodeNonzero: The command finishes running, but the exit code is not 0.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the command cannot be sent or run. Valid values:</p>
         * <br>
         * <p>*   If this parameter is empty, the command is run normally.</p>
         * <p>*   the specified instance does not exists: The specified instance does not exist or is released.</p>
         * <p>*   the instance has released when create task: The instance was released while the command was being run on the instance.</p>
         * <p>*   the instance is not running when create task: The instance is not in the Running state while the command is being run.</p>
         * <p>*   the command is not applicable: The command is not applicable to the specified instance.</p>
         * <p>*   the specified account does not exists: The specified account does not exist.</p>
         * <p>*   the specified directory does not exists: The specified directory does not exist.</p>
         * <p>*   the cron job expression is invalid: The specified cron expression for the runing schedule is invalid.</p>
         * <p>*   the aliyun service is not running on the instance: The Cloud Assistance client is not running.</p>
         * <p>*   the aliyun service in the instance does not response: The Cloud Assistant client does not respond.</p>
         * <p>*   the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</p>
         * <p>*   the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</p>
         * <p>*   the command delivery has been timeout: The request for sending the command times out.</p>
         * <p>*   the command execution has been timeout: The running of the command times out.</p>
         * <p>*   the command execution got an exception: An exception has occurred while the command is being run.</p>
         * <p>*   the command execution has been interrupted: The running of the command is interrupted.</p>
         * <p>*   the command execution exit code is not zero: The command finishes running, but the exit code is not 0.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the command task.</p>
         * <br>
         * <p>*   For Linux instances, the value is the exit code of the shell command.</p>
         * <p>*   For Windows instances, the value is the exit code of the batch or PowerShell command.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the command finished running on the instance.</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The ID of the simple application server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the command. Valid values:</p>
         * <br>
         * <p>*   Pending: The command is being verified or sent.</p>
         * <p>*   Invalid: The specified command type or parameter is invalid.</p>
         * <p>*   Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.</p>
         * <p>*   Running: The command is being run on the instance.</p>
         * <p>*   Success: The command finishes running, and the exit code is 0.</p>
         * <p>*   Failed: The command finishes running, but the exit code is not 0.</p>
         * <p>*   Error: The running of the command cannot proceed due to an exception.</p>
         * <p>*   Timeout: The running of the command times out.</p>
         * <p>*   Cancelled: The running is canceled, and the command is not run.</p>
         * <p>*   Stopping: The command that is running is being stopped.</p>
         * <p>*   Terminated: The command is terminated while it is being run.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The ID of the command task.</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The status of the command task. Valid values:</p>
         * <br>
         * <p>*   Running</p>
         * <p>*   Finished</p>
         * <p>*   Failed</p>
         * <p>*   Stopped</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The username who runs the command on the simple application server.</p>
         */
        @NameInMap("InvokeUser")
        public String invokeUser;

        /**
         * <p>The command output.</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The time when the command started to be run on the instance.</p>
         */
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
