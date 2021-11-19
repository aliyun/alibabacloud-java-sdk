// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopDebugPtsSceneRequest extends TeaModel {
    @NameInMap("PlanId")
    public String planId;

    @NameInMap("SceneId")
    public String sceneId;

    public static StopDebugPtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDebugPtsSceneRequest self = new StopDebugPtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public StopDebugPtsSceneRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public StopDebugPtsSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
