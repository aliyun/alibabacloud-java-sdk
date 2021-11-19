// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartTestingJMeterSceneRequest extends TeaModel {
    // 场景id
    @NameInMap("SceneId")
    public String sceneId;

    public static StartTestingJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTestingJMeterSceneRequest self = new StartTestingJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

    public StartTestingJMeterSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
