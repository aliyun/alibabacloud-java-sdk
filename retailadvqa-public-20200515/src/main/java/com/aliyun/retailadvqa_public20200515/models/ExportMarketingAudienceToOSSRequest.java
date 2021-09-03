// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ExportMarketingAudienceToOSSRequest extends TeaModel {
    // 租户Id
    @NameInMap("AccessId")
    public String accessId;

    // 空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 受众Id
    @NameInMap("AudienceId")
    public String audienceId;

    public static ExportMarketingAudienceToOSSRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportMarketingAudienceToOSSRequest self = new ExportMarketingAudienceToOSSRequest();
        return TeaModel.build(map, self);
    }

    public ExportMarketingAudienceToOSSRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ExportMarketingAudienceToOSSRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ExportMarketingAudienceToOSSRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

}
