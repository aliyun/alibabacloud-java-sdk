// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildFeatureToAvatarProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static PopBuildFeatureToAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopBuildFeatureToAvatarProjectRequest self = new PopBuildFeatureToAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopBuildFeatureToAvatarProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
