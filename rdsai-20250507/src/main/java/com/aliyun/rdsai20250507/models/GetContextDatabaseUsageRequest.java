// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseUsageRequest extends TeaModel {
    /**
     * <p>The end time of the query range, exclusive. It must be later than <code>StartTime</code>. Use the ISO 8601 time format, such as <code>2026-08-01T00:00:00Z</code> (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time of the query range, inclusive. Use the ISO 8601 time format, such as <code>2026-07-01T00:00:00Z</code> (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-01T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the workspace to query. If specified, only the data of this workspace under the caller account is queried. Locked workspaces can also be queried. If omitted, all workspaces under the caller account are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-x9z4ctzed9gfu2w</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetContextDatabaseUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseUsageRequest self = new GetContextDatabaseUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseUsageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetContextDatabaseUsageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetContextDatabaseUsageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
