// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LabelBuildRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("Mode")
    public String mode;

    public static LabelBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        LabelBuildRequest self = new LabelBuildRequest();
        return TeaModel.build(map, self);
    }

    public LabelBuildRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public LabelBuildRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
