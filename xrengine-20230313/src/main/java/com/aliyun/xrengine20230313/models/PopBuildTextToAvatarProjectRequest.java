// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildTextToAvatarProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static PopBuildTextToAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopBuildTextToAvatarProjectRequest self = new PopBuildTextToAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopBuildTextToAvatarProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
