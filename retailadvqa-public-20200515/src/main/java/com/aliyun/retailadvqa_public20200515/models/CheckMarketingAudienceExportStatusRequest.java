// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckMarketingAudienceExportStatusRequest extends TeaModel {
    // 受众Id
    @NameInMap("AudienceId")
    public String audienceId;

    // 租户Id
    @NameInMap("AccessId")
    public String accessId;

    // 空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CheckMarketingAudienceExportStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMarketingAudienceExportStatusRequest self = new CheckMarketingAudienceExportStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckMarketingAudienceExportStatusRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public CheckMarketingAudienceExportStatusRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CheckMarketingAudienceExportStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
