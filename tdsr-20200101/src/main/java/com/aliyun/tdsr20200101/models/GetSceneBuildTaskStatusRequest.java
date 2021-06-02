// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSceneBuildTaskStatusRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static GetSceneBuildTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSceneBuildTaskStatusRequest self = new GetSceneBuildTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSceneBuildTaskStatusRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
