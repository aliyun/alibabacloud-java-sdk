// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ScenePublishRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static ScenePublishRequest build(java.util.Map<String, ?> map) throws Exception {
        ScenePublishRequest self = new ScenePublishRequest();
        return TeaModel.build(map, self);
    }

    public ScenePublishRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
