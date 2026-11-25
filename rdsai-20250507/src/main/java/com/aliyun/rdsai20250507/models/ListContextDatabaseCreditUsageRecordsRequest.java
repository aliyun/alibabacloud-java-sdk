// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseCreditUsageRecordsRequest extends TeaModel {
    /**
     * <p>The end time of the query range, exclusive. It must be later than StartTime. Use the ISO 8601 time format, such as <code>2026-10-15T00:00:00Z</code> (UTC). The maximum length of the query range is 31 days. If the limit is exceeded, InvalidParameter is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-15T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The billing item used to filter records. Valid values: KnowledgeBaseRead (knowledge base read), MemoryRead (memory base read), MemoryWrite (memory base write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context growth). If omitted, all billing items that consume credits are included. Storage items or unlisted values return InvalidParameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ContextGrowth</p>
     */
    @NameInMap("Item")
    public String item;

    /**
     * <p>The member ID used to filter records. If specified, WorkspaceId must also be provided. Otherwise, InvalidParameter is returned. A member ID is unique only within its workspace. This parameter only filters data and does not change the caller identity. Records without a member ID are not matched.</p>
     * 
     * <strong>example:</strong>
     * <p>mb-abcdefghijklmno</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The maximum number of records to return per page. Valid values: 1 to 200. Default value: 50. The pagination offset (Page - 1) × PageSize must not exceed 10,000.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field by which to sort. Only credits is supported. If omitted, results are sorted in descending order of request time. Specifying a sort field does not change the total number of filtered records.</p>
     * 
     * <strong>example:</strong>
     * <p>credits</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Valid values: asc for ascending order and desc for descending order. The values are case-insensitive. The default value is desc when SortBy is specified. If only SortOrder is provided, InvalidParameter is returned. When sorting by credits, unpriced records are always placed at the end, and records with the same amount are sorted in descending order of request time.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The start time of the query range, inclusive. Use the ISO 8601 time format, such as <code>2026-09-15T00:00:00Z</code> (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-15T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The context growth sub-item used to filter records. Valid values: KnowledgeOrganization (knowledge organization), MemoryPromotion (memory promotion), KnowledgeReview (knowledge review), KnowledgeEvolution (knowledge evolution), and MemoryEvolution (memory evolution). The values are case-sensitive. If only SubItem is provided, the billing item is automatically restricted to ContextGrowth. If other Item values are provided simultaneously or the sub-item is not in the list, InvalidParameter is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>KnowledgeReview</p>
     */
    @NameInMap("SubItem")
    public String subItem;

    /**
     * <p>The ID of the workspace to query. If specified, only the data of this workspace under the caller account is queried, and locked workspaces can also be queried. If omitted, all workspaces under the caller account are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-x9z4ctzed9gfu2w</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListContextDatabaseCreditUsageRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseCreditUsageRecordsRequest self = new ListContextDatabaseCreditUsageRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseCreditUsageRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setItem(String item) {
        this.item = item;
        return this;
    }
    public String getItem() {
        return this.item;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setSubItem(String subItem) {
        this.subItem = subItem;
        return this;
    }
    public String getSubItem() {
        return this.subItem;
    }

    public ListContextDatabaseCreditUsageRecordsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
