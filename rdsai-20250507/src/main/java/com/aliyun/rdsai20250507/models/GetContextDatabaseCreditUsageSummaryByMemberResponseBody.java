// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseCreditUsageSummaryByMemberResponseBody extends TeaModel {
    /**
     * <p>The end time of the query range passed in the request, exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-08T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The member summaries on the current page, sorted in descending order of total credit consumption. Each record covers the entire query range.</p>
     */
    @NameInMap("Items")
    public java.util.List<GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems> items;

    /**
     * <p>The actual page number used for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The actual number of items per page used for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
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
     * <p>2026-10-01T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of members that match the filter criteria. This is not the number of metering records and is not affected by pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The ID of the workspace queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-x9z4ctzed9gfu2w</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetContextDatabaseCreditUsageSummaryByMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseCreditUsageSummaryByMemberResponseBody self = new GetContextDatabaseCreditUsageSummaryByMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody setItems(java.util.List<GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems> getItems() {
        return this.items;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems extends TeaModel {
        /**
         * <p>The total credit consumption of priced records for the member. Returned as a decimal string with up to 6 decimal places. 1 credit equals 1 CNY. The value is null if there are no priced records.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2513</p>
         */
        @NameInMap("Credits")
        public String credits;

        /**
         * <p>The member ID. Historical or system records may not have a member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mb-abcdefghijklmno</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The total metered quantity of records that match the filter criteria for the member, including unpriced records. To view the usage of a specific billable item, specify Item in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <p>The number of metering records that match the filter criteria for the member, including unpriced records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RecordCount")
        public Long recordCount;

        public static GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems self = new GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems setCredits(String credits) {
            this.credits = credits;
            return this;
        }
        public String getCredits() {
            return this.credits;
        }

        public GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public GetContextDatabaseCreditUsageSummaryByMemberResponseBodyItems setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

    }

}
