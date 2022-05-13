// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSubSceneSeqShrinkRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SortSubSceneIds")
    public String sortSubSceneIdsShrink;

    public static UpdateSubSceneSeqShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubSceneSeqShrinkRequest self = new UpdateSubSceneSeqShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubSceneSeqShrinkRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateSubSceneSeqShrinkRequest setSortSubSceneIdsShrink(String sortSubSceneIdsShrink) {
        this.sortSubSceneIdsShrink = sortSubSceneIdsShrink;
        return this;
    }
    public String getSortSubSceneIdsShrink() {
        return this.sortSubSceneIdsShrink;
    }

}
