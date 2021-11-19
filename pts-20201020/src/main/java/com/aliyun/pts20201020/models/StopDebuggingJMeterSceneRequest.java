// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopDebuggingJMeterSceneRequest extends TeaModel {
    // 场景id
    @NameInMap("SceneId")
    public String sceneId;

    public static StopDebuggingJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDebuggingJMeterSceneRequest self = new StopDebuggingJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

    public StopDebuggingJMeterSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
