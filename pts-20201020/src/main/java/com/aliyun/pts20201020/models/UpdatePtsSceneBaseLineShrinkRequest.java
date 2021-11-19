// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class UpdatePtsSceneBaseLineShrinkRequest extends TeaModel {
    @NameInMap("ApiBaselines")
    public String apiBaselinesShrink;

    @NameInMap("SceneBaseline")
    public String sceneBaselineShrink;

    @NameInMap("SceneId")
    public String sceneId;

    public static UpdatePtsSceneBaseLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePtsSceneBaseLineShrinkRequest self = new UpdatePtsSceneBaseLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePtsSceneBaseLineShrinkRequest setApiBaselinesShrink(String apiBaselinesShrink) {
        this.apiBaselinesShrink = apiBaselinesShrink;
        return this;
    }
    public String getApiBaselinesShrink() {
        return this.apiBaselinesShrink;
    }

    public UpdatePtsSceneBaseLineShrinkRequest setSceneBaselineShrink(String sceneBaselineShrink) {
        this.sceneBaselineShrink = sceneBaselineShrink;
        return this;
    }
    public String getSceneBaselineShrink() {
        return this.sceneBaselineShrink;
    }

    public UpdatePtsSceneBaseLineShrinkRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
