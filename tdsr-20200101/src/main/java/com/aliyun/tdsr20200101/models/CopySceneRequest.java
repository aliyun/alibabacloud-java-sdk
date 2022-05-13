// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CopySceneRequest extends TeaModel {
    // 场景Id
    @NameInMap("SceneId")
    public String sceneId;

    // 新场景名称
    @NameInMap("SceneName")
    public String sceneName;

    public static CopySceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CopySceneRequest self = new CopySceneRequest();
        return TeaModel.build(map, self);
    }

    public CopySceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CopySceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

}
