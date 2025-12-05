// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class AdjustPtsSceneSpeedShrinkRequest extends TeaModel {
    /**
     * <p>The stress testing speed in the PTS scenario.</p>
     */
    @NameInMap("ApiSpeedList")
    public String apiSpeedListShrink;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DYXXX12H</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static AdjustPtsSceneSpeedShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustPtsSceneSpeedShrinkRequest self = new AdjustPtsSceneSpeedShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AdjustPtsSceneSpeedShrinkRequest setApiSpeedListShrink(String apiSpeedListShrink) {
        this.apiSpeedListShrink = apiSpeedListShrink;
        return this;
    }
    public String getApiSpeedListShrink() {
        return this.apiSpeedListShrink;
    }

    public AdjustPtsSceneSpeedShrinkRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
