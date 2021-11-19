// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class RemoveOpenJMeterSceneRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static RemoveOpenJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveOpenJMeterSceneRequest self = new RemoveOpenJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

    public RemoveOpenJMeterSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
