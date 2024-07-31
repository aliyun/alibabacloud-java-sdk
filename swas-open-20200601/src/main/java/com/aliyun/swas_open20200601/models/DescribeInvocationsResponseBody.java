// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>The command name.</p>
     */
    @NameInMap("Invocations")
    public java.util.List<DescribeInvocationsResponseBodyInvocations> invocations;

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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>bHM=</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The name of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        /**
         * <p>The type of the command. Valid values:</p>
         * <ul>
         * <li>RunBatScript: batch command (applicable to Windows instances).</li>
         * <li>RunPowerShellScript: PowerShell command (applicable to Windows instances).</li>
         * <li>RunShellScript: shell command (applicable to Linux instances).</li>
         * </ul>
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
         * <p>2022-07-11T06:37:16Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The status of the command. Valid values:</p>
         * <ul>
         * <li>Pending: The command is being verified or sent.</li>
         * <li>Invalid: The specified command type or parameter is invalid.</li>
         * <li>Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.</li>
         * <li>Running: The command is being run on the instance.</li>
         * <li>Success: The command finishes running, and the exit code is 0.</li>
         * <li>Failed: The command finishes running, but the exit code is not 0.</li>
         * <li>Error: The running of the command cannot proceed due to an exception.</li>
         * <li>Timeout: The running of the command times out.</li>
         * <li>Cancelled: The running is canceled, and the command is not run.</li>
         * <li>Stopping: The command that is running is being stopped.</li>
         * <li>Terminated: The command is terminated while it is being run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The ID of the command task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz02p9545t6****</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The status of the command. Valid values:</p>
         * <ul>
         * <li>Running: The command is running.</li>
         * <li>Finished: The command finishes running.</li>
         * <li>Failed: The running of the command failed.</li>
         * <li>Stopped: The running is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("InvokeStatus")
        public String invokeStatus;

        /**
         * <p>The custom parameters in the command. If no custom parameter exists in the command, the default value is {}.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
