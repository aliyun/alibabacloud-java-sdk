// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListTracesDatasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>end-user.12345</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("Filters")
    public java.util.List<ListTracesDatasRequestFilters> filters;

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
    public java.util.List<String> spanIds;

    @NameInMap("TraceIds")
    public java.util.List<String> traceIds;

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

    public ListTracesDatasRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
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
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

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
