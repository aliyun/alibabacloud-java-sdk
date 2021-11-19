// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartDebugPtsSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    public static StartDebugPtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDebugPtsSceneRequest self = new StartDebugPtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public StartDebugPtsSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
