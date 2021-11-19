// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsSceneBaseLineRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    public static DeletePtsSceneBaseLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsSceneBaseLineRequest self = new DeletePtsSceneBaseLineRequest();
        return TeaModel.build(map, self);
    }

    public DeletePtsSceneBaseLineRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
