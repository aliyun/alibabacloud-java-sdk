// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildLivePortraitModelScopeProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static PopBuildLivePortraitModelScopeProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopBuildLivePortraitModelScopeProjectRequest self = new PopBuildLivePortraitModelScopeProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopBuildLivePortraitModelScopeProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
