// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class AudiencePushStatusRequest extends TeaModel {
    @NameInMap("AudienceId")
    public String audienceId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("AccessId")
    public String accessId;

    public static AudiencePushStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        AudiencePushStatusRequest self = new AudiencePushStatusRequest();
        return TeaModel.build(map, self);
    }

    public AudiencePushStatusRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public AudiencePushStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AudiencePushStatusRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

}
