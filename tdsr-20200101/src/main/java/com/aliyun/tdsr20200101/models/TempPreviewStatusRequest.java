// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class TempPreviewStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m+0cmndEGjg9pv/hy4jh****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static TempPreviewStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        TempPreviewStatusRequest self = new TempPreviewStatusRequest();
        return TeaModel.build(map, self);
    }

    public TempPreviewStatusRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
