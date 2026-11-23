// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseCreditUsageSummaryRequest extends TeaModel {
    /**
     * <p>The end time of the query range, exclusive. This time must be later than StartTime. Use the ISO 8601 time format, such as 2026-10-15T00:00:00Z (UTC). The maximum time range is 7 days for hourly statistics and 31 days for daily statistics.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-15T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The bucketing granularity. Valid values: Hour (hourly) and Day (daily). The values are case-insensitive. If omitted, Hour is used by default for a time range of up to 7 days, and Day is used for a time range exceeding 7 days. The maximum time range is 7 days for Hour and 31 days for Day. If the limit is exceeded, InvalidParameter is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The billing item used to filter records. Supported values include KnowledgeBaseRead (knowledge base read), MemoryRead (memory read), MemoryWrite (memory write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context evolution). If omitted, all billing items that consume credits are included. Storage items or unlisted values return InvalidParameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ContextGrowth</p>
     */
    @NameInMap("Item")
    public String item;

    /**
     * <p>The member ID used to filter records. If specified, WorkspaceId must also be provided. Otherwise, InvalidParameter is returned. A member ID is unique only within its workspace. This parameter only filters data and does not change the caller identity. Records without a member ID are not matched. Results are still bucketed by time and billing item, and are not split by member.</p>
     * 
     * <strong>example:</strong>
     * <p>mb-abcdefghijklmno</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The start time of the query range, inclusive. Use the ISO 8601 time format, such as 2026-09-15T00:00:00Z (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-15T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The context evolution sub-item used to filter records. Supported values include KnowledgeOrganization (knowledge organization), MemoryPromotion (memory promotion), KnowledgeReview (knowledge review), KnowledgeEvolution (knowledge evolution), and MemoryEvolution (memory evolution). The values are case-sensitive. If only SubItem is provided, the billing item is automatically restricted to ContextGrowth. If other Item values are provided simultaneously or the sub-item is not in the list, InvalidParameter is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>MemoryEvolution</p>
     */
    @NameInMap("SubItem")
    public String subItem;

    /**
     * <p>The ID of the workspace to query. If specified, only the data of this workspace under the caller account is queried. Locked workspaces can also be queried. If omitted, all workspaces under the caller account are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-x9z4ctzed9gfu2w</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetContextDatabaseCreditUsageSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseCreditUsageSummaryRequest self = new GetContextDatabaseCreditUsageSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseCreditUsageSummaryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetContextDatabaseCreditUsageSummaryRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public GetContextDatabaseCreditUsageSummaryRequest setItem(String item) {
        this.item = item;
        return this;
    }
    public String getItem() {
        return this.item;
    }

    public GetContextDatabaseCreditUsageSummaryRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public GetContextDatabaseCreditUsageSummaryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetContextDatabaseCreditUsageSummaryRequest setSubItem(String subItem) {
        this.subItem = subItem;
        return this;
    }
    public String getSubItem() {
        return this.subItem;
    }

    public GetContextDatabaseCreditUsageSummaryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
