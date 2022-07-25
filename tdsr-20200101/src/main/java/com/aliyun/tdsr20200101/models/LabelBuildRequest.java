// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LabelBuildRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("ModelStyle")
    public String modelStyle;

    @NameInMap("OptimizeWallWidth")
    public String optimizeWallWidth;

    @NameInMap("PlanStyle")
    public String planStyle;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("WallHeight")
    public Long wallHeight;

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

    public LabelBuildRequest setModelStyle(String modelStyle) {
        this.modelStyle = modelStyle;
        return this;
    }
    public String getModelStyle() {
        return this.modelStyle;
    }

    public LabelBuildRequest setOptimizeWallWidth(String optimizeWallWidth) {
        this.optimizeWallWidth = optimizeWallWidth;
        return this;
    }
    public String getOptimizeWallWidth() {
        return this.optimizeWallWidth;
    }

    public LabelBuildRequest setPlanStyle(String planStyle) {
        this.planStyle = planStyle;
        return this;
    }
    public String getPlanStyle() {
        return this.planStyle;
    }

    public LabelBuildRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public LabelBuildRequest setWallHeight(Long wallHeight) {
        this.wallHeight = wallHeight;
        return this;
    }
    public Long getWallHeight() {
        return this.wallHeight;
    }

}
