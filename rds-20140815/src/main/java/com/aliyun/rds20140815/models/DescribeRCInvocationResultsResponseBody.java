// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInvocationResultsResponseBody extends TeaModel {
    @NameInMap("InvocationResults")
    public java.util.List<DescribeRCInvocationResultsResponseBodyInvocationResults> invocationResults;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRCInvocationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInvocationResultsResponseBody self = new DescribeRCInvocationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInvocationResultsResponseBody setInvocationResults(java.util.List<DescribeRCInvocationResultsResponseBodyInvocationResults> invocationResults) {
        this.invocationResults = invocationResults;
        return this;
    }
    public java.util.List<DescribeRCInvocationResultsResponseBodyInvocationResults> getInvocationResults() {
        return this.invocationResults;
    }

    public DescribeRCInvocationResultsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRCInvocationResultsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCInvocationResultsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeRCInvocationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCInvocationResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCInvocationResultsResponseBodyInvocationResultsTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeRCInvocationResultsResponseBodyInvocationResultsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInvocationResultsResponseBodyInvocationResultsTags self = new DescribeRCInvocationResultsResponseBodyInvocationResultsTags();
            return TeaModel.build(map, self);
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResultsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResultsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeRCInvocationResultsResponseBodyInvocationResults extends TeaModel {
        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("Dropped")
        public Integer dropped;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("ExitCode")
        public Integer exitCode;

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

        @NameInMap("Output")
        public String output;

        @NameInMap("Repeats")
        public String repeats;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("Tags")
        public java.util.List<DescribeRCInvocationResultsResponseBodyInvocationResultsTags> tags;

        @NameInMap("Username")
        public String username;

        public static DescribeRCInvocationResultsResponseBodyInvocationResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInvocationResultsResponseBodyInvocationResults self = new DescribeRCInvocationResultsResponseBodyInvocationResults();
            return TeaModel.build(map, self);
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setDropped(Integer dropped) {
            this.dropped = dropped;
            return this;
        }
        public Integer getDropped() {
            return this.dropped;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setRepeats(String repeats) {
            this.repeats = repeats;
            return this;
        }
        public String getRepeats() {
            return this.repeats;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setTags(java.util.List<DescribeRCInvocationResultsResponseBodyInvocationResultsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeRCInvocationResultsResponseBodyInvocationResultsTags> getTags() {
            return this.tags;
        }

        public DescribeRCInvocationResultsResponseBodyInvocationResults setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
