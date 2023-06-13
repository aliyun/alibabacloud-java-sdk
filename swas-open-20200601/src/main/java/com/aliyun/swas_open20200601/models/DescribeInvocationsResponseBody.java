// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>Running records of commands.</p>
     */
    @NameInMap("Invocations")
    public java.util.List<DescribeInvocationsResponseBodyInvocations> invocations;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of commands.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInvocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsResponseBody self = new DescribeInvocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsResponseBody setInvocations(java.util.List<DescribeInvocationsResponseBodyInvocations> invocations) {
        this.invocations = invocations;
        return this;
    }
    public java.util.List<DescribeInvocationsResponseBodyInvocations> getInvocations() {
        return this.invocations;
    }

    public DescribeInvocationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInvocationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInvocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvocationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInvocationsResponseBodyInvocations extends TeaModel {
        /**
         * <p>The content of the command, which is Base64-encoded.</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The name of the command.</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        /**
         * <p>The type of the command. Valid values:</p>
         * <br>
         * <p>*   RunBatScript: batch command (applicable to Windows instances).</p>
         * <p>*   RunPowerShellScript: PowerShell command (applicable to Windows instances).</p>
         * <p>*   RunShellScript: shell command (applicable to Linux instances).</p>
         */
        @NameInMap("CommandType")
        public String commandType;

        /**
         * <p>The time when the command was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

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
         * <p>The status of the command. Valid values:</p>
         * <br>
         * <p>*   Running: The command is running.</p>
         * <p>*   Finished: The command finishes running.</p>
         * <p>*   Failed: The running of the command failed.</p>
         * <p>*   Stopped: The running is stopped.</p>
         */
        @NameInMap("InvokeStatus")
        public String invokeStatus;

        /**
         * <p>The custom parameters in the command. If no custom parameter exists in the command, the default value is {}.</p>
         */
        @NameInMap("Parameters")
        public java.util.Map<String, ?> parameters;

        public static DescribeInvocationsResponseBodyInvocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocations self = new DescribeInvocationsResponseBodyInvocations();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocations setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeInvocationsResponseBodyInvocations setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

        public DescribeInvocationsResponseBodyInvocations setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public DescribeInvocationsResponseBodyInvocations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInvocationsResponseBodyInvocations setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseBodyInvocations setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeInvocationsResponseBodyInvocations setInvokeStatus(String invokeStatus) {
            this.invokeStatus = invokeStatus;
            return this;
        }
        public String getInvokeStatus() {
            return this.invokeStatus;
        }

        public DescribeInvocationsResponseBodyInvocations setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

    }

}
