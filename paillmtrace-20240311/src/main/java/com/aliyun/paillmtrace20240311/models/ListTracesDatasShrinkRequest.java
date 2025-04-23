// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListTracesDatasShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>end-user.12345</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("Filters")
    public String filtersShrink;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("HasEvents")
    public Boolean hasEvents;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("HasStatusMessage")
    public Boolean hasStatusMessage;

    /**
     * <strong>example:</strong>
     * <p>My.super_LLM-app2</p>
     */
    @NameInMap("LlmAppName")
    public String llmAppName;

    /**
     * <strong>example:</strong>
     * <p>2024-01-31
     * 2024-12-31 23:59:59</p>
     */
    @NameInMap("MaxTime")
    public String maxTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-31
     * 2024-12-31 23:59:59</p>
     */
    @NameInMap("MinTime")
    public String minTime;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("OpentelemetryCompatible")
    public Boolean opentelemetryCompatible;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("OwnerSubId")
    public String ownerSubId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("SpanIds")
    public String spanIdsShrink;

    @NameInMap("TraceIds")
    public String traceIdsShrink;

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

    public ListTracesDatasShrinkRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
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
