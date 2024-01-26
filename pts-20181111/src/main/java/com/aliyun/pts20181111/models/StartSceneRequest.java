// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class StartSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    public Long sceneId;

    public static StartSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSceneRequest self = new StartSceneRequest();
        return TeaModel.build(map, self);
    }

    public StartSceneRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
