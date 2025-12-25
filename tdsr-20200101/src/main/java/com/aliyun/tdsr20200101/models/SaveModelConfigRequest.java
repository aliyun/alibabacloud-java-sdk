// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveModelConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iyweyteyue****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static SaveModelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveModelConfigRequest self = new SaveModelConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveModelConfigRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveModelConfigRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
