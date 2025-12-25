// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishHotspotConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rteyauiiuw****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static PublishHotspotConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishHotspotConfigRequest self = new PublishHotspotConfigRequest();
        return TeaModel.build(map, self);
    }

    public PublishHotspotConfigRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
