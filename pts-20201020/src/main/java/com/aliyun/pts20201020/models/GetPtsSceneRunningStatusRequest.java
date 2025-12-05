// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneRunningStatusRequest extends TeaModel {
    /**
     * <p>The ID of the scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NHBG6V</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static GetPtsSceneRunningStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneRunningStatusRequest self = new GetPtsSceneRunningStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneRunningStatusRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
