// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchAudienceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AudienceId")
    public String audienceId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SearchAudienceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAudienceRequest self = new SearchAudienceRequest();
        return TeaModel.build(map, self);
    }

    public SearchAudienceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public SearchAudienceRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public SearchAudienceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
