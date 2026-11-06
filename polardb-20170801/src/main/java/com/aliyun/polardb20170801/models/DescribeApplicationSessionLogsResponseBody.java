// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationSessionLogsResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Items")
    public DescribeApplicationSessionLogsResponseBodyItems items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of log records returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Long pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of log records that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeApplicationSessionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSessionLogsResponseBody self = new DescribeApplicationSessionLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSessionLogsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationSessionLogsResponseBody setItems(DescribeApplicationSessionLogsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeApplicationSessionLogsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeApplicationSessionLogsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationSessionLogsResponseBody setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeApplicationSessionLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationSessionLogsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeApplicationSessionLogsResponseBodyItemsItems extends TeaModel {
        @NameInMap("Agent")
        public String agent;

        @NameInMap("Api")
        public String api;

        @NameInMap("Content")
        public String content;

        @NameInMap("DetailDurationMs")
        public Long detailDurationMs;

        @NameInMap("DetailIsError")
        public Boolean detailIsError;

        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("Model")
        public String model;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("Role")
        public String role;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StopReason")
        public String stopReason;

        @NameInMap("Text")
        public String text;

        @NameInMap("Thinking")
        public String thinking;

        @NameInMap("ThinkingSignature")
        public String thinkingSignature;

        @NameInMap("Time")
        public String time;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("ToolName")
        public String toolName;

        @NameInMap("TotalTokens")
        public Long totalTokens;

        @NameInMap("Type")
        public String type;

        @NameInMap("UsageCacheRead")
        public Long usageCacheRead;

        @NameInMap("UsageCacheWrite")
        public Long usageCacheWrite;

        @NameInMap("UsageCostCacheRead")
        public Long usageCostCacheRead;

        @NameInMap("UsageCostCacheWrite")
        public Long usageCostCacheWrite;

        @NameInMap("UsageCostInput")
        public Long usageCostInput;

        @NameInMap("UsageCostOutput")
        public Long usageCostOutput;

        @NameInMap("UsageCostTotal")
        public Long usageCostTotal;

        @NameInMap("UsageInput")
        public Long usageInput;

        @NameInMap("UsageOutput")
        public Long usageOutput;

        @NameInMap("UsageTotalTokens")
        public Long usageTotalTokens;

        public static DescribeApplicationSessionLogsResponseBodyItemsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSessionLogsResponseBodyItemsItems self = new DescribeApplicationSessionLogsResponseBodyItemsItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setAgent(String agent) {
            this.agent = agent;
            return this;
        }
        public String getAgent() {
            return this.agent;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setDetailDurationMs(Long detailDurationMs) {
            this.detailDurationMs = detailDurationMs;
            return this;
        }
        public Long getDetailDurationMs() {
            return this.detailDurationMs;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setDetailIsError(Boolean detailIsError) {
            this.detailIsError = detailIsError;
            return this;
        }
        public Boolean getDetailIsError() {
            return this.detailIsError;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setStopReason(String stopReason) {
            this.stopReason = stopReason;
            return this;
        }
        public String getStopReason() {
            return this.stopReason;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setThinking(String thinking) {
            this.thinking = thinking;
            return this;
        }
        public String getThinking() {
            return this.thinking;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setThinkingSignature(String thinkingSignature) {
            this.thinkingSignature = thinkingSignature;
            return this;
        }
        public String getThinkingSignature() {
            return this.thinkingSignature;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageCacheRead(Long usageCacheRead) {
            this.usageCacheRead = usageCacheRead;
            return this;
        }
        public Long getUsageCacheRead() {
            return this.usageCacheRead;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageCacheWrite(Long usageCacheWrite) {
            this.usageCacheWrite = usageCacheWrite;
            return this;
        }
        public Long getUsageCacheWrite() {
            return this.usageCacheWrite;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageCostCacheRead(Long usageCostCacheRead) {
            this.usageCostCacheRead = usageCostCacheRead;
            return this;
        }
        public Long getUsageCostCacheRead() {
            return this.usageCostCacheRead;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageCostCacheWrite(Long usageCostCacheWrite) {
            this.usageCostCacheWrite = usageCostCacheWrite;
            return this;
        }
        public Long getUsageCostCacheWrite() {
            return this.usageCostCacheWrite;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageCostInput(Long usageCostInput) {
            this.usageCostInput = usageCostInput;
            return this;
        }
        public Long getUsageCostInput() {
            return this.usageCostInput;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageCostOutput(Long usageCostOutput) {
            this.usageCostOutput = usageCostOutput;
            return this;
        }
        public Long getUsageCostOutput() {
            return this.usageCostOutput;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageCostTotal(Long usageCostTotal) {
            this.usageCostTotal = usageCostTotal;
            return this;
        }
        public Long getUsageCostTotal() {
            return this.usageCostTotal;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageInput(Long usageInput) {
            this.usageInput = usageInput;
            return this;
        }
        public Long getUsageInput() {
            return this.usageInput;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageOutput(Long usageOutput) {
            this.usageOutput = usageOutput;
            return this;
        }
        public Long getUsageOutput() {
            return this.usageOutput;
        }

        public DescribeApplicationSessionLogsResponseBodyItemsItems setUsageTotalTokens(Long usageTotalTokens) {
            this.usageTotalTokens = usageTotalTokens;
            return this;
        }
        public Long getUsageTotalTokens() {
            return this.usageTotalTokens;
        }

    }

    public static class DescribeApplicationSessionLogsResponseBodyItems extends TeaModel {
        @NameInMap("items")
        public java.util.List<DescribeApplicationSessionLogsResponseBodyItemsItems> items;

        public static DescribeApplicationSessionLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSessionLogsResponseBodyItems self = new DescribeApplicationSessionLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSessionLogsResponseBodyItems setItems(java.util.List<DescribeApplicationSessionLogsResponseBodyItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeApplicationSessionLogsResponseBodyItemsItems> getItems() {
            return this.items;
        }

    }

}
