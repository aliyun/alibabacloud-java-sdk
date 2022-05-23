// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LabelBuildRequest extends TeaModel {
    // 重建模式：MANUAL：手动（云端），默认，SEMI_AUTOMATIC：半自动（移动端）
    @NameInMap("Mode")
    public String mode;

    // 模型效果 PASTER：切片模型（默认） DEPTH：深度模型 VIRTUAL：虚拟模型 MOBILE：移动重建模型
    @NameInMap("OptimizeModelEffect")
    public String optimizeModelEffect;

    // 墙宽优化，SHUTDOWN:关闭（默认） STANDARD：标准 DEPTH：深度
    @NameInMap("OptimizeWallWidth")
    public String optimizeWallWidth;

    // 户型图，DEFAULT（默认），STANDARD（标准）
    @NameInMap("PlanStyle")
    public String planStyle;

    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    // 墙高，默认0不设置，范围200-1000. 单位cm
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

    public LabelBuildRequest setOptimizeModelEffect(String optimizeModelEffect) {
        this.optimizeModelEffect = optimizeModelEffect;
        return this;
    }
    public String getOptimizeModelEffect() {
        return this.optimizeModelEffect;
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
