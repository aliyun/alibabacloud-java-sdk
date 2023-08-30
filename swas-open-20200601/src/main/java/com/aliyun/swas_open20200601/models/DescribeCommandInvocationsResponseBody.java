// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCommandInvocationsResponseBody extends TeaModel {
    @NameInMap("CommandInvocations")
    public java.util.List<DescribeCommandInvocationsResponseBodyCommandInvocations> commandInvocations;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("Output")
        public String output;

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
        @NameInMap("CommandContent")
        public String commandContent;

        @NameInMap("CommandDescription")
        public String commandDescription;

        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("CommandName")
        public String commandName;

        @NameInMap("CommandType")
        public String commandType;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("InvokeId")
        public String invokeId;

        @NameInMap("InvokeInstances")
        public java.util.List<DescribeCommandInvocationsResponseBodyCommandInvocationsInvokeInstances> invokeInstances;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("Username")
        public String username;

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
