// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateSceneRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    public static CreateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneRequest self = new CreateSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSceneRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
