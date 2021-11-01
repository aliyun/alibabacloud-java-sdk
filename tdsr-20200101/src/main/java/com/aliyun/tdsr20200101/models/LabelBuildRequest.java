// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LabelBuildRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static LabelBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        LabelBuildRequest self = new LabelBuildRequest();
        return TeaModel.build(map, self);
    }

    public LabelBuildRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public LabelBuildRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
