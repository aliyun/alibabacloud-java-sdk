// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetOpenJMeterSceneRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static GetOpenJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpenJMeterSceneRequest self = new GetOpenJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

    public GetOpenJMeterSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
