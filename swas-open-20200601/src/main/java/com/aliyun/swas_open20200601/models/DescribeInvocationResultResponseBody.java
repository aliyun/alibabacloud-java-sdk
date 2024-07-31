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
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
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
         * <ul>
         * <li>If this parameter is empty, the command is executed normally.</li>
         * <li>InstanceNotExists: The specified server does not exist or is released.</li>
         * <li>InstanceReleased: The server was released while the command was being executed on the server.</li>
         * <li>InstanceNotRunning: The server is not in the Running state while the command is being executed.</li>
         * <li>CommandNotApplicable: The command is not applicable to the specified server.</li>
         * <li>AccountNotExists: The specified account does not exist.</li>
         * <li>DirectoryNotExists: The specified directory does not exist.</li>
         * <li>BadCronExpression: The specified cron expression for the execution schedule is invalid.</li>
         * <li>ClientNotRunning: The Cloud Assistant client is not running.</li>
         * <li>ClientNotResponse: The Cloud Assistant client does not respond.</li>
         * <li>ClientIsUpgrading: The Cloud Assistant client is being upgraded.</li>
         * <li>ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</li>
         * <li>DeliveryTimeout: Command sending times out.</li>
         * <li>ExecutionTimeout: The execution times out.</li>
         * <li>ExecutionException: An exception occurs while the command is being executed.</li>
         * <li>ExecutionInterrupted: The execution is interrupted.</li>
         * <li>ExitCodeNonzero: The execution is complete, but the exit code is not 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the command is not successfully sent or executed. Valid values:</p>
         * <ul>
         * <li>If this parameter is empty, the command is executed normally.</li>
         * <li>the specified instance does not exists: The specified server does not exist or is released.</li>
         * <li>the instance has released when create task: The server was released while the command was being executed on the server.</li>
         * <li>the instance is not running when create task: The server is not in the Running state while the command is being executed.</li>
         * <li>the command is not applicable: The command is not applicable to the specified server.</li>
         * <li>the specified account does not exists: The specified account does not exist.</li>
         * <li>the specified directory does not exists: The specified directory does not exist.</li>
         * <li>the cron job expression is invalid: The specified cron expression is invalid.</li>
         * <li>the aliyun service is not running on the instance: The Cloud Assistance client is not running.</li>
         * <li>the aliyun service in the instance does not response: The Cloud Assistant client does not respond to your request.</li>
         * <li>the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</li>
         * <li>the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</li>
         * <li>the command delivery has been timeout: Command sending times out.</li>
         * <li>the command execution has been timeout: The execution times out.</li>
         * <li>the command execution got an exception: An exception occurs while the command is being executed.</li>
         * <li>the command execution has been interrupted: The execution is interrupted.</li>
         * <li>the command execution exit code is not zero: The execution is complete, and the exit code is not 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>the specified instance does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the command.</p>
         * <ul>
         * <li>For Linux instances, the exit code is the exit code of the shell command.</li>
         * <li>For Windows instances, the exit code is the exit code of the batch or PowerShell command.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the execution ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T06:37:17Z</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The ID of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>ace0706b2ac4454d984295a94213****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the execution progress. Valid values:</p>
         * <ul>
         * <li>Pending: The command is being verified or sent.</li>
         * <li>Invalid: The specified command type or parameter is invalid.</li>
         * <li>Aborted: The command fails to be sent to the server. To send a command to a server, make sure that the server is in the Running state and the command can be sent within 1 minute.</li>
         * <li>Running: The command is being executed on the server.</li>
         * <li>Success: The execution is completed, and the exit code is 0.</li>
         * <li>Failed: The execution is completed, and the exit code is not 0.</li>
         * <li>Error: The execution cannot proceed due to an exception.</li>
         * <li>Timeout: The execution times out.</li>
         * <li>Cancelled: The execution is canceled, and the command is not executed.</li>
         * <li>Stopping: The command in the Running state is being stopped.</li>
         * <li>Terminated: The command is terminated while it is being executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-bj02prjje65****</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The status of the execution. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Finished</li>
         * <li>Failed</li>
         * <li>Stopped</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The username who executes the command on the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("InvokeUser")
        public String invokeUser;

        /**
         * <p>The command output.</p>
         * 
         * <strong>example:</strong>
         * <p>YWRtaW4K</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The time when the execution started.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T06:37:16Z</p>
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
