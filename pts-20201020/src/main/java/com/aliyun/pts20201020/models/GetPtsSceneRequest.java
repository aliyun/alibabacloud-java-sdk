// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneRequest extends TeaModel {
    /**
     * <p>The ID of the scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NKJBSH</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static GetPtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneRequest self = new GetPtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
