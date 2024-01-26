// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class StopSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    public Long sceneId;

    public static StopSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSceneRequest self = new StopSceneRequest();
        return TeaModel.build(map, self);
    }

    public StopSceneRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
