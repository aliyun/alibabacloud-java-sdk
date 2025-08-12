// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListTracesDatasShrinkRequest extends TeaModel {
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
    public String filtersShrink;

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
    public String spanIdsShrink;

    @NameInMap("SpanName")
    public String spanName;

    /**
     * <p>The list of trace IDs.</p>
     */
    @NameInMap("TraceIds")
    public String traceIdsShrink;

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

    public static ListTracesDatasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTracesDatasShrinkRequest self = new ListTracesDatasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTracesDatasShrinkRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListTracesDatasShrinkRequest setFiltersShrink(String filtersShrink) {
        this.filtersShrink = filtersShrink;
        return this;
    }
    public String getFiltersShrink() {
        return this.filtersShrink;
    }

    public ListTracesDatasShrinkRequest setHasEvents(Boolean hasEvents) {
        this.hasEvents = hasEvents;
        return this;
    }
    public Boolean getHasEvents() {
        return this.hasEvents;
    }

    public ListTracesDatasShrinkRequest setHasStatusMessage(Boolean hasStatusMessage) {
        this.hasStatusMessage = hasStatusMessage;
        return this;
    }
    public Boolean getHasStatusMessage() {
        return this.hasStatusMessage;
    }

    public ListTracesDatasShrinkRequest setLlmAppName(String llmAppName) {
        this.llmAppName = llmAppName;
        return this;
    }
    public String getLlmAppName() {
        return this.llmAppName;
    }

    public ListTracesDatasShrinkRequest setMaxDuration(Float maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public Float getMaxDuration() {
        return this.maxDuration;
    }

    public ListTracesDatasShrinkRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
    }

    public ListTracesDatasShrinkRequest setMinDuration(Float minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Float getMinDuration() {
        return this.minDuration;
    }

    public ListTracesDatasShrinkRequest setMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public String getMinTime() {
        return this.minTime;
    }

    public ListTracesDatasShrinkRequest setOpentelemetryCompatible(Boolean opentelemetryCompatible) {
        this.opentelemetryCompatible = opentelemetryCompatible;
        return this;
    }
    public Boolean getOpentelemetryCompatible() {
        return this.opentelemetryCompatible;
    }

    public ListTracesDatasShrinkRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListTracesDatasShrinkRequest setOwnerSubId(String ownerSubId) {
        this.ownerSubId = ownerSubId;
        return this;
    }
    public String getOwnerSubId() {
        return this.ownerSubId;
    }

    public ListTracesDatasShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTracesDatasShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTracesDatasShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListTracesDatasShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTracesDatasShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListTracesDatasShrinkRequest setSpanIdsShrink(String spanIdsShrink) {
        this.spanIdsShrink = spanIdsShrink;
        return this;
    }
    public String getSpanIdsShrink() {
        return this.spanIdsShrink;
    }

    public ListTracesDatasShrinkRequest setSpanName(String spanName) {
        this.spanName = spanName;
        return this;
    }
    public String getSpanName() {
        return this.spanName;
    }

    public ListTracesDatasShrinkRequest setTraceIdsShrink(String traceIdsShrink) {
        this.traceIdsShrink = traceIdsShrink;
        return this;
    }
    public String getTraceIdsShrink() {
        return this.traceIdsShrink;
    }

    public ListTracesDatasShrinkRequest setTraceReduceMethod(String traceReduceMethod) {
        this.traceReduceMethod = traceReduceMethod;
        return this;
    }
    public String getTraceReduceMethod() {
        return this.traceReduceMethod;
    }

}
