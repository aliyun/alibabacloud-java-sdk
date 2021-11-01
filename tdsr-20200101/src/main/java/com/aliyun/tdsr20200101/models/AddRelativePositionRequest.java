// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddRelativePositionRequest extends TeaModel {
    // 相对位置信息
    @NameInMap("RelativePosition")
    public String relativePosition;

    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static AddRelativePositionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRelativePositionRequest self = new AddRelativePositionRequest();
        return TeaModel.build(map, self);
    }

    public AddRelativePositionRequest setRelativePosition(String relativePosition) {
        this.relativePosition = relativePosition;
        return this;
    }
    public String getRelativePosition() {
        return this.relativePosition;
    }

    public AddRelativePositionRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
