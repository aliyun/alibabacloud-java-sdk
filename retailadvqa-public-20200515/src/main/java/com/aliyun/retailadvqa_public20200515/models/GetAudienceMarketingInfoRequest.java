// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetAudienceMarketingInfoRequest extends TeaModel {
    // 租户id
    @NameInMap("AccessId")
    public String accessId;

    // yyyy-MM-dd HH:mm:ss
    @NameInMap("LatestDataModifyEndTime")
    public String latestDataModifyEndTime;

    // yyyy-MM-dd HH:mm:ss
    @NameInMap("LatestDataModifyStartTime")
    public String latestDataModifyStartTime;

    // 页码
    @NameInMap("PageNum")
    public Long pageNum;

    // 单页行数
    @NameInMap("PageSize")
    public Long pageSize;

    // 空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetAudienceMarketingInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudienceMarketingInfoRequest self = new GetAudienceMarketingInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAudienceMarketingInfoRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetAudienceMarketingInfoRequest setLatestDataModifyEndTime(String latestDataModifyEndTime) {
        this.latestDataModifyEndTime = latestDataModifyEndTime;
        return this;
    }
    public String getLatestDataModifyEndTime() {
        return this.latestDataModifyEndTime;
    }

    public GetAudienceMarketingInfoRequest setLatestDataModifyStartTime(String latestDataModifyStartTime) {
        this.latestDataModifyStartTime = latestDataModifyStartTime;
        return this;
    }
    public String getLatestDataModifyStartTime() {
        return this.latestDataModifyStartTime;
    }

    public GetAudienceMarketingInfoRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public GetAudienceMarketingInfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetAudienceMarketingInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
