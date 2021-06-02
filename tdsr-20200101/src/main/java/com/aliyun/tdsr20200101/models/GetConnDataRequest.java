// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetConnDataRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static GetConnDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnDataRequest self = new GetConnDataRequest();
        return TeaModel.build(map, self);
    }

    public GetConnDataRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
