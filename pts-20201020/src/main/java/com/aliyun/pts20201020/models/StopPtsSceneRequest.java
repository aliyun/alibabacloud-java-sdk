// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopPtsSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    public static StopPtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StopPtsSceneRequest self = new StopPtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public StopPtsSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
