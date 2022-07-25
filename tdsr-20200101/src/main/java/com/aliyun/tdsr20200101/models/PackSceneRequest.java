// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PackSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("Type")
    public String type;

    public static PackSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        PackSceneRequest self = new PackSceneRequest();
        return TeaModel.build(map, self);
    }

    public PackSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public PackSceneRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
