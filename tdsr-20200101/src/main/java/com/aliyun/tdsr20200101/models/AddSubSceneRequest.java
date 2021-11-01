// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddSubSceneRequest extends TeaModel {
    // 子场景名称
    @NameInMap("Name")
    public String name;

    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static AddSubSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSubSceneRequest self = new AddSubSceneRequest();
        return TeaModel.build(map, self);
    }

    public AddSubSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddSubSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
