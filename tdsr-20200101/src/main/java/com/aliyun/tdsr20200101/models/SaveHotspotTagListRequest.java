// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveHotspotTagListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("HotspotListJson")
    public String hotspotListJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tqwiuwetwet****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static SaveHotspotTagListRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveHotspotTagListRequest self = new SaveHotspotTagListRequest();
        return TeaModel.build(map, self);
    }

    public SaveHotspotTagListRequest setHotspotListJson(String hotspotListJson) {
        this.hotspotListJson = hotspotListJson;
        return this;
    }
    public String getHotspotListJson() {
        return this.hotspotListJson;
    }

    public SaveHotspotTagListRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
