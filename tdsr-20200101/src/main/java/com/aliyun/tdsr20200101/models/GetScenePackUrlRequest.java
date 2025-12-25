// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePackUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>L2omaCMmQZZkEg4p****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static GetScenePackUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenePackUrlRequest self = new GetScenePackUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetScenePackUrlRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
