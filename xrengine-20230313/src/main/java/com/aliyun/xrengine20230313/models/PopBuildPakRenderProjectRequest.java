// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildPakRenderProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static PopBuildPakRenderProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopBuildPakRenderProjectRequest self = new PopBuildPakRenderProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopBuildPakRenderProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
