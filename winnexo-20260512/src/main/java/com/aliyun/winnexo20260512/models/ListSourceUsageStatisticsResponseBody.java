// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSourceUsageStatisticsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether there is a next page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The user information.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;sourceId&quot;:&quot;src_9401&quot;,&quot;sourceName&quot;:&quot;Product documentation&quot;,&quot;sourceType&quot;:&quot;KNOWLEDGE_BASE&quot;,&quot;retrievalCount&quot;:12,&quot;usageCount&quot;:5,&quot;lastEventTime&quot;:&quot;2026-11-05T08:00:00Z&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<ListSourceUsageStatisticsResponseBodyItems> items;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The page size. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of data entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListSourceUsageStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSourceUsageStatisticsResponseBody self = new ListSourceUsageStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSourceUsageStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSourceUsageStatisticsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListSourceUsageStatisticsResponseBody setItems(java.util.List<ListSourceUsageStatisticsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSourceUsageStatisticsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSourceUsageStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSourceUsageStatisticsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListSourceUsageStatisticsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSourceUsageStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSourceUsageStatisticsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListSourceUsageStatisticsResponseBodyItems extends TeaModel {
        /**
         * <p>The most recent reporting and ingestion time within the filtered range.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-02 11:20:09</p>
         */
        @NameInMap("lastEventTime")
        public String lastEventTime;

        /**
         * <p>The number of deduplicated sources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("retrievalCount")
        public Long retrievalCount;

        /**
         * <p>The data source ID, which is unique within the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("sourceName")
        public String sourceName;

        /**
         * <p>The skill source type.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILTIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The number of used sources.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("usageCount")
        public Long usageCount;

        public static ListSourceUsageStatisticsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSourceUsageStatisticsResponseBodyItems self = new ListSourceUsageStatisticsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSourceUsageStatisticsResponseBodyItems setLastEventTime(String lastEventTime) {
            this.lastEventTime = lastEventTime;
            return this;
        }
        public String getLastEventTime() {
            return this.lastEventTime;
        }

        public ListSourceUsageStatisticsResponseBodyItems setRetrievalCount(Long retrievalCount) {
            this.retrievalCount = retrievalCount;
            return this;
        }
        public Long getRetrievalCount() {
            return this.retrievalCount;
        }

        public ListSourceUsageStatisticsResponseBodyItems setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListSourceUsageStatisticsResponseBodyItems setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListSourceUsageStatisticsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListSourceUsageStatisticsResponseBodyItems setUsageCount(Long usageCount) {
            this.usageCount = usageCount;
            return this;
        }
        public Long getUsageCount() {
            return this.usageCount;
        }

    }

}
