// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishStatusRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static PublishStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishStatusRequest self = new PublishStatusRequest();
        return TeaModel.build(map, self);
    }

    public PublishStatusRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
