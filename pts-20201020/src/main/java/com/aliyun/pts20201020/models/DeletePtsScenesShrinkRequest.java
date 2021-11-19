// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsScenesShrinkRequest extends TeaModel {
    @NameInMap("SceneIds")
    public String sceneIdsShrink;

    public static DeletePtsScenesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsScenesShrinkRequest self = new DeletePtsScenesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeletePtsScenesShrinkRequest setSceneIdsShrink(String sceneIdsShrink) {
        this.sceneIdsShrink = sceneIdsShrink;
        return this;
    }
    public String getSceneIdsShrink() {
        return this.sceneIdsShrink;
    }

}
