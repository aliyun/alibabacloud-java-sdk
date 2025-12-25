// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveMinimapRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static SaveMinimapRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMinimapRequest self = new SaveMinimapRequest();
        return TeaModel.build(map, self);
    }

    public SaveMinimapRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveMinimapRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
