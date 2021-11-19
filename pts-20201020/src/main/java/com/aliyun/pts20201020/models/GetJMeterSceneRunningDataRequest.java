// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSceneRunningDataRequest extends TeaModel {
    // 场景id
    @NameInMap("SceneId")
    public String sceneId;

    public static GetJMeterSceneRunningDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSceneRunningDataRequest self = new GetJMeterSceneRunningDataRequest();
        return TeaModel.build(map, self);
    }

    public GetJMeterSceneRunningDataRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
