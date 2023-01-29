// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetResourceGroupStatisticsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static GetResourceGroupStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupStatisticsRequest self = new GetResourceGroupStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetResourceGroupStatisticsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetResourceGroupStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetResourceGroupStatisticsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
