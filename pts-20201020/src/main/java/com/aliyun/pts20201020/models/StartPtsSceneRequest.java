// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartPtsSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    public static StartPtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPtsSceneRequest self = new StartPtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public StartPtsSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
