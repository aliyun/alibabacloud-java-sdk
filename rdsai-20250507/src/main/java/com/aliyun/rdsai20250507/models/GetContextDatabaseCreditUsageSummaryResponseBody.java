// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseCreditUsageSummaryResponseBody extends TeaModel {
    /**
     * <p>The bucketing results, sorted by BucketStart, Item, and SubItem in sequence. Unpriced records are included in Quantity and RecordCount, but not in Credits.</p>
     */
    @NameInMap("Buckets")
    public java.util.List<GetContextDatabaseCreditUsageSummaryResponseBodyBuckets> buckets;

    /**
     * <p>The query dimension. Valid values: Workspace (a single workspace) and Account (all workspaces under the caller account).</p>
     * 
     * <strong>example:</strong>
     * <p>Workspace</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The end time of the query range passed in the request, exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-15T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The actual bucketing granularity used. Valid values: Hour (hourly) and Day (daily). If the request parameter is omitted, the automatically selected granularity is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The ID of the OpenAPI request, which is used to troubleshoot call issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query range passed in the request, inclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-15T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total credit consumption of priced records that meet the filter conditions within the query range. The value is returned as a decimal string with up to 6 decimal places. 1 credit = 1 CNY. If there are no priced records, the string 0 is returned. Unpriced records are not included in the total amount. Do not treat this value as the final bill amount.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2513</p>
     */
    @NameInMap("TotalCredits")
    public String totalCredits;

    /**
     * <p>The ID of the queried workspace. This parameter has a value only when Dimension is Workspace. It is empty for the account dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-x9z4ctzed9gfu2w</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetContextDatabaseCreditUsageSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseCreditUsageSummaryResponseBody self = new GetContextDatabaseCreditUsageSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseCreditUsageSummaryResponseBody setBuckets(java.util.List<GetContextDatabaseCreditUsageSummaryResponseBodyBuckets> buckets) {
        this.buckets = buckets;
        return this;
    }
    public java.util.List<GetContextDatabaseCreditUsageSummaryResponseBodyBuckets> getBuckets() {
        return this.buckets;
    }

    public GetContextDatabaseCreditUsageSummaryResponseBody setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public GetContextDatabaseCreditUsageSummaryResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetContextDatabaseCreditUsageSummaryResponseBody setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public GetContextDatabaseCreditUsageSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseCreditUsageSummaryResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetContextDatabaseCreditUsageSummaryResponseBody setTotalCredits(String totalCredits) {
        this.totalCredits = totalCredits;
        return this;
    }
    public String getTotalCredits() {
        return this.totalCredits;
    }

    public GetContextDatabaseCreditUsageSummaryResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetContextDatabaseCreditUsageSummaryResponseBodyBuckets extends TeaModel {
        /**
         * <p>The start time of the bucket, in ISO 8601 UTC time format ending with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01T00:00:00Z</p>
         */
        @NameInMap("BucketStart")
        public String bucketStart;

        /**
         * <p>The total credit consumption of priced records in the bucket. The value is returned as a decimal string with up to 6 decimal places. 1 credit = 1 CNY. If all records are unpriced, the string 0 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2513</p>
         */
        @NameInMap("Credits")
        public String credits;

        /**
         * <p>The billing item corresponding to the bucket. Valid values: KnowledgeBaseRead (knowledge base read), MemoryRead (memory read), MemoryWrite (memory write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context evolution).</p>
         * 
         * <strong>example:</strong>
         * <p>ContextGrowth</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The total usage of all records in the bucket, including unpriced records. The unit is specified by Unit.</p>
         * 
         * <strong>example:</strong>
         * <p>251300</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <p>The number of metering records in the bucket, including unpriced records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RecordCount")
        public Long recordCount;

        /**
         * <p>The context evolution sub-item. Recognized values include KnowledgeOrganization (knowledge organization), MemoryPromotion (memory promotion), KnowledgeReview (knowledge review), KnowledgeEvolution (knowledge evolution), and MemoryEvolution (memory evolution). For other billing items, missing sub-items, or unrecognized sub-items, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MemoryEvolution</p>
         */
        @NameInMap("SubItem")
        public String subItem;

        /**
         * <p>The unit of measurement. Valid values: Count (number of times), Token (number of tokens), and MicroCredit (one millionth of a credit).</p>
         * 
         * <strong>example:</strong>
         * <p>MicroCredit</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static GetContextDatabaseCreditUsageSummaryResponseBodyBuckets build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseCreditUsageSummaryResponseBodyBuckets self = new GetContextDatabaseCreditUsageSummaryResponseBodyBuckets();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseCreditUsageSummaryResponseBodyBuckets setBucketStart(String bucketStart) {
            this.bucketStart = bucketStart;
            return this;
        }
        public String getBucketStart() {
            return this.bucketStart;
        }

        public GetContextDatabaseCreditUsageSummaryResponseBodyBuckets setCredits(String credits) {
            this.credits = credits;
            return this;
        }
        public String getCredits() {
            return this.credits;
        }

        public GetContextDatabaseCreditUsageSummaryResponseBodyBuckets setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public GetContextDatabaseCreditUsageSummaryResponseBodyBuckets setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public GetContextDatabaseCreditUsageSummaryResponseBodyBuckets setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public GetContextDatabaseCreditUsageSummaryResponseBodyBuckets setSubItem(String subItem) {
            this.subItem = subItem;
            return this;
        }
        public String getSubItem() {
            return this.subItem;
        }

        public GetContextDatabaseCreditUsageSummaryResponseBodyBuckets setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
