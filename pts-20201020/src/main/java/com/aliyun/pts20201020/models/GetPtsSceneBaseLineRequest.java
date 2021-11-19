// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneBaseLineRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    public static GetPtsSceneBaseLineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneBaseLineRequest self = new GetPtsSceneBaseLineRequest();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneBaseLineRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
