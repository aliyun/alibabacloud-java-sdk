// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseCreditUsageSummaryByMemberRequest extends TeaModel {
    /**
     * <p>The end time of the query range, exclusive. It must be later than StartTime. Use the ISO 8601 time format, such as 2026-10-08T00:00:00Z (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-08T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The billable item used to filter records. Valid values: KnowledgeBaseRead (knowledge base read), MemoryRead (memory base read), MemoryWrite (memory base write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context evolution). If omitted, all billable items that consume credits are included. Storage items or unlisted values return InvalidParameter.</p>
     * 
     * <strong>example:</strong>
     * <p>MemoryWrite</p>
     */
    @NameInMap("Item")
    public String item;

    /**
     * <p>The member ID used to filter the aggregated results. If specified, only this member is analyzed without changing the caller identity. An empty list is returned if no matching records are found.</p>
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
     * <p>The maximum number of members to return per page. Valid values: 1 to 200. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query range, inclusive. Use the ISO 8601 time format, such as 2026-10-01T00:00:00Z (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-01T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the workspace to be analyzed. This parameter is required. The workspace must belong to the caller\&quot;s account. Locked workspaces can still be queried. Member IDs are unique only within their respective workspaces, and cross-workspace ranking is not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-x9z4ctzed9gfu2w</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetContextDatabaseCreditUsageSummaryByMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseCreditUsageSummaryByMemberRequest self = new GetContextDatabaseCreditUsageSummaryByMemberRequest();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseCreditUsageSummaryByMemberRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberRequest setItem(String item) {
        this.item = item;
        return this;
    }
    public String getItem() {
        return this.item;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
