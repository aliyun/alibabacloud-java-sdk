// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CopySceneRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SceneName")
    public String sceneName;

    public static CopySceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CopySceneRequest self = new CopySceneRequest();
        return TeaModel.build(map, self);
    }

    public CopySceneRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
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
