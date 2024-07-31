// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCommandInvocationsResponseBody extends TeaModel {
    /**
     * <p>The command executions.</p>
     */
    @NameInMap("CommandInvocations")
    public java.util.List<DescribeCommandInvocationsResponseBodyCommandInvocations> commandInvocations;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCommandInvocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandInvocationsResponseBody self = new DescribeCommandInvocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommandInvocationsResponseBody setCommandInvocations(java.util.List<DescribeCommandInvocationsResponseBodyCommandInvocations> commandInvocations) {
        this.commandInvocations = commandInvocations;
        return this;
    }
    public java.util.List<DescribeCommandInvocationsResponseBodyCommandInvocations> getCommandInvocations() {
        return this.commandInvocations;
    }

    public DescribeCommandInvocationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommandInvocationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCommandInvocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommandInvocationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances extends TeaModel {
        /**
         * <p>The error code returned if the command failed to be sent or run.</p>
         * <ul>
         * <li>null: The command is run as expected.</li>
         * <li>InstanceNotExists: The specified instance does not exist or is released.</li>
         * <li>InstanceReleased: The instance is released when the command is being run.</li>
         * <li>InstanceNotRunning: The instance is not in the Running state when the command is being run.</li>
         * <li>CommandNotApplicable: The command is not applicable to the specified instance.</li>
         * <li>AccountNotExists: The specified account does not exist.</li>
         * <li>DirectoryNotExists: The specified directory does not exist.</li>
         * <li>BadCronExpression: The specified CRON expression for the execution schedule is invalid.</li>
         * <li>ClientNotRunning: Cloud Assistant Agent is not running.</li>
         * <li>ClientNotResponse: Cloud Assistant Agent does not respond to your request.</li>
         * <li>ClientIsUpgrading: Cloud Assistant Agent is being updated.</li>
         * <li>ClientNeedUpgrade: Cloud Assistant Agent needs to be updated.</li>
         * <li>DeliveryTimeout: The request to send the command timed out.</li>
         * <li>ExecutionTimeout: The command execution timed out.</li>
         * <li>ExecutionException: An exception occurred when the command was being run.</li>
         * <li>ExecutionInterrupted: The command execution is interrupted.</li>
         * <li>ExitCodeNonzero: The command execution is complete, and the exit code is not 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the command failed to be sent or run. Valid values:</p>
         * <ul>
         * <li>null: The command is run as expected.</li>
         * <li>the specified instance does not exists: The specified instance does not exist or is released.</li>
         * <li>the instance has released when create task: The instance is released when the command is being run.</li>
         * <li>the instance is not running when create task: The instance is not in the Running state when the command is being run.</li>
         * <li>the command is not applicable: The command is not applicable to the specified instance.</li>
         * <li>the specified account does not exists: The specified account does not exist.</li>
         * <li>the specified directory does not exists: The specified directory does not exist.</li>
         * <li>the cron job expression is invalid: The specified CRON expression for the execution schedule is invalid.</li>
         * <li>the aliyun service is not running on the instance: Cloud Assistant Agent is not running.</li>
         * <li>the aliyun service in the instance does not response: Cloud Assistant Agent does not respond to your request.</li>
         * <li>the aliyun service in the instance is upgrading now: Cloud Assistant Agent is being updated.</li>
         * <li>the aliyun service in the instance need upgrade: Cloud Assistant Agent needs to be updated.</li>
         * <li>the command delivery has been timeout: The request to send the command timed out.</li>
         * <li>the command execution has been timeout: The command execution timed out.</li>
         * <li>the command execution got an exception: An exception occurred when the command was being run.</li>
         * <li>the command execution has been interrupted: The command execution is interrupted.</li>
         * <li>the command execution exit code is not zero: The command execution is complete, and the exit code is not 0.</li>
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
         * <p>The end of the time range during which the command is run on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-03T02:42:29Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>2445f4aecdac4b71ba2c7e3a7ccf****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The execution state of the command on a single instance. Valid values:</p>
         * <ul>
         * <li><p>Pending: The command is being verified or sent.</p>
         * </li>
         * <li><p>Invalid: The specified command type or parameter is invalid.</p>
         * </li>
         * <li><p>Aborted: The command failed to be sent to the instance. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.</p>
         * </li>
         * <li><p>Running: The command is being run on the instance.</p>
         * </li>
         * <li><p>Success:</p>
         * <ul>
         * <li>Command that is set to run only once: The command execution is complete, and the exit code is 0.</li>
         * <li>Command that is set to run on a schedule: The previous command execution is complete, the exit code is 0, and the specified cycle ends.</li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li>Command that is set to run only once: The command execution is complete, and the exit code is not 0.</li>
         * <li>Command that is set to run on a schedule: The previous command execution is complete, the exit code is not 0, and the specified cycle is about to end.</li>
         * </ul>
         * </li>
         * <li><p>Error: The command execution cannot proceed due to an exception.</p>
         * </li>
         * <li><p>Timeout: The command execution timed out.</p>
         * </li>
         * <li><p>Cancelled: The command execution is canceled, and the command is not started.</p>
         * </li>
         * <li><p>Stopping: The command task is being stopped.</p>
         * </li>
         * <li><p>Terminated: The command is terminated when it is being run.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The command output.</p>
         * 
         * <strong>example:</strong>
         * <p>OutputMsg</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The beginning of the time range during which the command is run on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-09T03:32:24Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances self = new DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances();
            return TeaModel.build(map, self);
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeCommandInvocationsResponseBodyCommandInvocations extends TeaModel {
        /**
         * <p>The content of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>echo 123</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The description of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <p>The command ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-hy0338xh28r****</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The command name.</p>
         * 
         * <strong>example:</strong>
         * <p>testCommandName</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        /**
         * <p>The command type.</p>
         * 
         * <strong>example:</strong>
         * <p>RunShellScript</p>
         */
        @NameInMap("CommandType")
        public String commandType;

        /**
         * <p>The time when the command was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-27T10:11:58</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The overall execution state of the command. Valid values:</p>
         * <ul>
         * <li>Pending: The command is being verified or sent.</li>
         * <li>Invalid: The specified command type or parameter is invalid.</li>
         * <li>Aborted: The command failed to be sent to the instances. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.</li>
         * <li>Running: The command is being run on the instances.</li>
         * <li>Success: The command execution is complete, and the exit code is 0.</li>
         * <li>Failed: The command execution is complete, and the exit code is not 0.</li>
         * <li>Error: The command execution cannot proceed due to an exception.</li>
         * <li>Timeout: The command execution timed out.</li>
         * <li>Cancelled: The command execution is canceled, and the command is not started.</li>
         * <li>Stopping: The command in the Running state is being stopped.</li>
         * <li>Terminated: The command is terminated when it is being run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The execution ID of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz0373jyzxt****</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The instances on which the command is run.</p>
         */
        @NameInMap("InvokeInstances")
        public java.util.List<DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances> invokeInstances;

        /**
         * <p>The custom parameters in the command. If no custom parameter exists in the command, the default value is {}.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>The username that is used to run the command.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The working directory of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>c:\wwwroot</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeCommandInvocationsResponseBodyCommandInvocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandInvocationsResponseBodyCommandInvocations self = new DescribeCommandInvocationsResponseBodyCommandInvocations();
            return TeaModel.build(map, self);
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setCommandDescription(String commandDescription) {
            this.commandDescription = commandDescription;
            return this;
        }
        public String getCommandDescription() {
            return this.commandDescription;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setInvokeInstances(java.util.List<DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances> invokeInstances) {
            this.invokeInstances = invokeInstances;
            return this;
        }
        public java.util.List<DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances> getInvokeInstances() {
            return this.invokeInstances;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeCommandInvocationsResponseBodyCommandInvocations setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

}
