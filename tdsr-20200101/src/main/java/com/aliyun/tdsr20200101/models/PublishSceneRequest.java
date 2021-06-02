// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishSceneRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static PublishSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishSceneRequest self = new PublishSceneRequest();
        return TeaModel.build(map, self);
    }

    public PublishSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
