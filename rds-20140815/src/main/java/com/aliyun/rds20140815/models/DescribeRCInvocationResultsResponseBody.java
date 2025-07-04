// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInvocationResultsResponseBody extends TeaModel {
    @NameInMap("InvocationResults")
    public java.util.List<DescribeRCInvocationResultsResponseBodyInvocationResults> invocationResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>49BC2500-8078-5AC4-A545-20AA5945B0E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>c-7d2a745b412b4601b2d47f6a768d****</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <strong>example:</strong>
         * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <strong>example:</strong>
         * <p>test-container</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>the specified instance does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <strong>example:</strong>
         * <p>2024-12-20T06:15:56Z</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <strong>example:</strong>
         * <p>rc-i322y2t562oh7o******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <strong>example:</strong>
         * <p>t-7d2a745b412b4601b2d47f6a768d****</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <strong>example:</strong>
         * <p>MTU6MzA6MDEK</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Repeats")
        public String repeats;

        /**
         * <strong>example:</strong>
         * <p>2024-12-20T06:15:55Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-19T09:15:47Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("Tags")
        public java.util.List<DescribeRCInvocationResultsResponseBodyInvocationResultsTags> tags;

        /**
         * <strong>example:</strong>
         * <p>testuser</p>
         */
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
