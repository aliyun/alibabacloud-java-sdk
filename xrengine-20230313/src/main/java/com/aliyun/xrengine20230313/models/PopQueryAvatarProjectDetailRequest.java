// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryAvatarProjectDetailRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static PopQueryAvatarProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        PopQueryAvatarProjectDetailRequest self = new PopQueryAvatarProjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public PopQueryAvatarProjectDetailRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
