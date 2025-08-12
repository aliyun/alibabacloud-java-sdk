// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListTracesDatasRequest extends TeaModel {
    /**
     * <p>The value of the attributes.service.app.user_id field in the trace record. It can contain upper and lower case letters, digits, dot (.), hyphen (-), and underscore (_). It is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>end-user.12345</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>Other filter parameters</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListTracesDatasRequestFilters> filters;

    /**
     * <p>Whether to return only trace records containing spans with a non-empty events. Example: Suppose a trace has 3 spans. If this parameter is True, this trace meets the condition when any one of the 3 spans has a non-empty events. The default value is False. The events is not used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("HasEvents")
    public Boolean hasEvents;

    /**
     * <p>Whether to return only trace records containing spans with a non-empty statusMessage. Example: Suppose a trace has 3 spans. If this parameter is True, this trace meets the condition when any one of the 3 spans has a non-empty statusMessage. The default value is False. The statusMessage is not used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("HasStatusMessage")
    public Boolean hasStatusMessage;

    /**
     * <p>The value of the resources.service.app.name field in the trace record. It can contain upper and lower case letters, digits, dot (.), hyphen (-), and underscore (_). Must be an exact match. It is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>My.super_LLM-app2</p>
     */
    @NameInMap("LlmAppName")
    public String llmAppName;

    @NameInMap("MaxDuration")
    public Float maxDuration;

    /**
     * <p>The upper limit of the search time range, in UTC format (YYYY-mm-dd or YYYY-MM-DD HH:mm:ss). By default, the value is (current time +10 minutes)</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-31
     * 2024-12-31 23:59:59</p>
     */
    @NameInMap("MaxTime")
    public String maxTime;

    @NameInMap("MinDuration")
    public Float minDuration;

    /**
     * <p>The lower limit of the search time range, in UTC format (YYYY-mm-dd or YYYY-MM-DD HH:mm:ss). By default, the value is (current time - 2 days).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-31
     * 2024-12-31 23:59:59</p>
     */
    @NameInMap("MinTime")
    public String minTime;

    /**
     * <p>Whether the returned JSON data can be directly converted to OpenTelemetry TracesData protobuf object. Default value: False. JSON data that is compatible with OpenTelemetry is more complex. Such data is generally not required unless you want to generate a protobuf object of OpenTelemetry.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("OpentelemetryCompatible")
    public Boolean opentelemetryCompatible;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The value of the resources.service.owner.sub_id field in the trace record. It can contain upper and lower case letters, digits, dot (.), hyphen (-), and underscore (_). It is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("OwnerSubId")
    public String ownerSubId;

    /**
     * <p>The page number. Page starts from page 1. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The field used to sort the returned results. Valid values: StartTime and Duration.</p>
     * 
     * <strong>example:</strong>
     * <p>StartTime
     * Duration</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong></li>
     * <li><strong>DESC</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC
     * ASC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The list of span IDs. Each trace record contains one or more spans.</p>
     */
    @NameInMap("SpanIds")
    public java.util.List<String> spanIds;

    @NameInMap("SpanName")
    public String spanName;

    /**
     * <p>The list of trace IDs.</p>
     */
    @NameInMap("TraceIds")
    public java.util.List<String> traceIds;

    /**
     * <p>The content simplification method for returned trace data to reduce the data volume.</p>
     * <p>REMOVE_EMBEDDING: Removes all embedding array contents.</p>
     * <p>ROOT_ONLY: Returns only the root span for each trace, with the root span content also having the REMOVE_EMBEDDING applied.</p>
     * <p>Blank: Maintains the original data without simplification.</p>
     * 
     * <strong>example:</strong>
     * <p>REMOVE_EMBEDDING
     * ROOT_ONLY</p>
     */
    @NameInMap("TraceReduceMethod")
    public String traceReduceMethod;

    public static ListTracesDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTracesDatasRequest self = new ListTracesDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListTracesDatasRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListTracesDatasRequest setFilters(java.util.List<ListTracesDatasRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListTracesDatasRequestFilters> getFilters() {
        return this.filters;
    }

    public ListTracesDatasRequest setHasEvents(Boolean hasEvents) {
        this.hasEvents = hasEvents;
        return this;
    }
    public Boolean getHasEvents() {
        return this.hasEvents;
    }

    public ListTracesDatasRequest setHasStatusMessage(Boolean hasStatusMessage) {
        this.hasStatusMessage = hasStatusMessage;
        return this;
    }
    public Boolean getHasStatusMessage() {
        return this.hasStatusMessage;
    }

    public ListTracesDatasRequest setLlmAppName(String llmAppName) {
        this.llmAppName = llmAppName;
        return this;
    }
    public String getLlmAppName() {
        return this.llmAppName;
    }

    public ListTracesDatasRequest setMaxDuration(Float maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public Float getMaxDuration() {
        return this.maxDuration;
    }

    public ListTracesDatasRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
    }

    public ListTracesDatasRequest setMinDuration(Float minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Float getMinDuration() {
        return this.minDuration;
    }

    public ListTracesDatasRequest setMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public String getMinTime() {
        return this.minTime;
    }

    public ListTracesDatasRequest setOpentelemetryCompatible(Boolean opentelemetryCompatible) {
        this.opentelemetryCompatible = opentelemetryCompatible;
        return this;
    }
    public Boolean getOpentelemetryCompatible() {
        return this.opentelemetryCompatible;
    }

    public ListTracesDatasRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListTracesDatasRequest setOwnerSubId(String ownerSubId) {
        this.ownerSubId = ownerSubId;
        return this;
    }
    public String getOwnerSubId() {
        return this.ownerSubId;
    }

    public ListTracesDatasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTracesDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTracesDatasRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListTracesDatasRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTracesDatasRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListTracesDatasRequest setSpanIds(java.util.List<String> spanIds) {
        this.spanIds = spanIds;
        return this;
    }
    public java.util.List<String> getSpanIds() {
        return this.spanIds;
    }

    public ListTracesDatasRequest setSpanName(String spanName) {
        this.spanName = spanName;
        return this;
    }
    public String getSpanName() {
        return this.spanName;
    }

    public ListTracesDatasRequest setTraceIds(java.util.List<String> traceIds) {
        this.traceIds = traceIds;
        return this;
    }
    public java.util.List<String> getTraceIds() {
        return this.traceIds;
    }

    public ListTracesDatasRequest setTraceReduceMethod(String traceReduceMethod) {
        this.traceReduceMethod = traceReduceMethod;
        return this;
    }
    public String getTraceReduceMethod() {
        return this.traceReduceMethod;
    }

    public static class ListTracesDatasRequestFilters extends TeaModel {
        /**
         * <p>The name of the filter parameter, case-insensitive. Supported parameters: \&quot;serviceid\&quot;, \&quot;servicename\&quot;, \&quot;input\&quot;, \&quot;output\&quot;, \&quot;status\&quot;, \&quot;tracetype\&quot;, and \&quot;tracename\&quot;.</p>
         * <p>The otel span attributes corresponding to the parameters:</p>
         * <p>serviceid: resources.service.id</p>
         * <p>servicename: resources.service.name</p>
         * <p>input: attributes.input.value</p>
         * <p>output: attributes.output.value</p>
         * <p>status: statusCode</p>
         * <p>tracetype: the attributes.gen_ai.span.kind of span whose parentSpanId is 0</p>
         * <p>tracename: the spanName of span whose parentSpanId is 0</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Status</li>
         * <li>SpanName</li>
         * <li>Input</li>
         * <li>TraceType</li>
         * <li>SpanType</li>
         * <li>ServiceName</li>
         * <li>Output</li>
         * <li>TraceName</li>
         * <li>ServiceId</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>output</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter operator. Case-insensitive. Supported operators: \&quot;=\&quot;, \&quot;contains\&quot;, and \&quot;startswith\&quot;.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>contains</li>
         * <li>\=</li>
         * <li>startsWith</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value of the filter parameter. For the contains operation, it is case-sensitive. For other operations, it is case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>cretain filter string</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTracesDatasRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListTracesDatasRequestFilters self = new ListTracesDatasRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListTracesDatasRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTracesDatasRequestFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListTracesDatasRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
