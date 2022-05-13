// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSubSceneSeqRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SortSubSceneIds")
    public java.util.List<String> sortSubSceneIds;

    public static UpdateSubSceneSeqRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubSceneSeqRequest self = new UpdateSubSceneSeqRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubSceneSeqRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateSubSceneSeqRequest setSortSubSceneIds(java.util.List<String> sortSubSceneIds) {
        this.sortSubSceneIds = sortSubSceneIds;
        return this;
    }
    public java.util.List<String> getSortSubSceneIds() {
        return this.sortSubSceneIds;
    }

}
