// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultResponseBody extends TeaModel {
    /**
     * <p>The execution results.</p>
     */
    @NameInMap("InvocationResult")
    public DescribeInvocationResultResponseBodyInvocationResult invocationResult;

    /**
     * <p>The request ID.</p>
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
         * <p>The error code that is returned if the command failed to be sent or executed.</p>
         * <br>
         * <p>*   If this parameter is empty, the command is executed normally.</p>
         * <p>*   InstanceNotExists: The specified server does not exist or is released.</p>
         * <p>*   InstanceReleased: The server was released while the command was being executed on the server.</p>
         * <p>*   InstanceNotRunning: The server is not in the Running state while the command is being executed.</p>
         * <p>*   CommandNotApplicable: The command is not applicable to the specified server.</p>
         * <p>*   AccountNotExists: The specified account does not exist.</p>
         * <p>*   DirectoryNotExists: The specified directory does not exist.</p>
         * <p>*   BadCronExpression: The specified cron expression for the execution schedule is invalid.</p>
         * <p>*   ClientNotRunning: The Cloud Assistant client is not running.</p>
         * <p>*   ClientNotResponse: The Cloud Assistant client does not respond.</p>
         * <p>*   ClientIsUpgrading: The Cloud Assistant client is being upgraded.</p>
         * <p>*   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</p>
         * <p>*   DeliveryTimeout: Command sending times out.</p>
         * <p>*   ExecutionTimeout: The execution times out.</p>
         * <p>*   ExecutionException: An exception occurs while the command is being executed.</p>
         * <p>*   ExecutionInterrupted: The execution is interrupted.</p>
         * <p>*   ExitCodeNonzero: The execution is complete, but the exit code is not 0.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the command is not successfully sent or executed. Valid values:</p>
         * <br>
         * <p>*   If this parameter is empty, the command is executed normally.</p>
         * <p>*   the specified instance does not exists: The specified server does not exist or is released.</p>
         * <p>*   the instance has released when create task: The server was released while the command was being executed on the server.</p>
         * <p>*   the instance is not running when create task: The server is not in the Running state while the command is being executed.</p>
         * <p>*   the command is not applicable: The command is not applicable to the specified server.</p>
         * <p>*   the specified account does not exists: The specified account does not exist.</p>
         * <p>*   the specified directory does not exists: The specified directory does not exist.</p>
         * <p>*   the cron job expression is invalid: The specified cron expression is invalid.</p>
         * <p>*   the aliyun service is not running on the instance: The Cloud Assistance client is not running.</p>
         * <p>*   the aliyun service in the instance does not response: The Cloud Assistant client does not respond to your request.</p>
         * <p>*   the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</p>
         * <p>*   the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</p>
         * <p>*   the command delivery has been timeout: Command sending times out.</p>
         * <p>*   the command execution has been timeout: The execution times out.</p>
         * <p>*   the command execution got an exception: An exception occurs while the command is being executed.</p>
         * <p>*   the command execution has been interrupted: The execution is interrupted.</p>
         * <p>*   the command execution exit code is not zero: The execution is complete, and the exit code is not 0.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the command.</p>
         * <br>
         * <p>*   For Linux instances, the exit code is the exit code of the shell command.</p>
         * <p>*   For Windows instances, the exit code is the exit code of the batch or PowerShell command.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the execution ended.</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The ID of the simple application server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the execution progress. Valid values:</p>
         * <br>
         * <p>*   Pending: The command is being verified or sent.</p>
         * <p>*   Invalid: The specified command type or parameter is invalid.</p>
         * <p>*   Aborted: The command fails to be sent to the server. To send a command to a server, make sure that the server is in the Running state and the command can be sent within 1 minute.</p>
         * <p>*   Running: The command is being executed on the server.</p>
         * <p>*   Success: The execution is completed, and the exit code is 0.</p>
         * <p>*   Failed: The execution is completed, and the exit code is not 0.</p>
         * <p>*   Error: The execution cannot proceed due to an exception.</p>
         * <p>*   Timeout: The execution times out.</p>
         * <p>*   Cancelled: The execution is canceled, and the command is not executed.</p>
         * <p>*   Stopping: The command in the Running state is being stopped.</p>
         * <p>*   Terminated: The command is terminated while it is being executed.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The execution ID.</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The status of the execution. Valid values:</p>
         * <br>
         * <p>*   Running</p>
         * <p>*   Finished</p>
         * <p>*   Failed</p>
         * <p>*   Stopped</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The username who executes the command on the simple application server.</p>
         */
        @NameInMap("InvokeUser")
        public String invokeUser;

        /**
         * <p>The command output.</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The time when the execution started.</p>
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
