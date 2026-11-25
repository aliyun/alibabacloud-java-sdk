// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseCreditUsageRecordsResponseBody extends TeaModel {
    /**
     * <p>The query dimension. Valid values: Workspace indicates a single workspace, and Account indicates all workspaces under the caller account.</p>
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
     * <p>The actual page number used for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The actual page size used for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The metering records on the current page. If SortBy is not specified, the records are sorted in descending order of request time.</p>
     */
    @NameInMap("Records")
    public java.util.List<ListContextDatabaseCreditUsageRecordsResponseBodyRecords> records;

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
     * <p>The total number of metering records that match the filter conditions, which is not affected by pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The ID of the queried workspace. This parameter has a value only when Dimension is Workspace. It is empty for the account dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-x9z4ctzed9gfu2w</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListContextDatabaseCreditUsageRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseCreditUsageRecordsResponseBody self = new ListContextDatabaseCreditUsageRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setRecords(java.util.List<ListContextDatabaseCreditUsageRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListContextDatabaseCreditUsageRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListContextDatabaseCreditUsageRecordsResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListContextDatabaseCreditUsageRecordsResponseBodyRecords extends TeaModel {
        /**
         * <p>The credit consumption of this record. It is returned as a decimal string with up to 6 decimal places. 1 credit = 1 CNY. The amount is recorded at the time of metering and does not change with subsequent price adjustments. It is null when unpriced, which does not indicate zero consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0742</p>
         */
        @NameInMap("Credits")
        public String credits;

        /**
         * <p>The billing item of this record. Valid values: KnowledgeBaseRead (knowledge base read), MemoryRead (memory base read), MemoryWrite (memory base write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context growth).</p>
         * 
         * <strong>example:</strong>
         * <p>ContextGrowth</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The ID of the member that generated this record. Historical or system records may not have a member ID, in which case null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>mb-abcdefghijklmno</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The usage of this record. The unit is specified by Unit in the same record.</p>
         * 
         * <strong>example:</strong>
         * <p>74200</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <p>The request time when this metering record was generated, in ISO 8601 UTC time format ending with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:30:12Z</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        /**
         * <p>The context growth sub-item. Recognized values include KnowledgeOrganization (knowledge organization), MemoryPromotion (memory promotion), KnowledgeReview (knowledge review), KnowledgeEvolution (knowledge evolution), and MemoryEvolution (memory evolution). null is returned for other billing items, missing sub-items, or unrecognized sub-items.</p>
         * 
         * <strong>example:</strong>
         * <p>KnowledgeReview</p>
         */
        @NameInMap("SubItem")
        public String subItem;

        /**
         * <p>The metering unit. Valid values: Count indicates the number of times, Token indicates the number of tokens, and MicroCredit indicates one millionth of a credit.</p>
         * 
         * <strong>example:</strong>
         * <p>MicroCredit</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The ID of the workspace to which this record belongs. Even if queried by account, each record still indicates its workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-x9z4ctzed9gfu2w</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListContextDatabaseCreditUsageRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseCreditUsageRecordsResponseBodyRecords self = new ListContextDatabaseCreditUsageRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseCreditUsageRecordsResponseBodyRecords setCredits(String credits) {
            this.credits = credits;
            return this;
        }
        public String getCredits() {
            return this.credits;
        }

        public ListContextDatabaseCreditUsageRecordsResponseBodyRecords setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public ListContextDatabaseCreditUsageRecordsResponseBodyRecords setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListContextDatabaseCreditUsageRecordsResponseBodyRecords setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public ListContextDatabaseCreditUsageRecordsResponseBodyRecords setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public ListContextDatabaseCreditUsageRecordsResponseBodyRecords setSubItem(String subItem) {
            this.subItem = subItem;
            return this;
        }
        public String getSubItem() {
            return this.subItem;
        }

        public ListContextDatabaseCreditUsageRecordsResponseBodyRecords setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListContextDatabaseCreditUsageRecordsResponseBodyRecords setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
