// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LabelBuildRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>PATCH</p>
     */
    @NameInMap("ModelStyle")
    public String modelStyle;

    /**
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("OptimizeWallWidth")
    public String optimizeWallWidth;

    /**
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("PlanStyle")
    public String planStyle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
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
