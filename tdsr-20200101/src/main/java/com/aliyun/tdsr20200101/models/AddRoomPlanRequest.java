// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddRoomPlanRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static AddRoomPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRoomPlanRequest self = new AddRoomPlanRequest();
        return TeaModel.build(map, self);
    }

    public AddRoomPlanRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
