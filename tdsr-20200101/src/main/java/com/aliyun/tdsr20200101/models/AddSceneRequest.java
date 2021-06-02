// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddSceneRequest extends TeaModel {
    // 场景类型 3D模型：MODEL_3D  全景图片：PIC  全景视频：VIDEO
    @NameInMap("Type")
    public String type;

    // 场景名称
    @NameInMap("Name")
    public String name;

    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    public static AddSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSceneRequest self = new AddSceneRequest();
        return TeaModel.build(map, self);
    }

    public AddSceneRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddSceneRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
