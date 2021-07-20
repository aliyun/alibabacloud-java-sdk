// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class TempPreviewRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static TempPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        TempPreviewRequest self = new TempPreviewRequest();
        return TeaModel.build(map, self);
    }

    public TempPreviewRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
