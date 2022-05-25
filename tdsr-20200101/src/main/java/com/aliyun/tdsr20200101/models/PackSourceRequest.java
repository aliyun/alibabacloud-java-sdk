// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PackSourceRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static PackSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        PackSourceRequest self = new PackSourceRequest();
        return TeaModel.build(map, self);
    }

    public PackSourceRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
