// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    public static DeletePtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsSceneRequest self = new DeletePtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public DeletePtsSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
