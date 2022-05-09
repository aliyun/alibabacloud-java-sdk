// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PackSceneRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    // 操作类型：download（下载），sync（同步）
    @NameInMap("Type")
    public String type;

    public static PackSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        PackSceneRequest self = new PackSceneRequest();
        return TeaModel.build(map, self);
    }

    public PackSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public PackSceneRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
