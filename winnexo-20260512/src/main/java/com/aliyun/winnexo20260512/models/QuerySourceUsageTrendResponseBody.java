// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySourceUsageTrendResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error details.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The trend details.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;bucketStart&quot;:&quot;2026-11-01T00:00:00Z&quot;,&quot;retrievalCount&quot;:12,&quot;usageCount&quot;:5}]</p>
     */
    @NameInMap("trend")
    public java.util.List<QuerySourceUsageTrendResponseBodyTrend> trend;

    public static QuerySourceUsageTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySourceUsageTrendResponseBody self = new QuerySourceUsageTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySourceUsageTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySourceUsageTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySourceUsageTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySourceUsageTrendResponseBody setTrend(java.util.List<QuerySourceUsageTrendResponseBodyTrend> trend) {
        this.trend = trend;
        return this;
    }
    public java.util.List<QuerySourceUsageTrendResponseBodyTrend> getTrend() {
        return this.trend;
    }

    public static class QuerySourceUsageTrendResponseBodyTrend extends TeaModel {
        /**
         * <p>The start time of the natural bucket with the selected time zone. The first bucket may start earlier than the startTime.</p>
         * 
         * <strong>example:</strong>
         * <p>Start time of the natural bucket with the selected time zone. The first bucket may start earlier than the startTime</p>
         */
        @NameInMap("bucketStart")
        public String bucketStart;

        /**
         * <p>The number of retrieval recalls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retrievalCount")
        public Long retrievalCount;

        /**
         * <p>The deduplicated number of sources with retrieval events.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("retrievedSourceCount")
        public Long retrievedSourceCount;

        /**
         * <p>The number of rows in the source data.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("sourceCount")
        public Long sourceCount;

        /**
         * <p>The number of times used by the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("usageCount")
        public Long usageCount;

        /**
         * <p>The deduplicated number of sources with usage events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("usedSourceCount")
        public Long usedSourceCount;

        public static QuerySourceUsageTrendResponseBodyTrend build(java.util.Map<String, ?> map) throws Exception {
            QuerySourceUsageTrendResponseBodyTrend self = new QuerySourceUsageTrendResponseBodyTrend();
            return TeaModel.build(map, self);
        }

        public QuerySourceUsageTrendResponseBodyTrend setBucketStart(String bucketStart) {
            this.bucketStart = bucketStart;
            return this;
        }
        public String getBucketStart() {
            return this.bucketStart;
        }

        public QuerySourceUsageTrendResponseBodyTrend setRetrievalCount(Long retrievalCount) {
            this.retrievalCount = retrievalCount;
            return this;
        }
        public Long getRetrievalCount() {
            return this.retrievalCount;
        }

        public QuerySourceUsageTrendResponseBodyTrend setRetrievedSourceCount(Long retrievedSourceCount) {
            this.retrievedSourceCount = retrievedSourceCount;
            return this;
        }
        public Long getRetrievedSourceCount() {
            return this.retrievedSourceCount;
        }

        public QuerySourceUsageTrendResponseBodyTrend setSourceCount(Long sourceCount) {
            this.sourceCount = sourceCount;
            return this;
        }
        public Long getSourceCount() {
            return this.sourceCount;
        }

        public QuerySourceUsageTrendResponseBodyTrend setUsageCount(Long usageCount) {
            this.usageCount = usageCount;
            return this;
        }
        public Long getUsageCount() {
            return this.usageCount;
        }

        public QuerySourceUsageTrendResponseBodyTrend setUsedSourceCount(Long usedSourceCount) {
            this.usedSourceCount = usedSourceCount;
            return this;
        }
        public Long getUsedSourceCount() {
            return this.usedSourceCount;
        }

    }

}
